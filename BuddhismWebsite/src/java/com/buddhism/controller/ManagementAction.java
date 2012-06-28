
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Trine
 */
public class ManagementAction extends ActionSupport implements SessionAware{ 
    
    private List<Post> posts = new ArrayList<Post>();
    
    private int currentIndex = 0;
    private final int max = 20;
    private int maxIndex = 0;
    private int maxPage = 0;

    private Map session;
    
    private postService service;
    
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }  
    
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
    
    @Override
    public String execute(){
        
        Administrator ad = (Administrator)session.get("User");
        
        maxIndex = service.getPostNumber();
        maxPage = maxIndex % 20 - 1;
        
        if (max * currentIndex + max > maxIndex)
            posts = service.getPostForAdministrator(ad, currentIndex * max, maxIndex);
            //posts = service.getPage(currentIndex * max, maxIndex);
        else
            posts = service.getPostForAdministrator(ad, currentIndex * max, max);

        for (int i = 0; i != posts.size(); i++)
            posts.get(i).setType();
        
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
