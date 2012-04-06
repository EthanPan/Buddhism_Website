/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.EventCalendar;

/**
 *
 * @author nankonami
 */
public interface EventCalendarDao 
{
    void saveEvent(EventCalendar event) throws Exception;
    EventCalendar getEvent(int id);
    EventCalendar getEvent(String eventTitle);
}
