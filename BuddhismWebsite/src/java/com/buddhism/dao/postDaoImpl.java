/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.model.Post;
import java.io.File;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Trine
 */
public class postDaoImpl extends HibernateDaoSupport implements postDao
{

    @Override
    public void addPost(Post post) throws Exception 
    {
        try
        {
           getHibernateTemplate().save(post); 
        }catch(Exception err)
        {
            throw err;
        }
    }

    @Override
    public Post getPost(int id) 
    {
       return (Post)getHibernateTemplate().find("from Post as p where p.id = ?", id).get(0);
    }

    @Override
    public Post getPost(String postTitle) 
    {
        return (Post)getHibernateTemplate().find("from Post as p where p.postTitle = ?", postTitle).get(0);
    }

    @Override
    public void deletePost(Post post) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getListForPage(final int offset, final int length) 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Post as p where p.postCategory > 0");
               query.setFirstResult(offset);
               query.setMaxResults(length);
               return query.list();
            }
        });
    }
    
    @Override
    public int getCount()
    {
        List list = getHibernateTemplate().find("select count(*) from Post");
        return ((Long)list.iterator().next()).intValue();
    }

    @Override
    public List<Post> getPost(final short postType, final int offset, final int length) 
    {
               return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               String hqlString = "select p from Post p where p.postCategory = " + postType + " order by p.postDate desc";
               Query query = sn.createQuery(hqlString);
               query.setFirstResult(offset);
               query.setMaxResults(length);
               return (List<Post>)query.list();
            }
        });
    }

    @Override
    public List<Post> getPostForAdministrator(final Administrator administrator, final int offset, final int length) 
    {
       //return (List<Post>)getHibernateTemplate().find("from Post p where p.administrator = ? order by p.postDate desc", administrator);
                return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException 
            {
               if(administrator.getAdLevel() == 0)
               {
                   Query query = sn.createQuery("from Post as p where p.postCategory > 0 order by p.postDate desc");
                   query.setParameter("admin", administrator);
                   query.setFirstResult(offset);
                   query.setMaxResults(length);
                   return (List<Post>)query.list();
               }else if(administrator.getAdLevel() == 1)
               {
                   Query query2 = sn.createQuery("from Post as p where p.administrator = :admin and p.postCategory > 0 order by p.postDate desc");
                   query2.setParameter("admin", administrator);
                   query2.setFirstResult(offset);
                   query2.setMaxResults(length);
                   return (List<Post>)query2.list();
               }
               
               return null;
            }
        });
    }

    @Override
    public List<Post> getPost(boolean postUp) 
    {
        return (List<Post>)getHibernateTemplate().find("from Post as p where p.postUp = ?", postUp);
    }

    @Override
    public void Update(int id, boolean update) 
    {   
        Post newPost = this.getPost(id);
        
       Session s = this.getSession();
       s.beginTransaction();
       Query query = s.createQuery("update Post p set p.postUp = "+ update + " where p.id = " + id);
       
       query.executeUpdate();
       s.getTransaction().commit();
    }

    @Override
    public int getUpPostCount() 
    {
       return this.getPost(true).size();
    }

    @Override
    public void delete(int  id) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        Post post = this.getPost(id);
        
        Session s = this.getSession();
        s.beginTransaction();
        
        Set<Media> mediaList = post.getMedias();
        Iterator it = mediaList.iterator();
        
        while(it.hasNext())
        {
            Media media = (Media)it.next();
            Query query = s.createQuery("delete from Media m where m.post = :post");
            query.setParameter("post", post);
            query.executeUpdate();
            
            //delete the dish file
            File file = new File(media.getMediaUrl());
            if(file.isFile() && file.exists())
            {
                file.delete();
            }
        }
        Query query2 = s.createQuery("delete from Post p where p.id ="+ id);
        
        query2.executeUpdate();
        s.getTransaction().commit();
    }

    @Override
    public void remove(int id) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        Post post = this.getPost(id);
        Session s = this.getSession();
        s.beginTransaction();
        
        Query query = s.createQuery("update Post p set p.postCategory="+ (-post.getPostCategory()) + "where p.id="+id);
        query.executeUpdate();
        
        s.getTransaction().commit();
    }

    @Override
    public List getListFromTrash(final Administrator administrator, final int offset, final int length) 
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException 
            {
                if(administrator.getAdLevel() == 0)
                {
                    Query query = sn.createQuery("from Post as p where p.postCategory < 0 order by p.postDate desc");
                    query.setFirstResult(offset);
                    query.setMaxResults(length);
                    return query.list();
                }else if(administrator.getAdLevel() == 1)
                {
                    Query query2 = sn.createQuery("from Post as p where p.administrator = :admin and p.postCategory < 0 order by p.postDate desc");
                    query2.setParameter("admin", administrator);
                    query2.setFirstResult(offset);
                    query2.setMaxResults(length);
                    return query2.list();
                }
                
                return null;
            }
        });
    }

    @Override
    public int getCount(int type) 
    {
        if(type == -1)
        {
            return this.getListFromTrash().size();
        }else if(type ==0)
        {
            return this.getCount();
        }else
        {
            return ((List<Post>)getHibernateTemplate().find("from Post as p where p.postCategory = ?", type)).size();
        }
    }

    @Override
    public List getListFromTrash() 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Post as p where p.postCategory < 0");
               return query.list();
            }
        });
    }
}
