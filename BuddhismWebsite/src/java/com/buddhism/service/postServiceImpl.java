/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.postDaoImpl;
import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Trine
 */
public class postServiceImpl implements postService
{
    private postDaoImpl postDao;
    @Override
    public List getPage(int offset, int length) 
    {
        return getPostDao().getListForPage(offset, length);
    }

    /**
     * @return the postDao
     */
    public postDaoImpl getPostDao() {
        return postDao;
    }

    /**
     * @param postDao the postDao to set
     */
    public void setPostDao(postDaoImpl postDao) {
        this.postDao = postDao;
    }

    @Override
    public void setPost(Post post) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Post setPost(Administrator postAuthor, String postTitle, String postContent, int postCategory, boolean postMedia) throws Exception 
    {
        Post post = new Post();
        
        post.setAdministrator(postAuthor);
        post.setId(1);
        post.setPostCategory((short)postCategory);
        post.setPostClickTimes(0);
        post.setPostContent(postContent);
        post.setPostMedia(postMedia);
        post.setPostTitle(postTitle);
        Date date = new Date(System.currentTimeMillis());
        //java.sql.Date sql_Date = new java.sql.Date(date.getTime());
        post.setPostDate(date);
        
        try
        {
            //Administrator author = post.getAdministrator();
            //author.getPosts().add(post);
            postDao.addPost(post);
            return post;
        }catch(Exception err)
        {
            throw err;
        }
        
       
    }

    @Override
    public int getPostNumber() 
    {
        return postDao.getCount();
    }

    @Override
    public List<Post> getPost(short postType) 
    {   
        if(postDao == null)
        {
            postDao = new postDaoImpl();
        }
        return postDao.getPost(postType);
    }

    @Override
    public List<Post> getPostForAdministrator(final Administrator administrator, int offset, int length) 
    {
        return postDao.getPostForAdministrator(administrator, offset, length);
    }
    
}