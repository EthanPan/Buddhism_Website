
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
    private final int max = 20;
    private int maxIndex = 0;
    private int maxPage = 0;

    private postService service;
    
    
    
    public ManagementAction()
    {

    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }
    
    public String execute(){

        maxIndex = service.getPostNumber();
        maxPage = maxIndex % 20 - 1;
        
        if (max * currentIndex + max > maxIndex)
            posts = service.getPage(currentIndex * max, maxIndex);
        else
            posts = service.getPage(currentIndex * max, max);

        return "SUCCESS";
    }

    public String nextPage(){

        
        if (currentIndex != maxPage)
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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}
