/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import java.util.List;

/**
 *
 * @author Trine
 */
public interface postService 
{
    public List getPage(final int offset, final int length);
    public void setPost(Post post) throws Exception;
    public Post setPost(Administrator postAuthor, String postTitle, String postContent, int postCategory, 
            boolean postMedia) throws Exception;
    public int getPostNumber();
    public List<Post> getPost(short postType);
    public List<Post> getPostForAdministrator(final Administrator administrator, final int offset, final int length);
}
