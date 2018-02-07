/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Attendance;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SW96
 */
public class AttendanceController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public boolean addAttendance(Attendance attendance) throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().addAttendance(attendance);
    }

    public ArrayList<Attendance> searchAttendance(String attendanceId) throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().searchAttendance(attendanceId);
    }

    public ArrayList<Attendance> searchDailyAttendance(String date) throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().searchDailyAttendance(date);
    }

    public boolean deleteAttendance(String attendanceId) throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().deleteAttendance(attendanceId);
    }

    public boolean updateAttendance(Attendance attendance) throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().UpdateAttendance(attendance);
    }

    public ArrayList<Attendance> getAllAttendance() throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().getAllAttendance();
    }
    
    public ArrayList<Attendance> getOngoingMembers(String curDate) throws SQLException, ClassNotFoundException {
        return serviceFactory.getAttendanceService().getOngoingMembers(curDate);
    }

}
