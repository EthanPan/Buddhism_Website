/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Constants;
import com.buddhism.model.Post;
import com.buddhism.service.postService;
import java.util.ArrayList;
import java.util.List;



 
public class MainPageAction 
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
    
    private postService service;

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
    
        informs = service.getPost((short)Constants.informs);
        associationMessage = service.getPost((short)Constants.associationMessage);
        eventCalendar = service.getPost((short)Constants.eventCalendar);
        buddleWords = service.getPost((short)Constants.buddleWords);
        activities = service.getPost((short)Constants.activities);
        wisdom = service.getPost((short)Constants.wisdom);
        experienceShare = service.getPost((short)Constants.experienceShare);
        videoes = service.getPost((short)Constants.videoes); 
        lastestLaw = service.getPost((short)Constants.lastestLaw);
        
        return "SUCCESS";
    }
    
    
    
}
