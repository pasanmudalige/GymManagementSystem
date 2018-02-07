/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

import java.util.ArrayList;

/**
 *
 * @author SW96
 */
public class OtherMeasurement {

    private String mid;
    private String sitReach;
    private double shoulder;
    private String curlUpEndurance;
    private String pushUpEndurance;
    private ArrayList<String> goals;

    public OtherMeasurement() {
    }

    public OtherMeasurement(String mid, String sitReach, double shoulder, String curlUpEndurance, String pushUpEndurance, ArrayList<String> goals) {
        this.mid = mid;
        this.sitReach = sitReach;
        this.shoulder = shoulder;
        this.curlUpEndurance = curlUpEndurance;
        this.pushUpEndurance = pushUpEndurance;
        this.goals = goals;
    }

    /**
     * @return the mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * @param mid the mid to set
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * @return the sitReach
     */
    public String getSitReach() {
        return sitReach;
    }

    /**
     * @param sitReach the sitReach to set
     */
    public void setSitReach(String sitReach) {
        this.sitReach = sitReach;
    }

    /**
     * @return the shoulder
     */
    public double getShoulder() {
        return shoulder;
    }

    /**
     * @param shoulder the shoulder to set
     */
    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }

    /**
     * @return the curlUpEndurance
     */
    public String getCurlUpEndurance() {
        return curlUpEndurance;
    }

    /**
     * @param curlUpEndurance the curlUpEndurance to set
     */
    public void setCurlUpEndurance(String curlUpEndurance) {
        this.curlUpEndurance = curlUpEndurance;
    }

    /**
     * @return the pushUpEndurance
     */
    public String getPushUpEndurance() {
        return pushUpEndurance;
    }

    /**
     * @param pushUpEndurance the pushUpEndurance to set
     */
    public void setPushUpEndurance(String pushUpEndurance) {
        this.pushUpEndurance = pushUpEndurance;
    }

    /**
     * @return the goals
     */
    public ArrayList<String> getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(ArrayList<String> goals) {
        this.goals = goals;
    }

    
    
}
