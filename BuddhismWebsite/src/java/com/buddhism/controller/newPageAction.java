/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Category;
import com.buddhism.model.Constants;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Trine
 */
public class newPageAction {
    
    private List<Category> cataList = new ArrayList<Category>();
    
    
    public List<Category> getCataList() {
        return cataList;
    }
    
    public void setCataList(List<Category> cataList) {
        this.cataList = cataList;
    }
    
    public String execute(){
        
        cataList.add(new Category(Constants.informs, "重要公告"));
        cataList.add(new Category(Constants.activities, "活动剪影"));
        cataList.add(new Category(Constants.associationMessage, "协会法讯"));
        cataList.add(new Category(Constants.buddleWords, "甘露教言"));
        cataList.add(new Category(Constants.eventCalendar, "行事历"));
        cataList.add(new Category(Constants.experienceShare, "经验分享"));
        cataList.add(new Category(Constants.lastestLaw, "最新法讯"));
        cataList.add(new Category(Constants.videoes, "影音专区"));
        cataList.add(new Category(Constants.wisdom, "智慧点滴"));
        
        
        return "SUCCESS";
    }
    
}