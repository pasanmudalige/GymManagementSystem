/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.ProfilePicture;
import java.sql.SQLException;

/**
 *
 * @author kaushalya
 */
public class ProfilePictureService {
    
    private DAOFactory df = new DAOFactoryImpl();
    
    public boolean addProfilePicture(ProfilePicture p)throws SQLException, ClassNotFoundException {
        return df.getProfilePictureDAO().addProfilePicture(p);
    }
    
    public boolean deleteProfilePicture(String mid)throws SQLException, ClassNotFoundException {
        return df.getProfilePictureDAO().deleteProfilePicture(mid);
    }
}
