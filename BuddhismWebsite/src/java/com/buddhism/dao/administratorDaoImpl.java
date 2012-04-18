/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author nankonami
 */
public class administratorDaoImpl extends HibernateDaoSupport implements administratorDao
{

    @Override
    public void add(Administrator ad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getAdministrator(String adName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getAdministrator(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Administrator ad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Administrator ad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
