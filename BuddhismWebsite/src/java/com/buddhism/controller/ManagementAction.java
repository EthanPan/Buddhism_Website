
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Post;
import com.buddhism.service.postService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trine
 */
public class ManagementAction{
    
    private List<Post> posts = new ArrayList<Post>();
    
    private int currentIndex = 0;
    private int max = 20;

    private postService service;
    
    public String execute(){
        
        posts = service.getPage(currentIndex * max, max);

        return "SUCCESS";
    }

    public String nextPage(){
        
        currentIndex++;
        return "SUCCESS";
    }
    
    public String previousPage(){
        if(currentIndex > 0)
            currentIndex--;
        return "SUCCESS";
    }

    public postService getService() {
        return service;
    }

    public void setService(postService service) {
        this.service = service;
    }
    
    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public String getFirst(){
        if (currentIndex == 0)
            return "false";
        else
            return "true";
    }
    
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}
