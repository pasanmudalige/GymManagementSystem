/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.RegDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kaushalya
 */
public class RegDetailDAO {

    public boolean addNewRegDetail(RegDetails regDetails, Connection conn) throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO REGDETAILS VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, regDetails.getCid());
        stm.setObject(2, regDetails.getJoinDate());
        stm.setObject(3, regDetails.getExpDate());
        stm.setObject(4, regDetails.getWeight());
        stm.setObject(5, regDetails.getHeight());
        stm.setObject(6, regDetails.getRestingHr());
        stm.setObject(7, regDetails.getRestingBp());
        stm.setObject(8, regDetails.getBiceps());
        stm.setObject(9, regDetails.getTriceps());
        stm.setObject(10, regDetails.getAbs());
        stm.setObject(11, regDetails.getFat());
        stm.setObject(12, regDetails.getFatWeight());
        stm.setObject(13, regDetails.getBack());
        stm.setObject(14, regDetails.getLean());
        stm.setObject(15, regDetails.getLeanWeight());

        return stm.executeUpdate() > 0;
    }

    public RegDetails searchRegDetails(String cid) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM regdetails WHERE cid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, cid);
        ResultSet rst = stm.executeQuery();
        RegDetails rd = null;
        if (rst.next()) {
            rd = new RegDetails(rst.getString(1), rst.getString(2), rst.getString(3),
                    rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDouble(7),
                    rst.getDouble(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11),
                    rst.getDouble(12), rst.getDouble(13), rst.getDouble(14), rst.getDouble(15));
        }
        return rd;

    }

    public boolean deleteregDetails(String cid) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM regDetails WHERE cid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, cid);
        return stm.executeUpdate() > 0;

    }

    public boolean updateExercise(RegDetails regDetails) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE EXERCISE SET joinDate = ?,expDate = ?,weight =?,height =? "
                + ",restingHr =?,restingBp =?,biceps =?,triceps =?,abs =?,fat =?,"
                + "fatWeight =?,back = ?,lean =?,leanWeight =? where cid=? ";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(15, regDetails.getCid());
        stm.setObject(1, regDetails.getJoinDate());
        stm.setObject(2, regDetails.getExpDate());
        stm.setObject(3, regDetails.getWeight());
        stm.setObject(4, regDetails.getHeight());
        stm.setObject(5, regDetails.getRestingHr());
        stm.setObject(6, regDetails.getRestingBp());
        stm.setObject(7, regDetails.getBiceps());
        stm.setObject(8, regDetails.getTriceps());
        stm.setObject(9, regDetails.getAbs());
        stm.setObject(10, regDetails.getFat());
        stm.setObject(11, regDetails.getFatWeight());
        stm.setObject(12, regDetails.getBack());
        stm.setObject(13, regDetails.getLean());
        stm.setObject(14, regDetails.getLeanWeight());

        return stm.executeUpdate() > 0;

    }

    public ArrayList<RegDetails> viewAllRegDetails() throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM EXERCISE";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<RegDetails> exeList = new ArrayList<>();
        while (rst.next()) {
            RegDetails e = new RegDetails(rst.getString(1), rst.getString(2),
                    rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6),
                    rst.getDouble(7), rst.getDouble(8), rst.getDouble(9), rst.getDouble(10),
                    rst.getDouble(11), rst.getDouble(12), rst.getDouble(13), rst.getDouble(14), rst.getDouble(15));
            exeList.add(e);
        }

        return exeList;

    }
}
