/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

import java.util.ArrayList;

/**
 *
 * @author Deshaa
 */
public class PhysicalDetails {

    private String cid;
    private ArrayList<String> questionNo;

    public PhysicalDetails() {
    }

    public PhysicalDetails(String cid, ArrayList<String> questionNo) {
        this.cid = cid;
        this.questionNo = questionNo;
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
     * @return the questionNo
     */
    public ArrayList<String> getQuestionNo() {
        return questionNo;
    }

    /**
     * @param questionNo the questionNo to set
     */
    public void setQuestionNo(ArrayList<String> questionNo) {
        this.questionNo = questionNo;
    }

}
