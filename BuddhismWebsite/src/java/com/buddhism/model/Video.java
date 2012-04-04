/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Trine
 */
public class Video {
    private int index;
    private int clickTimes;
    
    private Date date;
    
    private String title;
    
    private List<String> songTitle;
    private List<String> videoUrl;
    private List<String> imageUrl;

    public int getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(int clickTimes) {
        this.clickTimes = clickTimes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<String> getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(List<String> songTitle) {
        this.songTitle = songTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(List<String> videoUrl) {
        this.videoUrl = videoUrl;
    }
    
    
}
