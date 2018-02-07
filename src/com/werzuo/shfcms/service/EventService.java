/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Events;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class EventService {
    private DAOFactory dAOFactory = new DAOFactoryImpl();
   
    public boolean addEvents(Events events) throws SQLException,ClassNotFoundException{
        return dAOFactory.getEventDAO().addNewEvent(events);
    }

    public Events searchEvent(String id)throws SQLException, ClassNotFoundException{
        return dAOFactory.getEventDAO().searchEvent(id);
    }

    public boolean deleteEvent(String id)throws SQLException, ClassNotFoundException{
        return dAOFactory.getEventDAO().deleteEvent(id);
    }
    public boolean updateEvent(Events events)throws SQLException, ClassNotFoundException{
        return dAOFactory.getEventDAO().updateEvent(events);
    }
    public ArrayList<Events> getAllEvents() throws SQLException, ClassNotFoundException{
        return dAOFactory.getEventDAO().getAllEvents();
    }
    public ArrayList<Events> setToTextFields(String id) throws SQLException, ClassNotFoundException{
        ArrayList<Events> allEvents = dAOFactory.getEventDAO().getAllEvents();
        ArrayList<Events> all = new ArrayList<>();
        for (Events events : allEvents) {
            if (events.geteId().equals(id)) {
                all.add(events);
            }
        }
        return all;
    }
}
