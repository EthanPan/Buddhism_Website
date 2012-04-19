/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.postDaoImpl;
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
    
}
