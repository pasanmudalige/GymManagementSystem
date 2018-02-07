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
public class RegDetails {

    private String cid;
    private String joinDate;
    private String expDate;
    private double weight;
    private double height;
    private double restingHr;
    private double restingBp;
    private double biceps;
    private double triceps;
    private double abs;
    private double fat;
    private double fatWeight;
    private double back;
    private double lean;
    private double leanWeight;

    public RegDetails() {
    }

    public RegDetails(String cid, String joinDate, String expDate, double weight,
            double height, double restingHr, double restingBp, double biceps,
            double triceps, double abs, double fat, double fatWeight,
            double back, double lean, double leanWeight) {
        this.cid = cid;
        this.joinDate = joinDate;
        this.expDate = expDate;
        this.weight = weight;
        this.height = height;
        this.restingHr = restingHr;
        this.restingBp = restingBp;
        this.biceps = biceps;
        this.triceps = triceps;
        this.abs = abs;
        this.fat = fat;
        this.fatWeight = fatWeight;
        this.back = back;
        this.lean = lean;
        this.leanWeight = leanWeight;
    }

    public double getLeanWeight() {
        return leanWeight;
    }

    public void setLeanWeight(double leanWeight) {
        this.leanWeight = leanWeight;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRestingHr() {
        return restingHr;
    }

    public void setRestingHr(double restingHr) {
        this.restingHr = restingHr;
    }

    public double getRestingBp() {
        return restingBp;
    }

    public void setRestingBp(double restingBp) {
        this.restingBp = restingBp;
    }

    public double getBiceps() {
        return biceps;
    }

    public void setBiceps(double biceps) {
        this.biceps = biceps;
    }

    public double getTriceps() {
        return triceps;
    }

    public void setTriceps(double triceps) {
        this.triceps = triceps;
    }

    public double getAbs() {
        return abs;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getFatWeight() {
        return fatWeight;
    }

    public void setFatWeight(double fatWeight) {
        this.fatWeight = fatWeight;
    }

    public double getBack() {
        return back;
    }

    public void setBack(double back) {
        this.back = back;
    }

    public double getLean() {
        return lean;
    }

    public void setLean(double lean) {
        this.lean = lean;
    }

}
