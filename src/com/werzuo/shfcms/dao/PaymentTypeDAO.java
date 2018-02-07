/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.PaymentType;
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
public class PaymentTypeDAO {

    /**
     * mark the paymentType of the customer
     *
     * @param paymentType
     * @return if add the paymentType correctly
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addPaymentType(PaymentType paymentType) throws SQLException,
            ClassNotFoundException {

        String sql = "INSERT INTO PaymentType VALUES(?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1, paymentType.getPtId());
        stm.setObject(2, paymentType.getType());
        stm.setObject(3, paymentType.getFee());

        int res = stm.executeUpdate();

        return res > 0;
    }

    /**
     * find the customer's paymentTypes
     *
     * @param ptId
     * @return the all paymentTypes of the customer
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public PaymentType searchPaymentType(String ptId) throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM PaymentType WHERE ptId='" + ptId + "'";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        PaymentType paymentType = null;
        while (rst.next()) {
            paymentType = new PaymentType(rst.getString(1),
                    rst.getString(2), rst.getDouble(3));
        }
        return paymentType;
    }
    
    public PaymentType searchPaymentTypeByType(String type) throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM PaymentType WHERE type='" + type + "'";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        PaymentType paymentType = null;
        while (rst.next()) {
            paymentType = new PaymentType(rst.getString(1),
                    rst.getString(2), rst.getDouble(3));
        }
        return paymentType;
    }

    /**
     * update the customer's paymentType
     *
     * @param paymentType
     * @return if successfully update the paymentType
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updatePaymentType(PaymentType paymentType) throws SQLException,
            ClassNotFoundException {

        String sql = "Update PaymentType set type=?, fee=? where ptId=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(3, paymentType.getPtId());
        stm.setObject(1, paymentType.getType());
        stm.setObject(2, paymentType.getFee());

        int res = stm.executeUpdate();

        return res > 0;

    }

    /**
     * this is for get all paymentType of all customers
     *
     * @return paymentTypes
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<PaymentType> viewAllPaymentType() throws SQLException,
            ClassNotFoundException {

        String sql = "SELECT * FROM PaymentType";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentType> paymentTypeList = new ArrayList<>();
        while (rst.next()) {
            PaymentType paymentType = new PaymentType(rst.getString(1),
                    rst.getString(2), rst.getDouble(3));
            paymentTypeList.add(paymentType);
        }

        return paymentTypeList;
    }

    /**
     * delete the customer's paymentType
     *
     * @param ptId
     * @return if delete the customer
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deletePaymentType(String ptId) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM PaymentType WHERE aid=?";
        PreparedStatement stm = conn.prepareStatement(ptId);
        stm.setObject(1, ptId);

        return stm.executeUpdate() > 0;
    }
}
