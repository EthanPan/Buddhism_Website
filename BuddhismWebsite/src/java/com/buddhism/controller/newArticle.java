/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import com.buddhism.service.administratorServiceImpl;
import com.buddhism.service.mediaServiceImpl;
import com.buddhism.service.postServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Trine
 */
public class newArticle extends ActionSupport implements SessionAware{
    
    private String title = "";
    private String content = "";
    private int articleCat;
    private File file = null;
    
    private administratorServiceImpl adService;
    private postServiceImpl postService;
    private Map session;
    private mediaServiceImpl mediaService;
    
 
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    
    
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }  
    @Override
    public String execute()
    {
        Administrator admin = (Administrator) session.get("User");
        boolean hasMedia = false;
        try 
        {
            String path = ServletActionContext.getServletContext().getRealPath("/");
            
            int times = 0;
            int index;
            
            for (index = path.length() - 1; index != -1; index--)
            {
                if (path.charAt(index) == '/' || path.charAt(index) == '\\')
                    times++;
                if (times == 3)
                    break;
            }
            
            path = path.substring(0, index);
            path += "\\web\\pics\\";
            
            File folder = new File(path);
            if (!folder.exists())
                folder.mkdir();;
        
            int length=2097152;
            if (file != null)
            {
                hasMedia = true;
                
                InputStream is = new FileInputStream(file);
                index = mediaService.getMediaNumber(true);

                path += index + ".jpg";
                File newPic = new  File(path);

                if (newPic.createNewFile())                 
                {
                    FileOutputStream out = new FileOutputStream(newPic);

                    byte[] buffer=new byte[length];

                    while(true)
                    {
                        int ins=is.read(buffer);
                        if(ins==-1)
                        {
                            is.close();
                            out.flush();
                            out.close();
                            break;
                        }
                        else
                            out.write(buffer,0,ins);
                    }
                }
            }
                Post post = postService.setPost(admin, title, content, articleCat, hasMedia, false);
                mediaService.setMedia(post, path, true);
        } catch (Exception ex) {
            Logger.getLogger(newArticle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "SUCCESS";
    }
    
    public int getArticleCat() {
        return articleCat;
    }

    public void setArticleCat(int articleCat) {
        this.articleCat = articleCat;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String cancel(){
    
        return "CANCEL  ";
    }

    /**
     * @return the adService
     */
    public administratorServiceImpl getAdService() {
        return adService;
    }

    /**
     * @param adService the adService to set
     */
    public void setAdService(administratorServiceImpl adService) {
        this.adService = adService;
    }

    /**
     * @return the postService
     */
    public postServiceImpl getPostService() {
        return postService;
    }

    /**
     * @param postService the postService to set
     */
    public void setPostService(postServiceImpl postService) {
        this.postService = postService;
    }

    /**
     * @return the mediaService
     */
    public mediaServiceImpl getMediaService() {
        return mediaService;
    }

    /**
     * @param mediaService the mediaService to set
     */
    public void setMediaService(mediaServiceImpl mediaService) {
        this.mediaService = mediaService;
    }
    
}
