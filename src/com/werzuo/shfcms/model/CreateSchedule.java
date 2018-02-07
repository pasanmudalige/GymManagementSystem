/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.model;

import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class CreateSchedule {

    private Measurement measurement;
    private Schedule schedule;
    private ArrayList<ScheduleDetails> scheduleDetailses;

    public CreateSchedule() {
    }

    public CreateSchedule(Measurement measurement, Schedule schedule, ArrayList<ScheduleDetails> scheduleDetailses) {
        this.measurement = measurement;
        this.schedule = schedule;
        this.scheduleDetailses = scheduleDetailses;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<ScheduleDetails> getScheduleDetailses() {
        return scheduleDetailses;
    }

    public void setScheduleDetailses(ArrayList<ScheduleDetails> scheduleDetailses) {
        this.scheduleDetailses = scheduleDetailses;
    }

}
