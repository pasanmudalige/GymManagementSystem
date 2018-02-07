/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.ProfilePicture;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;

/**
 *
 * @author kaushalya
 */
public class ProfilePictureController {
    
    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public boolean addProfilePicture(ProfilePicture p)throws SQLException, ClassNotFoundException{
        return sf.getProfilePictureService().addProfilePicture(p);
    }
    
    public boolean deleteProfilePicture(String mid)throws SQLException, ClassNotFoundException{
        return sf.getProfilePictureService().deleteProfilePicture(mid);
    }
}
