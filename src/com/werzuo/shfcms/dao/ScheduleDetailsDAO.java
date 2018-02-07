/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.common.IDGenarator;
import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.ScheduleDetails;
import com.werzuo.shfcms.view.MemberRegPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEOx
 */
public class ScheduleDetailsDAO {

    /**
     * Insert Schedule details
     *
     * @param scheduleDetails
     * @param conn
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private String getcheduleDetailsID() throws SQLException, ClassNotFoundException {
        String newID = IDGenarator.getNewID("scheduledetails", "sdId", "SD");
        return newID;
    }

    public boolean addSheduleDetail(ScheduleDetails scheduleDetail, Connection conn) throws SQLException, ClassNotFoundException {

        String sql = "insert into scheduleDetails values(?,?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        statement.setObject(1, getcheduleDetailsID());
        statement.setObject(2, scheduleDetail.getSet());
        statement.setObject(3, scheduleDetail.getRep());
        statement.setObject(4, scheduleDetail.getScheduleId());
        statement.setObject(5, scheduleDetail.getEid());

//        System.out.println(scheduleDetail.getSdId());
//        System.out.println(scheduleDetail.getSet());
//        System.out.println(scheduleDetail.getRep());
//        System.out.println(scheduleDetail.getScheduleId());
//        System.out.println(scheduleDetail.getEid());
        int res = statement.executeUpdate();

        return res > 0;
    }

    /**
     * search schedule detail according to schedule detail Id
     *
     * @param scheduleId
     * @return scheduleDetails
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ScheduleDetails searchScheduleDetail(String scheduleDetailId) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "select * from ScheduleDetails where sdId = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, scheduleDetailId);
        ResultSet rst = statement.executeQuery();
        ScheduleDetails sch = null;

        if (rst.next()) {
            sch = new ScheduleDetails(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }

        return sch;
    }

    /**
     * Delete schedule detail according to schedule detail Id
     *
     * @param sdId
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteScheduleDetails(String sdId) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "delete from ScheduleDetails where sdId = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, sdId);

        return statement.executeUpdate() > 0;
    }

    /**
     * Update a schedule detail
     *
     * @param scheduleDetails
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updateScheduleDetails(ScheduleDetails scheduleDetails) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "update ScheduleDetails set set = ? ,rep = ?,scheduleId = ?,eid = ? where sdId=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setObject(1, scheduleDetails.getSet());
        statement.setObject(2, scheduleDetails.getRep());
        statement.setObject(3, scheduleDetails.getEid());
        statement.setObject(4, scheduleDetails.getScheduleId());
        statement.setObject(5, scheduleDetails.getSdId());

        return statement.executeUpdate() > 0;
    }

    /**
     * Return schedule's details
     *
     * @param scheduleId
     * @return ArrayList<ScheduleDetails>
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<ScheduleDetails> viewScheduleDetails(String scheduleId) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "select * from scheduledetails where scheduleId = '" + scheduleId + "'";
        Statement statement = conn.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        ArrayList<ScheduleDetails> scheduleDetailsList = new ArrayList<>();
        while (rst.next()) {
            ScheduleDetails sch = new ScheduleDetails(rst.getString(1),
                    rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            scheduleDetailsList.add(sch);
        }
        return scheduleDetailsList;
    }
}
