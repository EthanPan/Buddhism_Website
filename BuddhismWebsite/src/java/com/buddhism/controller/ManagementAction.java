
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Post;
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

    public String execute(){
    
        return "SUCCESS";
    }

    public void nextPage(){
        currentIndex++;
    }
    
    public void previousPage(){
        if(currentIndex > 0)
            currentIndex--;
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
