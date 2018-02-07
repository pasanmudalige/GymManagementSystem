/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author IJSE
 */
public class PaymentArrears {

    private String pid;
    private String cid;
    private double arrears;

    public PaymentArrears() {
    }

    public PaymentArrears(String pid, String cid, double arrears) {
        this.pid = pid;
        this.cid = cid;
        this.arrears = arrears;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return the arrears
     */
    public double getArrears() {
        return arrears;
    }

    /**
     * @param arrears the arrears to set
     */
    public void setArrears(double arrears) {
        this.arrears = arrears;
    }

}
