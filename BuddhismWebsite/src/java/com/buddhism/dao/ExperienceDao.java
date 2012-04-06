/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Experience;

/**
 *
 * @author nankonami
 */
public interface ExperienceDao 
{
    void saveExperience(Experience experience) throws Exception;
    Experience getExperience(int id);
    Experience getExperience(String experienceTitle);
}
