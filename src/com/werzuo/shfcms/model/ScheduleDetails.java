/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author Ulindu Anjula
 */
public class ScheduleDetails {

    private String sdId;
    private String set;
    private String rep;
    private String scheduleId;
    private String eid;

    public ScheduleDetails() {
    }

    public ScheduleDetails(String sdId, String set, String rep, String scheduleId, String eid) {
        this.sdId = sdId;
        this.set = set;
        this.rep = rep;
        this.scheduleId = scheduleId;
        this.eid = eid;
    }

    /**
     * @return the sdId
     */
    public String getSdId() {
        return sdId;
    }

    /**
     * @param sdId the sdId to set
     */
    public void setSdId(String sdId) {
        this.sdId = sdId;
    }

    /**
     * @return the set
     */
    public String getSet() {
        return set;
    }

    /**
     * @param set the set to set
     */
    public void setSet(String set) {
        this.set = set;
    }

    /**
     * @return the rep
     */
    public String getRep() {
        return rep;
    }

    /**
     * @param rep the rep to set
     */
    public void setRep(String rep) {
        this.rep = rep;
    }

    /**
     * @return the scheduleId
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * @param scheduleId the scheduleId to set
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * @return the eid
     */
    public String getEid() {
        return eid;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(String eid) {
        this.eid = eid;
    }

}
