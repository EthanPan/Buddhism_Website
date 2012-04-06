/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.BuddleWords;

/**
 *
 * @author nankonami
 */
public interface BuddleWordsDao 
{
    void saveBuddleWords(BuddleWords buddleWords) throws Exception;
    BuddleWords getBuddleWords(int id);
    BuddleWords getBuddleWords(String buddleTitle);
}
