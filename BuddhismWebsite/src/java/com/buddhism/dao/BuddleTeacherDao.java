/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.BuddleTeacher;

/**
 *
 * @author nankonami
 */
public interface BuddleTeacherDao 
{
    void saveTeacher(BuddleTeacher buddleTeacher) throws Exception;
    BuddleTeacher getBuddleTeacher(int id);
    BuddleTeacher getBuddleTeacher(String teacherTitle);
    
}
