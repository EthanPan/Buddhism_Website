package com.buddhism.model;
// Generated 2012-5-11 11:26:00 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Post generated by hbm2java
 */
public class Post  implements java.io.Serializable {


     private Integer id;
     private Administrator administrator;
     private Date postDate;
     private String postTitle;
     private String postContent;
     private int postClickTimes;
     private int postCategory;
     private boolean postMedia;
     private boolean postUp;
     private Set<Media> medias = new HashSet<Media>(0);

    public Post() {
    }

	
    public Post(Administrator administrator, Date postDate, String postTitle, String postContent, int postClickTimes, int postCategory, boolean postMedia) {
        this.administrator = administrator;
        this.postDate = postDate;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postClickTimes = postClickTimes;
        this.postCategory = postCategory;
        this.postMedia = postMedia;
    }
    public Post(Administrator administrator, Date postDate, String postTitle, String postContent, int postClickTimes, int postCategory, boolean postMedia, Set<Media> medias) {
       this.administrator = administrator;
       this.postDate = postDate;
       this.postTitle = postTitle;
       this.postContent = postContent;
       this.postClickTimes = postClickTimes;
       this.postCategory = postCategory;
       this.postMedia = postMedia;
       this.medias = medias;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Administrator getAdministrator() {
        return this.administrator;
    }
    
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    public Date getPostDate() {
        return this.postDate;
    }
    
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    public String getPostTitle() {
        return this.postTitle;
    }
    
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    public String getPostContent() {
        return this.postContent;
    }
    
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
    public int getPostClickTimes() {
        return this.postClickTimes;
    }
    
    public void setPostClickTimes(int postClickTimes) {
        this.postClickTimes = postClickTimes;
    }
    public int getPostCategory() {
        return this.postCategory;
    }
    
    public void setPostCategory(int postCategory) {
        this.postCategory = postCategory;
    }
    public boolean isPostMedia() {
        return this.postMedia;
    }
    
    public void setPostMedia(boolean postMedia) {
        this.postMedia = postMedia;
    }
    public Set<Media> getMedias() {
        return this.medias;
    }
    
    public void setMedias(Set<Media> medias) {
        this.medias = medias;
    }

    /**
     * @return the postUp
     */
    public boolean isPostUp() {
        return postUp;
    }

    /**
     * @param postUp the postUp to set
     */
    public void setPostUp(boolean postUp) {
        this.postUp = postUp;
    }




}


