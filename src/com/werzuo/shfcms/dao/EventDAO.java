/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Events;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class EventDAO {
    /**
     * This method is used to add a event to database
     * @param events
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */

    public boolean addNewEvent(Events events) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "INSERT INTO event VALUES (?,?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, events.geteId());
        stm.setObject(2, events.getDescription());
        stm.setObject(3, events.getDate());
        stm.setObject(4, events.getTime());
        stm.setObject(5, events.getPlace());
        stm.setObject(6, events.getPrice());

        int res = stm.executeUpdate();

        return res > 0;
    }
    /**
     * This method is used to search an event
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */

    public Events searchEvent(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * from event where eid = '" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            Events events = new Events(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6));
            return events;
        } else {
            return null;

        }
    }
    /**
     * This method is used to update an event if want
     * @param events
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean updateEvent(Events events) throws SQLException, ClassNotFoundException{
        String sql = "Update event set discription = ?, date=?, time=?, place = ?, price = ? where eid = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, events.getDescription());
        stm.setObject(2, events.getDate());
        stm.setObject(3, events.getTime());
        stm.setObject(4, events.getPlace());
        stm.setObject(5, events.getPrice());
        stm.setObject(6, events.geteId());
        int res = stm.executeUpdate();
        return res>0;
    }
    /**
     * This method is used to delete an event if want
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean deleteEvent(String id) throws SQLException, ClassNotFoundException{
        String sql = "Delete from event where eId = '"+ id +"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        
        return res>0;
    }
    /**
     * This method is used to take all the event list.
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Events>getAllEvents() throws SQLException, ClassNotFoundException{
        String sql = "Select * from event";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Events> eventList = new ArrayList<>();
        while (rst.next()){
            Events events = new Events(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6));
            eventList.add(events);
        }
    
        return eventList;
        
    }

}
