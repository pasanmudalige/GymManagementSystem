/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author robin
 */
public class Item {
    private String itemId;
    private String itemName;
    private double itemQty;

    public Item() {
    }

    public Item(String itemId, String itemName, double itemQty) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQty = itemQty;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemQty
     */
    public double getItemQty() {
        return itemQty;
    }

    /**
     * @param itemQty the itemQty to set
     */
    public void setItemQty(double itemQty) {
        this.itemQty = itemQty;
    }

    
    
    
}
