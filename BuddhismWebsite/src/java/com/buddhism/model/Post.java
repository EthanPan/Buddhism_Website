package com.buddhism.model;
// Generated 2012-7-1 3:41:49 by Hibernate Tools 3.2.1.GA


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
     private short postCategory;
     private boolean postMedia;
     private boolean postUp;
     private int postTop;
     private String type;
     private Set<Media> medias = new HashSet<Media>(0);

    public Post() {
    }

	
    public Post(Administrator administrator, Date postDate, String postTitle, String postContent, int postClickTimes, short postCategory, boolean postMedia, boolean postUp, int postTop) {
        this.administrator = administrator;
        this.postDate = postDate;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postClickTimes = postClickTimes;
        this.postCategory = postCategory;
        this.postMedia = postMedia;
        this.postUp = postUp;
        this.postTop = postTop;
    }
    public Post(Administrator administrator, Date postDate, String postTitle, String postContent, int postClickTimes, short postCategory, boolean postMedia, boolean postUp, int postTop, Set<Media> medias) {
       this.administrator = administrator;
       this.postDate = postDate;
       this.postTitle = postTitle;
       this.postContent = postContent;
       this.postClickTimes = postClickTimes;
       this.postCategory = postCategory;
       this.postMedia = postMedia;
       this.postUp = postUp;
       this.postTop = postTop;
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
    public short getPostCategory() {
        return this.postCategory;
    }
    
    public void setPostCategory(short postCategory) {
        this.postCategory = postCategory;
    }
    public boolean isPostMedia() {
        return this.postMedia;
    }
    
    public void setPostMedia(boolean postMedia) {
        this.postMedia = postMedia;
    }
    public boolean isPostUp() {
        return this.postUp;
    }
    
    public void setPostUp(boolean postUp) {
        this.postUp = postUp;
    }
    public int getPostTop() {
        return this.postTop;
    }
    
    public void setPostTop(int postTop) {
        this.postTop = postTop;
    }
    public Set<Media> getMedias() {
        return this.medias;
    }
    
    public void setMedias(Set<Media> medias) {
        this.medias = medias;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType() 
    {
        type = Constants.type[postCategory];
    }




}


