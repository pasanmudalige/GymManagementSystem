/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

import java.io.InputStream;

/**
 *
 * @author kaushalya
 */
public class ProfilePicture {
    private String mid;
    private InputStream input;
    private int length;

    public ProfilePicture() {
    }

    public ProfilePicture(String mid, InputStream input, int length) {
        this.mid = mid;
        this.input = input;
        this.length = length;
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
     * @return the input
     */
    public InputStream getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(InputStream input) {
        this.input = input;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    
}
