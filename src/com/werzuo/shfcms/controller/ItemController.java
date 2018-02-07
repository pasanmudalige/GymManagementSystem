/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Item;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class ItemController {
    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public boolean addItem(Item item) throws SQLException, ClassNotFoundException {
        return serviceFactory.getItemService().addItem(item);
    }

    public Item SearchItem(String id) throws SQLException, ClassNotFoundException {
        return serviceFactory.getItemService().searchItem(id);
    }

    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException {
        return serviceFactory.getItemService().deleteItem(id);
    }

    public boolean updateItem(Item item) throws SQLException, ClassNotFoundException {
        return serviceFactory.getItemService().updateItem(item);
    }

    public ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException {
        return serviceFactory.getItemService().getAllItems();
    }
}
