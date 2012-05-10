/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.administratorDaoImpl;
import com.buddhism.model.Administrator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trine
 */
public class administratorServiceImpl implements administratorService
{   
    private administratorDaoImpl adDao;

    @Override
    public Administrator getAdministrator(String adName) 
    {
        return getAdDao().getAdministrator(adName);
    }

    @Override
    public void setAdministrator(String adName, String adPassword, int adLevel) 
    {
        Administrator administrator = new Administrator();
        administrator.setId((short)1);
        administrator.setAdName(adName);
        administrator.setAdEmail(null);
        administrator.setAdLevel(adLevel);
        administrator.setAdPassword(adPassword);
        
        try {
            adDao.add(administrator);
        } catch (Exception ex) {
            Logger.getLogger(administratorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    /**
     * @return the adDao
     */
    public administratorDaoImpl getAdDao() {
        return adDao;
    }

    /**
     * @param adDao the adDao to set
     */
    public void setAdDao(administratorDaoImpl adDao) {
        this.adDao = adDao;
    }

    @Override
    public void setAdministrator(String adName, String adPassword, String adEmail, int adLevel) 
    {
        Administrator administrator = new Administrator();
        administrator.setId((short)1);
        administrator.setAdName(adName);
        administrator.setAdEmail(adEmail);
        administrator.setAdLevel(adLevel);
        administrator.setAdPassword(adPassword);
        
        try {
            adDao.add(administrator
                    );
        } catch (Exception ex) {
            Logger.getLogger(administratorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
