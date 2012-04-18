/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.administratorDao;
import com.buddhism.model.Administrator;

/**
 *
 * @author Trine
 */
public class administratorServiceImpl implements administratorService
{   
    private administratorDao adDao;

    public administratorDao getAdDao() 
    {
        return adDao;
    }

    public void setAdDao(administratorDao adDao) 
    {
        this.adDao = adDao;
    }
    @Override
    public Administrator getAdministrator(String adName) 
    {
        return adDao.getAdministrator(adName);
    }
}
