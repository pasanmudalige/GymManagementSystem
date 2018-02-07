/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Events;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class EventController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public boolean addEvent(Events events) throws SQLException, ClassNotFoundException {
        return serviceFactory.getEventService().addEvents(events);
    }

    public Events SearchEvent(String id) throws SQLException, ClassNotFoundException {
        return serviceFactory.getEventService().searchEvent(id);
    }

    public boolean deleteEvent(String id) throws SQLException, ClassNotFoundException {
        return serviceFactory.getEventService().deleteEvent(id);
    }

    public boolean updateEvent(Events events) throws SQLException, ClassNotFoundException {
        return serviceFactory.getEventService().updateEvent(events);
    }

    public ArrayList<Events> getAllEvents() throws SQLException, ClassNotFoundException {
        return serviceFactory.getEventService().getAllEvents();
    }
    public ArrayList<Events> setToTextFields(String id) throws SQLException, ClassNotFoundException{
        return serviceFactory.getEventService().setToTextFields(id);
    }
}
