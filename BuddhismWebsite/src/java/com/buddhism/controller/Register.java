/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.service.administratorService;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Trine
 */
public class Register extends ActionSupport {
    
    private String userName;
    private String password;
    private String passwordAck;
    private administratorService service;

    public administratorService getService() {
        return service;
    }

    public void setService(administratorService service) {
        this.service = service;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAck() {
        return passwordAck;
    }

    public void setPasswordAck(String passwordAck) {
        this.passwordAck = passwordAck;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Register() {
    }
    
    @Override
    public String execute() throws Exception {
        
        if (userName.length() == 0 || password.length() == 0 || passwordAck.length() == 0)
            return "INPUT";
        
        if (!password.equals(passwordAck))
            return "INPUT";
        
        service.setAdministrator(userName, password, 0);
        
        return "SUCCESS";
    }
    
    public String cancel(){
        
        return "CANCEL";
    }
}
