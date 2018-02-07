/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author Ravindu
 */
public class Attendance {

    private String aid;
    private String cid;
    private String date;
    private String inTime;
    private String outTime;
    private String officeIncharge;

    public Attendance() {
    }

    public Attendance(String aid, String cid, String date, String inTime, String outTime, String officeIncharge) {
        this.aid = aid;
        this.cid = cid;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.officeIncharge = officeIncharge;
    }

    /**
     * @return the aid
     */
    public String getAid() {
        return aid;
    }

    /**
     * @param aid the aid to set
     */
    public void setAid(String aid) {
        this.aid = aid;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the inTime
     */
    public String getInTime() {
        return inTime;
    }

    /**
     * @param inTime the inTime to set
     */
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    /**
     * @return the outTime
     */
    public String getOutTime() {
        return outTime;
    }

    /**
     * @param outTime the outTime to set
     */
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    /**
     * @return the officeIncharge
     */
    public String getOfficeIncharge() {
        return officeIncharge;
    }

    /**
     * @param officeIncharge the officeIncharge to set
     */
    public void setOfficeIncharge(String officeIncharge) {
        this.officeIncharge = officeIncharge;
    }

}
