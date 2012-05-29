/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Constants;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletResponseAware;

/**
 *
 * @author Trine
 */
public class UpAndDownAction extends ActionSupport implements ServletResponseAware{
    
    private String title;
    private boolean isUp;

    private postService service;
    
    private HttpServletResponse response;

    public postService getService() {
        return service;
    }

    public void setService(postService service) {
        this.service = service;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIsUp() {
        return isUp;
    }

    public void setIsUp(boolean isUp) {
        this.isUp = isUp;
    }
    
    
    
    public UpAndDownAction() {
    }
    
    @Override
    public String execute() throws Exception {
        
       response.setCharacterEncoding("GBK"); 
       PrintWriter out = response.getWriter();
        
       int number = service.getUpPostNumber();
       if (number == Constants.maxMainPagePics && isUp == true)
       {
           out.print("<script>alert(\"已经有5篇文章置于首页了\")</script>");
           out.print("<script>window.location.href=\'managementAction.action\'</script>");
           out.flush();
           out.close();
           return null;
       }
       else
       {
           service.UpdatePost(title, isUp);
       }
       
       return "SUCCESS";
    }

    @Override
    public void setServletResponse(HttpServletResponse hsr) {
        response = hsr;
    }
}
