/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Item;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class ItemService {
    private DAOFactory dAOFactory = new DAOFactoryImpl();
   
    public boolean addItem(Item item) throws SQLException,ClassNotFoundException{
        return dAOFactory.getItemDAO().addItem(item);
    }

    public Item searchItem(String id)throws SQLException, ClassNotFoundException{
        return dAOFactory.getItemDAO().searchItem(id);
    }

    public boolean deleteItem(String id)throws SQLException, ClassNotFoundException{
        return dAOFactory.getItemDAO().deleteItem(id);
    }
    public boolean updateItem(Item item)throws SQLException, ClassNotFoundException{
        return dAOFactory.getItemDAO().updateItem(item);
    }
    public ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException{
        return dAOFactory.getItemDAO().getAllItems();
    }
}
