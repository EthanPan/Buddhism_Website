/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import java.util.List;

/**
 *
 * @author Trine
 */
public interface administratorService 
{
    public Administrator getAdministrator(String adName);
    public void setAdministrator(String adName, String adPassword, int adLevel);
    public void setAdministrator(String adName, String adPassword, String adEmail, int adLevel);
}
