/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.User;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class UserService {

    private DAOFactory daoFactory = new DAOFactoryImpl();

    public boolean addUser(User user) throws SQLException, ClassNotFoundException {
        return daoFactory.getUserDAO().addNewUser(user);
    }

    public User searchUser(String userName) throws SQLException, ClassNotFoundException {
        return daoFactory.getUserDAO().searchUser(userName);
    }

    public boolean deleteUser(String userName) throws SQLException, ClassNotFoundException {
        return daoFactory.getUserDAO().deleteUser(userName);
    }

    public boolean UpdateUser(User user) throws SQLException, ClassNotFoundException {
        return daoFactory.getUserDAO().updateUser(user);
    }

    public ArrayList<User> getAllUser() throws SQLException, ClassNotFoundException {
        return daoFactory.getUserDAO().getAllUser();
    }

    /**
     * check user name and password
     *
     * @param userName
     * @param password
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean checkUserLogin(String userName, String password)
            throws SQLException, ClassNotFoundException {
        
        ArrayList<User> allUser = daoFactory.getUserDAO().getAllUser();
        for (User user : allUser) {
            if (user.getName().equalsIgnoreCase(userName) && user.getPassword().equals(password)) {
                return true;
            }
        }
        
        return false;
    }

    /**
     * check username is already taken
     *
     * @param userName
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean checkUserName(String userName)
            throws SQLException, ClassNotFoundException {
        
        ArrayList<User> allUser = daoFactory.getUserDAO().getAllUser();
        for (User user : allUser) {
            if (user.getName().equalsIgnoreCase(userName)) {
                return true;
            }
        }
        
        return false;
    }
}
