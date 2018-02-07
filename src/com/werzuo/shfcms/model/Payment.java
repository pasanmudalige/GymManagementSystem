/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author Deshaa
 */
public class Payment {

    private String pid;
    private String cid;
    private String ptId;
    private String paymentDate;

    public Payment() {
    }

    public Payment(String pid, String cid, String ptId, String paymentDate) {
        this.pid = pid;
        this.cid = cid;
        this.ptId = ptId;
        this.paymentDate = paymentDate;
    }

    public String getPtId() {
        return ptId;
    }

    public void setPtId(String ptId) {
        this.ptId = ptId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

}
