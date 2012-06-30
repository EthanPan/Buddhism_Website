/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Constants;

/**
 *
 * @author GodBlessedMay
 */
public class PostPage extends SinglePostAction{
    
    public PostPage() {
        type = Constants.informs;
        max = 3;
        currentIndex = -1;
    }
    
    @Override
    public String execute(){
        
       
        
        maxIndex = service.getPostNumber(type);
        maxPage = maxIndex / max;
            
        
        return nextPage();
    }
}
