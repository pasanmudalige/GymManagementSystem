/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

/**
 *
 * @author SW96
 */
public class Measurement {

    private String mid;
    private double chest;
    private double abdomen;
    private double waist;
    private double hipsButtooks;
    private double neck;
    private double thightLeft;
    private double thightRight;
    private double armLeft;
    private double armRight;
    private double forearmLeft;
    private double forearmRight;
    private double calfLeft;
    private double calfRight;
    private String scheduleId;
    private double height;
    private double weight;

    public Measurement() {
    }

    public Measurement(String mid, double chest, double abdomen, double waist,
            double hipsButtooks, double neck, double thightLeft, double thightRight,
            double armLeft, double armRight, double forearmLeft, double forearmRight,
            double calfLeft, double calfRight, String scheduleId, double height, double weight) {
        this.mid = mid;
        this.chest = chest;
        this.abdomen = abdomen;
        this.waist = waist;
        this.hipsButtooks = hipsButtooks;
        this.neck = neck;
        this.thightLeft = thightLeft;
        this.thightRight = thightRight;
        this.armLeft = armLeft;
        this.armRight = armRight;
        this.forearmLeft = forearmLeft;
        this.forearmRight = forearmRight;
        this.calfLeft = calfLeft;
        this.calfRight = calfRight;
        this.scheduleId = scheduleId;
        this.height = height;
        this.weight = weight;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
     * @return the chest
     */
    public double getChest() {
        return chest;
    }

    /**
     * @param chest the chest to set
     */
    public void setChest(double chest) {
        this.chest = chest;
    }

    /**
     * @return the abdomen
     */
    public double getAbdomen() {
        return abdomen;
    }

    /**
     * @param abdomen the abdomen to set
     */
    public void setAbdomen(double abdomen) {
        this.abdomen = abdomen;
    }

    /**
     * @return the waist
     */
    public double getWaist() {
        return waist;
    }

    /**
     * @param waist the waist to set
     */
    public void setWaist(double waist) {
        this.waist = waist;
    }

    /**
     * @return the hipsButtooks
     */
    public double getHipsButtooks() {
        return hipsButtooks;
    }

    /**
     * @param hipsButtooks the hipsButtooks to set
     */
    public void setHipsButtooks(double hipsButtooks) {
        this.hipsButtooks = hipsButtooks;
    }

    /**
     * @return the neck
     */
    public double getNeck() {
        return neck;
    }

    /**
     * @param neck the neck to set
     */
    public void setNeck(double neck) {
        this.neck = neck;
    }

    /**
     * @return the thightLeft
     */
    public double getThightLeft() {
        return thightLeft;
    }

    /**
     * @param thightLeft the thightLeft to set
     */
    public void setThightLeft(double thightLeft) {
        this.thightLeft = thightLeft;
    }

    /**
     * @return the thightRight
     */
    public double getThightRight() {
        return thightRight;
    }

    /**
     * @param thightRight the thightRight to set
     */
    public void setThightRight(double thightRight) {
        this.thightRight = thightRight;
    }

    /**
     * @return the armLeft
     */
    public double getArmLeft() {
        return armLeft;
    }

    /**
     * @param armLeft the armLeft to set
     */
    public void setArmLeft(double armLeft) {
        this.armLeft = armLeft;
    }

    /**
     * @return the armRight
     */
    public double getArmRight() {
        return armRight;
    }

    /**
     * @param armRight the armRight to set
     */
    public void setArmRight(double armRight) {
        this.armRight = armRight;
    }

    /**
     * @return the forearmLeft
     */
    public double getForearmLeft() {
        return forearmLeft;
    }

    /**
     * @param forearmLeft the forearmLeft to set
     */
    public void setForearmLeft(double forearmLeft) {
        this.forearmLeft = forearmLeft;
    }

    /**
     * @return the forearmRight
     */
    public double getForearmRight() {
        return forearmRight;
    }

    /**
     * @param forearmRight the forearmRight to set
     */
    public void setForearmRight(double forearmRight) {
        this.forearmRight = forearmRight;
    }

    /**
     * @return the calfLeft
     */
    public double getCalfLeft() {
        return calfLeft;
    }

    /**
     * @param calfLeft the calfLeft to set
     */
    public void setCalfLeft(double calfLeft) {
        this.calfLeft = calfLeft;
    }

    /**
     * @return the calfRight
     */
    public double getCalfRight() {
        return calfRight;
    }

    /**
     * @param calfRight the calfRight to set
     */
    public void setCalfRight(double calfRight) {
        this.calfRight = calfRight;
    }

    /**
     * @param scheduleId the scheduleId to set
     */
    public void setScheduleid(String scheduleId) {
        this.scheduleId = scheduleId;
    }

}
