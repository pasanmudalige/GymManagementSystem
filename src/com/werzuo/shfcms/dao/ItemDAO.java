/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class ItemDAO {
    /**
     * This method is used add an item
     * @param item
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean addItem(Item item)throws SQLException, ClassNotFoundException{
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "Insert into item values(?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, item.getItemId());
        stm.setObject(2, item.getItemName());
        stm.setObject(3,item.getItemQty());
        
        int res = stm.executeUpdate();
        return res > 0;
    }
    /**
     * This method is used to search an item;
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public Item searchItem(String id) throws SQLException, ClassNotFoundException{
        String sql = "Select * from item where iid = '"+id+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            Item item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3));
            return item;
        }else{
            return null;
        }
    }
    /**
     * This method is used to update an item
     * @param item
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean updateItem(Item item)throws SQLException, ClassNotFoundException{
        String sql = "Update item set name = ?, qty= ? where iid = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, item.getItemName());
        stm.setObject(2, item.getItemQty());
        stm.setObject(3, item.getItemId());
        int res = stm.executeUpdate();
        return res>0;
        
    }
    /**
     * This method is used to delete an item
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException{
        String sql = "Delete from item where iid = '"+ id +"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        
        return res>0;
    }
    /**
     * This method is used to get all the item list 
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Item>getAllItems() throws SQLException, ClassNotFoundException{
        String sql = "Select * from item";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Item> itemList = new ArrayList<>();
        while (rst.next()){
            Item item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3));
            itemList.add(item);
        }
    
        return itemList;
        
    }
}
