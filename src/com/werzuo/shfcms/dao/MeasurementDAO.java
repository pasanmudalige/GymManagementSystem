/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Measurement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ulindu Anjula
 */
public class MeasurementDAO {

    /**
     *
     * @param measurement
     * @param conn
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean addMeasurement(Measurement measurement, Connection conn) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO measurement VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, measurement.getMid());
        stm.setObject(2, measurement.getChest());
        stm.setObject(3, measurement.getAbdomen());
        stm.setObject(4, measurement.getWaist());
        stm.setObject(5, measurement.getHipsButtooks());
        stm.setObject(6, measurement.getNeck());
        stm.setObject(7, measurement.getThightLeft());
        stm.setObject(8, measurement.getThightRight());
        stm.setObject(9, measurement.getArmLeft());
        stm.setObject(10, measurement.getArmRight());
        stm.setObject(11, measurement.getForearmLeft());
        stm.setObject(12, measurement.getForearmRight());
        stm.setObject(13, measurement.getCalfLeft());
        stm.setObject(14, measurement.getCalfRight());
        stm.setObject(15, measurement.getScheduleId());
        stm.setObject(16, measurement.getHeight());
        stm.setObject(17, measurement.getWeight());

//        System.out.println(measurement.getMid());
//        System.out.println(measurement.getChest());
//        System.out.println(measurement.getAbdomen());
//        System.out.println(measurement.getWaist());
//        System.out.println(measurement.getHipsButtooks());
//        System.out.println(measurement.getNeck());
//       System.out.println(measurement.getThightLeft());
//        System.out.println(measurement.getThightRight());
//        System.out.println(measurement.getArmLeft());
//        System.out.println(measurement.getArmRight());
//        System.out.println(measurement.getForearmLeft());
//        System.out.println(measurement.getForearmRight());
//        System.out.println(measurement.getCalfLeft());
//        System.out.println(measurement.getCalfRight());
//        System.out.println(measurement.getScheduleid());
//        System.out.println(measurement.getHeight());
//        System.out.println(measurement.getWeight());

        int res = stm.executeUpdate();
        return res > 0;
    }

    /**
     *
     * @param mid
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Measurement searchMeasurement(String mid) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM measurement WHERE MID = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, mid);
        ResultSet set = stm.executeQuery();
        Measurement measurement = null;
        if (set.next()) {
            measurement = new Measurement(set.getString(1), set.getDouble(2),
                    set.getDouble(3), set.getDouble(4), set.getDouble(5),
                    set.getDouble(6), set.getDouble(7), set.getDouble(8),
                    set.getDouble(9), set.getDouble(10), set.getDouble(11),
                    set.getDouble(12), set.getDouble(13), set.getDouble(14), set.getString(15),
                    set.getDouble(16), set.getDouble(17));
        }
        return measurement;
    }

    public Measurement searchMeasurementBySchduleId(String schduleId) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM measurement WHERE scheduleid = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, schduleId);
        ResultSet set = stm.executeQuery();
        Measurement measurement = null;
        if (set.next()) {
            measurement = new Measurement(set.getString(1), set.getDouble(2),
                    set.getDouble(3), set.getDouble(4), set.getDouble(5),
                    set.getDouble(6), set.getDouble(7), set.getDouble(8),
                    set.getDouble(9), set.getDouble(10), set.getDouble(11),
                    set.getDouble(12), set.getDouble(13), set.getDouble(14), set.getString(15),
                    set.getDouble(16), set.getDouble(17));
        }
        return measurement;
    }

    /**
     *
     * @param mid
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean deleteMeasurement(String mid) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM measurement WHERE MID = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, mid);
        return stm.executeUpdate() > 0;
    }

    /**
     *
     * @param measurement
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean updateMeasurement(Measurement measurement) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE measurement SET  chest = ? , abdomen = ? , waist = ? , hipsButtooks = ? , neck = ? , thightLeft = ? , thightRight = ? , armLeft = ? , armRight = ? , forearmLeft = ? , forearmRight =? , calfLeft = ? , calfRight = ? , scheduleId = ? WHERE mid = ? ";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(15, measurement.getMid());
        stm.setObject(1, measurement.getChest());
        stm.setObject(2, measurement.getAbdomen());
        stm.setObject(3, measurement.getWaist());
        stm.setObject(4, measurement.getHipsButtooks());
        stm.setObject(5, measurement.getNeck());
        stm.setObject(6, measurement.getThightLeft());
        stm.setObject(7, measurement.getThightRight());
        stm.setObject(8, measurement.getArmLeft());
        stm.setObject(9, measurement.getArmRight());
        stm.setObject(10, measurement.getForearmLeft());
        stm.setObject(11, measurement.getForearmRight());
        stm.setObject(12, measurement.getCalfLeft());
        stm.setObject(13, measurement.getCalfRight());
        stm.setObject(14, measurement.getScheduleId());
        return stm.executeUpdate() > 0;
    }

}
