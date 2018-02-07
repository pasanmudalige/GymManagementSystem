/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tempijsjdjlksjdjsdoijdijsidjsjdsidjtheiosjhgtshsjhkjhsddddhuduwidiwjdiuduydwywdwuyduwdywudyuywuydwudyuwdylate in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author Ravindu
 */
public class Exercise {

    private String eid;
    private String description;

    public Exercise() {
    }

    public Exercise(String eid, String description) {
        this.eid = eid;
        this.description = description;
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

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
