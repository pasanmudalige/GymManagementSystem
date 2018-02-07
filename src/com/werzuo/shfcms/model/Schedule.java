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
public class Schedule {

    private String scheduleID;
    private String SheduleNumber;
    private String startDate;
    private String endDate;
    private String cid;

    /**
     * @return the scheduleID
     */
    public Schedule() {
    }

    public Schedule(String scheduleID, String SheduleNumber, String startDate,
            String endDate, String cid) {
        this.scheduleID = scheduleID;
        this.SheduleNumber = SheduleNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cid = cid;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    /**
     * @param scheduleID the scheduleID to set
     */
    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    /**
     * @return the SheduleNumber
     */
    public String getSheduleNumber() {
        return SheduleNumber;
    }

    /**
     * @param SheduleNumber the SheduleNumber to set
     */
    public void setSheduleNumber(String SheduleNumber) {
        this.SheduleNumber = SheduleNumber;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
}
