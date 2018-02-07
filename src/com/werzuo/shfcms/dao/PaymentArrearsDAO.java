/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.PaymentArrears;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author IJSE
 */
public class PaymentArrearsDAO {

    /**
     *
     * @param arrears
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addNewPaymentArrears(PaymentArrears arrears) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "INSERT INTO ARREARS VALUES(?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, arrears.getPid());
        stm.setObject(2, arrears.getCid());
        stm.setObject(3, arrears.getArrears());
        return stm.executeUpdate() > 0;
    }

    /**
     *
     * @param pid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public PaymentArrears searchPaymentArrears(String pid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM ARREARS WHERE pid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, pid);
        ResultSet rst = stm.executeQuery();
        PaymentArrears arrears = null;
        if (rst.next()) {
            arrears = new PaymentArrears(rst.getString(1), rst.getString(2), rst.getDouble(3));
        }
        return arrears;

    }

    /**
     *
     * @param pid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deletePaymentArrears(String pid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM ARREARS WHERE pid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, pid);
        return stm.executeUpdate() > 0;

    }

    /**
     *
     * @param paymentArrears
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updatePaymentArrears(PaymentArrears paymentArrears) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE ARREARS SET cid = ?,arrears=? where pid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, paymentArrears.getCid());
        stm.setObject(2, paymentArrears.getArrears());
        stm.setObject(3, paymentArrears.getPid());
        return stm.executeUpdate() > 0;

    }

    /**
     *
     * @return @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<PaymentArrears> viewAllPaymentsArrears() throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM ARREARS";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<PaymentArrears> paymentList = new ArrayList<>();
        while (rst.next()) {
            PaymentArrears paymentArrears = new PaymentArrears(rst.getString(1), rst.getString(2), rst.getDouble(3));
            paymentList.add(paymentArrears);
        }
        return paymentList;

    }

    public ArrayList<PaymentArrears> viewAllPaymentsArrearsByCid(String cid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM ARREARS WHERE cid = '" + cid + "'";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<PaymentArrears> paymentList = new ArrayList<>();
        while (rst.next()) {
            PaymentArrears paymentArrears = new PaymentArrears(rst.getString(1), rst.getString(2), rst.getDouble(3));
            paymentList.add(paymentArrears);
        }
        return paymentList;

    }
}
