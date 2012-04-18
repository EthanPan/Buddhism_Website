package com.buddhism.model;
// Generated 2012-4-14 22:50:32 by Hibernate Tools 3.2.1.GA



/**
 * Media generated by hbm2java
 */
public class Media  implements java.io.Serializable {


     private Integer id;
     private Post post;
     private String mediaUrl;
     private boolean mediaType;

    public Media() {
    }

    public Media(Post post, String mediaUrl, boolean mediaType) {
       this.post = post;
       this.mediaUrl = mediaUrl;
       this.mediaType = mediaType;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Post getPost() {
        return this.post;
    }
    
    public void setPost(Post post) {
        this.post = post;
    }
    public String getMediaUrl() {
        return this.mediaUrl;
    }
    
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
    public boolean isMediaType() {
        return this.mediaType;
    }
    
    public void setMediaType(boolean mediaType) {
        this.mediaType = mediaType;
    }




}


