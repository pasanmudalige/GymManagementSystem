/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.User;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class UserController {
    private ServiceFactory serviceFactory = new ServiceFactoryImpl();
    
    public boolean addUser(User user) throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().addUser(user);
    }
    
    public User searchUser(String userName) throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().searchUser(userName);
    }
    
    public boolean deleteUser(String userName) throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().deleteUser(userName);
    }
    
    public boolean updateUser(User user) throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().UpdateUser(user);
    }
    
    public ArrayList<User> getAllUser() throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().getAllUser();
    }
    
    public boolean checkUserLogin(String userName,String pass) throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().checkUserLogin(userName, pass);
    }
    
    public boolean checkUserName(String userName) throws SQLException, ClassNotFoundException{
        return serviceFactory.getUserService().checkUserName(userName);
    }
}
