/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.ImportantPost;

/**
 *
 * @author nankonami
 */
public interface ImportantPostDao 
{
    void savePost(ImportantPost importantPost) throws Exception;
    ImportantPost getPost(int id);
    ImportantPost getPost(String postTitle);
}
