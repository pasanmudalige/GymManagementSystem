/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.PhysicalDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class PhysicalDetailsDAO {

    /**
     * Add physical data to database
     *
     * @param physicalDetails
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addPhysicalDetails(PhysicalDetails physicalDetails, Connection conn) throws SQLException,
            ClassNotFoundException {

        String sql = "INSERT INTO physicalDetails values(?,?)";
        PreparedStatement stm = conn.prepareCall(sql);

        String qNumbs = null;
        for (String qno : physicalDetails.getQuestionNo()) {
            qNumbs += qno + ",";
        }

        stm.setObject(1, physicalDetails.getCid());
        stm.setObject(2, qNumbs);

        return stm.executeUpdate() > 0;
    }

    /**
     * search and return physical details according to the physical customer ID
     *
     * @return physicalDetails
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public PhysicalDetails searchPhysicalDetails(String cid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM physicalDetails WHERE cid = ?";
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, cid);
        ResultSet rst = stm.executeQuery();

        PhysicalDetails physicalDetails = null;
        ArrayList<String> qNumbs = new ArrayList<>();
        while (rst.next()) {
            String[] qnos = rst.getString(2).split(",");
            for (int i = 0; i < qnos.length; i++) {
                qNumbs.add(qnos[i]);
            }
            physicalDetails = new PhysicalDetails(cid, qNumbs);
        }

        return physicalDetails;
    }

    /**
     * delete physical details according to the customer ID
     *
     * @param cid
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deletePhysicalDetails(String cid) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM physicalDetails WHERE cid =?";
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, cid);

        return stm.executeUpdate() > 0;
    }

    /**
     * update physical details according to the customer ID
     *
     * @param physicalDetails
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updatePhysicalDetails(PhysicalDetails physicalDetails) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE physicalDetails SET qid = ?, WHERE cid=?";
        PreparedStatement stm = conn.prepareStatement(sql);

        String qNumbs = null;
        for (String qnos : physicalDetails.getQuestionNo()) {
            qNumbs += qnos + ",";
        }

        stm.setObject(1, qNumbs);
        stm.setObject(2, physicalDetails.getCid());

        return stm.executeUpdate() > 0;
    }

}
