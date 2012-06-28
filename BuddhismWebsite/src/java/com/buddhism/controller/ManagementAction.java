
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Category;
import com.buddhism.model.Constants;
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
    
    private List<Category> cataList = new ArrayList<Category>();
    
    private int type = 0;
    
    public List<Category> getCataList() {
        return cataList;
    }
    
    public void setCataList(List<Category> cataList) {
        this.cataList = cataList;
    }
    
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
    
    public String getByType()
    {
        currentIndex = 0;

        return "SUCCESS";
    }
    
    @Override
    public String execute(){
        
        cataList.clear();
        cataList.add(new Category(0, "所有文章"));
        cataList.add(new Category(Constants.informs, "重要公告"));
        cataList.add(new Category(Constants.activities, "活动剪影"));
        cataList.add(new Category(Constants.associationMessage, "协会法讯"));
        cataList.add(new Category(Constants.buddleWords, "甘露教言"));
        cataList.add(new Category(Constants.eventCalendar, "行事历"));
        cataList.add(new Category(Constants.experienceShare, "经验分享"));
        cataList.add(new Category(Constants.lastestLaw, "最新法讯"));
        cataList.add(new Category(Constants.videoes, "影音专区"));
        cataList.add(new Category(Constants.wisdom, "智慧点滴"));
        
        maxIndex = service.getPostNumber();
        maxPage = maxIndex / 20 + 1;
            
        
        getPost();

        
        return "SUCCESS";
    }
    
    public void getPost()
    {
        Administrator ad = (Administrator)session.get("User");
        
        if (type == 0)
        {
            if (max * currentIndex + max > maxIndex)
                posts = service.getPostForAdministrator(ad, currentIndex * max, maxIndex);
                //posts = service.getPage(currentIndex * max, maxIndex);
            else
                posts = service.getPostForAdministrator(ad, currentIndex * max, max);
        }
        else 
        {
            if (max * currentIndex + max > maxIndex)
                posts = service.getPost((short)type, currentIndex * max, maxIndex);
                //posts = service.getPage(currentIndex * max, maxIndex);
            else
                posts = service.getPost((short)type, currentIndex * max, max);
        }
        
        for (int i = 0; i != posts.size(); i++)
            posts.get(i).setType();
    }

    public String nextPage(){

        if (currentIndex != maxPage)
            currentIndex++;
        
        getPost();
        
        return "SUCCESS";
    }
    
    public String previousPage(){
        
      
        if(currentIndex > 1)
            currentIndex--;
        
        getPost();

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

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

}
