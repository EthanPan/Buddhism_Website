/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.service.administratorServiceImpl;

/**
 *
 * @author Trine
 */
public class LogIn {
    
    private String userName;
    private String password;
    private administratorServiceImpl administratorService;

    public administratorServiceImpl getAdministratorService() {
        return administratorService;
    }

    public void setAdministratorService(administratorServiceImpl administratorService) {
        this.administratorService = administratorService;
    }
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String execute()
    {
        Administrator ad = getAdministratorService().getAdministrator(userName);
        if(ad != null)
        {
            if(password.equals(ad.getAdPassword()))
            {
                return "SUCCESS";
            }
        }
        return "INPUT";
    }
}
