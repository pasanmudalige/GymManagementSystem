/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Deshaa
 */
public class UserDAO {

    /**
     * add new user to database
     *
     * @param user
     * @return if user added to database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addNewUser(User user) throws SQLException, ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "INSERT INTO user VALUES(?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, user.getUid());
        stm.setObject(2, user.getName());
        stm.setObject(3, user.getPassword());
        stm.setObject(4, user.getType());
        int res = stm.executeUpdate();

        return res > 0;
    }

    /**
     * search user in database where user name
     *
     * @param name
     * @return model object
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public User searchUser(String name) throws SQLException, ClassNotFoundException {

        String sql = "Select * from user where name='" + name + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            User user = new User(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));

            return user;
        } else {

            return null;
        }

    }

    /**
     * check user in database if user exists
     *
     * @param user
     * @return if user exists
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updateUser(User user) throws SQLException, SQLException, ClassNotFoundException {

        String sql = "Update user set  type=?, password=?,uid=? where name=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, user.getUid());
        stm.setObject(2, user.getName());
        stm.setObject(3, user.getPassword());
        stm.setObject(4, user.getType());
        int res = stm.executeUpdate();

        return res > 0;
    }

    /**
     * delete user from database
     *
     * @param uid
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteUser(String name) throws SQLException, ClassNotFoundException {

        String sql = "Delete From user where name='" + name + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);

        return res > 0;
    }

    /**
     * get all users from database
     *
     * @return Users list
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<User> getAllUser() throws SQLException, ClassNotFoundException {

        String sql = "Select * From user";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<User> usersList = new ArrayList<>();
        while (rst.next()) {
            User u = new User(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
            usersList.add(u);

        }
        return usersList;

    }

}
