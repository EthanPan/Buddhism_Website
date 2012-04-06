/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.User;

/**
 *
 * @author nankonami
 */
public interface UserDao 
{
    void saveUser(User user) throws Exception;
    User getUser(int id);
    User getUser(String userName);
}
