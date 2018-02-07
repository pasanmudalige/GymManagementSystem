/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Attendance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SW96
 */
public class AttendanceDAO {

    /**
     * mark the attendance of the customer
     *
     * @param attendance
     * @return if marked the attendance correctly
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addAttendence(Attendance attendance) throws SQLException,
            ClassNotFoundException {

        String sql = "INSERT INTO Attendance VALUES(?,?,?,?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1, attendance.getAid());
        stm.setObject(2, attendance.getCid());
        stm.setObject(3, attendance.getDate());
        stm.setObject(4, attendance.getInTime());
        stm.setObject(5, attendance.getOutTime());
        stm.setObject(6, attendance.getOfficeIncharge());

        int res = stm.executeUpdate();

        return res > 0;
    }

    /**
     * find the customer's attendances
     *
     * @param aid
     * @return the all attendances of the customer
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Attendance> searchAttendance(String aid) throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM Attendance WHERE aid='" + aid + "'";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        ArrayList<Attendance> attendanceList = new ArrayList<>();
        while (rst.next()) {
            Attendance attendance = new Attendance(rst.getString(1),
                    rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),
                    rst.getString(6));
            attendanceList.add(attendance);
        }

        return attendanceList;
    }

    /**
     * find the customer's attendances
     *
     * @param aid
     * @return the all attendances of the customer
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Attendance> searchDailyAttendance(String date) throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM Attendance WHERE date='" + date + "'";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        ArrayList<Attendance> attendanceList = new ArrayList<>();
        while (rst.next()) {
            Attendance attendance = new Attendance(rst.getString(1),
                    rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),
                    rst.getString(6));
            attendanceList.add(attendance);
            System.out.println(attendance);
        }

        return attendanceList;
    }

    /**
     * update the customer's attendance
     *
     * @param attendance
     * @return if successfully update the attendance
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updateAttendance(Attendance attendance) throws SQLException,
            ClassNotFoundException {

        String sql = "Update Attendance set  outTime=?  where aid=? AND date=?";
        
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, attendance.getOutTime());
        stm.setObject(2, attendance.getAid());
        stm.setObject(3, attendance.getDate());
        int res = stm.executeUpdate();
       
        return res > 0;
        
    }

    /**
     * this is for get all attendance of all customers
     *
     * @return attendances
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Attendance> viewAllAttendance() throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM Attendance";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<Attendance> attendanceList = new ArrayList<>();
        while (rst.next()) {
            Attendance attendance = new Attendance(rst.getString(1),
                    rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),
                    rst.getString(6));
            attendanceList.add(attendance);
        }

        return attendanceList;
    }

    /**
     * delete the customer's attendance
     *
     * @param aid
     * @return if delete the customer
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteAttendance(String aid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM Attendance WHERE aid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, aid);

        return stm.executeUpdate() > 0;
    }

}
