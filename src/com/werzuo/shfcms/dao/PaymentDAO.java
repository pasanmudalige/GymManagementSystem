/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Payment;
//import com.werzuo.shfcms.model.Exercise;
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
public class PaymentDAO {

    /**
     * This method is designed to add new Payment
     *
     * @param payment
     * @param conn
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addNewPayment(Payment payment, Connection conn) throws SQLException,
            ClassNotFoundException {

        String sql = "INSERT INTO PAYMENT VALUES(?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, payment.getPid());
        stm.setObject(2, payment.getCid());
        stm.setObject(3, payment.getPtId());
        stm.setObject(4, payment.getPaymentDate());
        return stm.executeUpdate() > 0;
    }

    /**
     * This method is designed to search a payment
     *
     * @param pid
     * @return Payment
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Payment searchPayment(String pid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM PAYMENT WHERE pid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, pid);
        ResultSet rst = stm.executeQuery();
        Payment payment = null;
        if (rst.next()) {
            payment = new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
        }
        return payment;

    }

    /**
     *
     * @param cid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Payment searchPaymentByCid(String cid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM PAYMENT WHERE cid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, cid);
        ResultSet rst = stm.executeQuery();
        Payment payment = null;
        if (rst.next()) {
            payment = new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
        }
        return payment;

    }

    /**
     * This method is designed to delete a Payment
     *
     * @param pid
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deletePayment(String pid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM PAYMENT WHERE pid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, pid);
        return stm.executeUpdate() > 0;

    }

    /**
     * This method is designed to update a Payment
     *
     * @param payment
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updatePayment(Payment payment) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE PAYMENT SET cid=? ,ptid=?,paymentDate =? where pid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, payment.getCid());
        stm.setObject(2, payment.getPtId());
        stm.setObject(3, payment.getPaymentDate());
        stm.setObject(4, payment.getPid());
        return stm.executeUpdate() > 0;

    }

    /**
     * This method is designed to get all Payments
     *
     * @return ArrayList<Payemnt>
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Payment> viewAllPayments() throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM PAYMENT";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Payment> paymentList = new ArrayList<>();
        while (rst.next()) {
            Payment payment = new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
            paymentList.add(payment);
        }
        return paymentList;

    }
}
