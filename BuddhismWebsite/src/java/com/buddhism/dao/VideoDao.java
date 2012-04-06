/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Video;

/**
 *
 * @author nankonami
 */
public interface VideoDao 
{
    void saveVideo(Video video) throws Exception;
    Video getVideo(int id);
    Video getVideo(String videoTitle);
}
