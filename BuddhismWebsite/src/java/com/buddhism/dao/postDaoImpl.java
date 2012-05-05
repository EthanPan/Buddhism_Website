/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Post;
import java.sql.SQLException;
import java.util.List;
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
    public Post getPost(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Post getPost(String postTitle) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deletePost(Post post) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getListForPage(final int offset, final int length) 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Post as p");
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
    public List<Post> getPost(final short postType) 
    {
         return  getHibernateTemplate().find("from Post as p");
    }
}
