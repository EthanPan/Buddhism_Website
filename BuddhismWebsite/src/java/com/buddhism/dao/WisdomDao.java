/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Wisdom;

/**
 *
 * @author nankonami
 */
public interface WisdomDao 
{
    void saveWisdomDao(Wisdom wisdom) throws Exception;
    Wisdom getWisdom(int id);
    Wisdom getWisdom(String wisTitle);
}
