/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Constants;
import com.buddhism.model.PicturePost;
import com.buddhism.model.Post;
import com.buddhism.service.postService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;



 
public class MainPageAction implements SessionAware
{
    private List<Post> informs = new ArrayList<Post>();
    private List<Post> associationMessage = new ArrayList<Post>();
    private List<Post> eventCalendar = new ArrayList<Post>();
    private List<Post> buddleWords = new ArrayList<Post>();
    private List<Post> activities = new ArrayList<Post>();
    private List<Post> lastestLaw = new ArrayList<Post>();
    private List<Post> wisdom = new ArrayList<Post>();
    private List<Post> experienceShare = new ArrayList<Post>();
    private List<Post> videoes = new ArrayList<Post>();
    private List<PicturePost> pictures = new ArrayList<PicturePost>();
    
    private postService service;

    
    private Map session;   
  
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }    
    
    public List<PicturePost> getPictures() {
        return pictures;
    }

    public void setPictures(List<PicturePost> pictures) {
        this.pictures = pictures;
    }

    
    
    public List<Post> getActivities() {
        return activities;
    }

    public void setActivities(List<Post> activities) {
        this.activities = activities;
    }

    public List<Post> getAssociationMessage() {
        return associationMessage;
    }

    public void setAssociationMessage(List<Post> associationMessage) {
        this.associationMessage = associationMessage;
    }

    public List<Post> getBuddleWords() {
        return buddleWords;
    }

    public void setBuddleWords(List<Post> buddleWords) {
        this.buddleWords = buddleWords;
    }

    public List<Post> getEventCalendar() {
        return eventCalendar;
    }

    public void setEventCalendar(List<Post> eventCalendar) {
        this.eventCalendar = eventCalendar;
    }

    public List<Post> getExperienceShare() {
        return experienceShare;
    }

    public void setExperienceShare(List<Post> experienceShare) {
        this.experienceShare = experienceShare;
    }

    public List<Post> getInforms() {
        return informs;
    }

    public void setInforms(List<Post> informs) {
        this.informs = informs;
    }

    public List<Post> getLastestLaw() {
        return lastestLaw;
    }

    public void setLastestLaw(List<Post> lastestLaw) {
        this.lastestLaw = lastestLaw;
    }

    public postService getService() {
        return service;
    }

    public void setService(postService service) {
        this.service = service;
    }

    public List<Post> getVideoes() {
        return videoes;
    }

    public void setVideoes(List<Post> videoes) {
        this.videoes = videoes;
    }

    public List<Post> getWisdom() {
        return wisdom;
    }

    public void setWisdom(List<Post> wisdom) {
        this.wisdom = wisdom;
    }
    
    
    
    public String execute(){
    
        session.remove("pictures");
        
        informs = service.getPost((short)Constants.informs, 1, 5);
        associationMessage = service.getPost((short)Constants.associationMessage, 1, 5);
        eventCalendar = service.getPost((short)Constants.eventCalendar, 1, 5);
        buddleWords = service.getPost((short)Constants.buddleWords, 1, 5);
        activities = service.getPost((short)Constants.activities, 1, 5);
        wisdom = service.getPost((short)Constants.wisdom, 1, 5);
        experienceShare = service.getPost((short)Constants.experienceShare, 1, 5);
        videoes = service.getPost((short)Constants.videoes, 1, 5); 
        lastestLaw = service.getPost((short)Constants.lastestLaw, 1, 5);
        List<Post> temp = service.getPost();
        
        for (int i = 0; i != temp.size(); i++)
        {
            PicturePost picturePost = new PicturePost(temp.get(i));
            pictures.add(picturePost);
        }
        
        session.put("pictures", pictures);
        
        
        
        return "SUCCESS";
    }
    
    
    
}
