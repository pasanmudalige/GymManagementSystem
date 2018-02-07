/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.ProfilePicture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kaushalya
 */
public class ProfilePictureDAO {
    /**
     * this is designed to add a profile pic
     * @param profilePic
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean addProfilePicture(ProfilePicture profilePic) throws SQLException,
            ClassNotFoundException {

        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement("insert into ProfilePicture values(?,?)");
        stm.setObject(1, profilePic.getMid());
        stm.setBinaryStream(2, profilePic.getInput(), profilePic.getLength());
        int res = stm.executeUpdate();
        return res > 0;
    }
    public boolean deleteProfilePicture(String mid)throws SQLException,ClassNotFoundException{
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement("DELETE from ProfilePicture where mid='" + mid + "'");
        return stm.executeUpdate() > 0;
        
    }
}
