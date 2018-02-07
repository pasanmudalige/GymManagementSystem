/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Schedule;
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
public class ScheduleDAO {

    /**
     * This method is used to add a new Schedule
     *
     * @param schedule
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addShedule(Schedule schedule, Connection conn) throws SQLException, ClassNotFoundException {

        String sql = "insert into schedule values(?,?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, schedule.getScheduleID());
        statement.setObject(2, schedule.getSheduleNumber());
        statement.setObject(3, schedule.getStartDate());
        statement.setObject(4, schedule.getEndDate());
        statement.setObject(5, schedule.getCid());

        int res = statement.executeUpdate();
        return res > 0;
    }

    /**
     * This method is used to search a Schedule
     *
     * @param sid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Schedule searchSchedule(String sid) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "select * from Schedule where scheduleId = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, sid);
        ResultSet rst = statement.executeQuery();
        Schedule she = null;
        if (rst.next()) {
            she = new Schedule(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return she;
    }

    /**
     * This method is used to delete a schedule
     *
     * @param sid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteSchedule(String sid) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "delete from Schedule where scheduleId = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, sid);
        return statement.executeUpdate() > 0;

    }

    /**
     * This method is used to update a schedule
     *
     * @param schedule
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updateSchedule(Schedule schedule) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "update Schedule set scheduleNumber = ? ,startDate = ?,endDate = ?,cid = ? where scheduleId=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, schedule.getSheduleNumber());
        statement.setObject(2, schedule.getStartDate());
        statement.setObject(3, schedule.getEndDate());
        statement.setObject(4, schedule.getCid());
        statement.setObject(5, schedule.getScheduleID());

        return statement.executeUpdate() > 0;

    }

    /**
     * This method is used to view all Schedule
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Schedule> viewAllSchedules() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "select * from Schedule";
        Statement statement = conn.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        ArrayList<Schedule> scheduleList = new ArrayList<>();
        while (rst.next()) {
            Schedule sch = new Schedule(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            scheduleList.add(sch);
        }
        return scheduleList;
    }

}
