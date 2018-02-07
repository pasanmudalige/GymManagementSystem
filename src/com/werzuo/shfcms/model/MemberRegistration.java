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
public class MemberRegistration {

    private RegDetails regDetails;
    private Member member;
    private OtherMeasurement otherMeasurement;
    private PhysicalDetails physicalDetails;
    private Payment payment;

    public MemberRegistration() {
    }

    public MemberRegistration(RegDetails regDetails, Member member, OtherMeasurement otherMeasurement, PhysicalDetails physicalDetails, Payment payment) {
        this.regDetails = regDetails;
        this.member = member;
        this.otherMeasurement = otherMeasurement;
        this.physicalDetails = physicalDetails;
        this.payment = payment;
    }

    /**
     * @return the regDetails
     */
    public RegDetails getRegDetails() {
        return regDetails;
    }

    /**
     * @param regDetails the regDetails to set
     */
    public void setRegDetails(RegDetails regDetails) {
        this.regDetails = regDetails;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the otherMeasurement
     */
    public OtherMeasurement getOtherMeasurement() {
        return otherMeasurement;
    }

    /**
     * @param otherMeasurement the otherMeasurement to set
     */
    public void setOtherMeasurement(OtherMeasurement otherMeasurement) {
        this.otherMeasurement = otherMeasurement;
    }

    /**
     * @return the physicalDetails
     */
    public PhysicalDetails getPhysicalDetails() {
        return physicalDetails;
    }

    /**
     * @param physicalDetails the physicalDetails to set
     */
    public void setPhysicalDetails(PhysicalDetails physicalDetails) {
        this.physicalDetails = physicalDetails;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
