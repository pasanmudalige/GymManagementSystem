/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Attendance;
import com.werzuo.shfcms.model.OtherMeasurement;
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
public class OtherMeasurementDAO {
    /**
     * this method is designed to add a other measurement
     * @param otherMeasurement
     * @param conn
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
     public boolean addOtherMeasurement(OtherMeasurement otherMeasurement,Connection conn) throws SQLException,
            ClassNotFoundException {

        String sql = "INSERT INTO OtherMeasurement VALUES(?,?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, otherMeasurement.getMid());
        stm.setObject(2, otherMeasurement.getSitReach());
        stm.setObject(3, otherMeasurement.getShoulder());
        stm.setObject(4, otherMeasurement.getCurlUpEndurance());
        stm.setObject(5, otherMeasurement.getPushUpEndurance());
        
        String goals="";
         for (String gol : otherMeasurement.getGoals()) {
             goals+=gol+",";
         }
        stm.setObject(6, goals);

        int res = stm.executeUpdate();

        return res > 0;
    }
     /**
      * this method is designed to search otherDetails
      * @param cid
      * @return
      * @throws SQLException
      * @throws ClassNotFoundException 
      */
     public OtherMeasurement searchotherMeasurement(String cid) throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM Othermeasurement WHERE cid='" + cid + "'";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        OtherMeasurement otherMeasurement = null;
        while (rst.next()) {
            String [] goals = rst.getString(6).split(",");
            ArrayList<String> allGoals = new ArrayList<>();
            for (String allGoal : goals) {
                allGoals.add(allGoal);
            }
            
            otherMeasurement = new OtherMeasurement(rst.getString(1), rst.getString(2),
                    rst.getDouble(3), rst.getString(4), rst.getString(5), allGoals);
            
        }

        return otherMeasurement;
    }
     /**
      * this method is designed to update a other measurement
      * @param otherMeasurement
      * @return
      * @throws SQLException
      * @throws ClassNotFoundException 
      */
    public boolean updateOtherMeasurement(OtherMeasurement otherMeasurement) throws SQLException,
            ClassNotFoundException {

        String sql = "Update Othermeasurement set sitReach=?,shoulder=?, curlupemdurance=?, pushupendurance=?, "
                + "goals=? where cid=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);

       
        stm.setObject(1, otherMeasurement.getSitReach());
        stm.setObject(2, otherMeasurement.getShoulder());
        stm.setObject(3, otherMeasurement.getCurlUpEndurance());
        stm.setObject(4, otherMeasurement.getPushUpEndurance());
        
        String goals="";
         for (String gol : otherMeasurement.getGoals()) {
             goals+=gol+",";
         }
        stm.setObject(5, goals);
        stm.setObject(6, otherMeasurement.getMid());

        int res = stm.executeUpdate();

        return res > 0;

    }
    
    /**
     * this is designed to view all other measurements
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<OtherMeasurement> viewAllOtherMeasurementsment() throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM OtherMeasurement";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<OtherMeasurement> otherMeasurementList = new ArrayList<>();
        while (rst.next()) {
            String [] goals = rst.getString(6).split(",");
            ArrayList<String> allGoals = new ArrayList<>();
            for (String allGoal : goals) {
                allGoals.add(allGoal);
            }
            
            OtherMeasurement otherMeasurement = new OtherMeasurement(rst.getString(1), rst.getString(2),
                    rst.getDouble(3), rst.getString(4), rst.getString(5), allGoals);
            otherMeasurementList.add(otherMeasurement);
        }

        return otherMeasurementList;
    }
    
    /**
     * this is designed to delete a other measurement
     * @param cid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
     public boolean deleteOtherMeasurement(String cid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM OtherMeasurement WHERE cid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, cid);

        return stm.executeUpdate() > 0;
    }
    
}
