package com.buddhism.model;
// Generated 2012-4-18 15:13:24 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Administrator generated by hbm2java
 */
public class Administrator  implements java.io.Serializable {


     private Short id;
     private String adName;
     private String adPassword;
     private String adEmail;
     private int adLevel;
     private Set<Post> posts = new HashSet<Post>(0);

    public Administrator() {
    }

	
    public Administrator(String adName, String adPassword, int adLevel) {
        this.adName = adName;
        this.adPassword = adPassword;
        this.adLevel = adLevel;
    }
    public Administrator(String adName, String adPassword, String adEmail, int adLevel, Set<Post> posts) {
       this.adName = adName;
       this.adPassword = adPassword;
       this.adEmail = adEmail;
       this.adLevel = adLevel;
       this.posts = posts;
    }
   
    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }
    public String getAdName() {
        return this.adName;
    }
    
    public void setAdName(String adName) {
        this.adName = adName;
    }
    public String getAdPassword() {
        return this.adPassword;
    }
    
    public void setAdPassword(String adPassword) {
        this.adPassword = adPassword;
    }
    public String getAdEmail() {
        return this.adEmail;
    }
    
    public void setAdEmail(String adEmail) {
        this.adEmail = adEmail;
    }
    public int getAdLevel() {
        return this.adLevel;
    }
    
    public void setAdLevel(int adLevel) {
        this.adLevel = adLevel;
    }
    public Set<Post> getPosts() {
        return this.posts;
    }
    
    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}


