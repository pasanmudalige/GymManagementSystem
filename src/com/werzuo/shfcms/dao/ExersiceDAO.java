/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Exercise;
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
public class ExersiceDAO {

    /**
     * This method is designed to add new Exercise
     *
     * @param exe
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addNewExercise(Exercise exercise) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "INSERT INTO EXERCISE VALUES(?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, exercise.getEid());
        stm.setObject(2, exercise.getDescription());
        return stm.executeUpdate() > 0;
    }

    /**
     * This method is designed to search a Exercise
     *
     * @param eid
     * @return Exercise
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Exercise searchExercise(String eid) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM EXERCISE WHERE eid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, eid);
        ResultSet rst = stm.executeQuery();
        Exercise exe = null;
        if (rst.next()) {
            exe = new Exercise(rst.getString(1), rst.getString(2));
        }
        return exe;

    }

    public Exercise searchbyExerciseName(String exersicse) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM EXERCISE WHERE description=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, exersicse);
        ResultSet rst = stm.executeQuery();
        Exercise exe = null;
        if (rst.next()) {
            exe = new Exercise(rst.getString(1), rst.getString(2));
        }
        return exe;

    }

    /**
     * This method is designed to delete a Exercise
     *
     * @param eid
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteExercise(String eid) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM EXERCISE WHERE eid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, eid);
        return stm.executeUpdate() > 0;

    }

    /**
     * This method is designed to update a Exercise
     *
     * @param e
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updateExercise(Exercise exercise) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE EXERCISE SET description=? where eid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, exercise.getDescription());
        stm.setObject(2, exercise.getEid());
        return stm.executeUpdate() > 0;

    }

    /**
     * This method is Designed to get All Exercises
     *
     * @return ArrayList<Exercise>
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Exercise> viewAllExercises() throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM EXERCISE";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Exercise> exeList = new ArrayList<>();
        while (rst.next()) {
            Exercise e = new Exercise(rst.getString(1), rst.getString(2));
            exeList.add(e);
        }
        return exeList;

    }
}
