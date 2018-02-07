/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Attendance;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SW96
 */
public class AttendanceService {

    private DAOFactory daoFactory = new DAOFactoryImpl();

    public boolean addAttendance(Attendance attendance) throws SQLException, ClassNotFoundException {
        return daoFactory.getAttendanceDAO().addAttendence(attendance);
    }

    public ArrayList<Attendance> searchAttendance(String attendance) throws SQLException, ClassNotFoundException {
        return daoFactory.getAttendanceDAO().searchAttendance(attendance);
    }

    public ArrayList<Attendance> searchDailyAttendance(String attendance) throws SQLException, ClassNotFoundException {
        return daoFactory.getAttendanceDAO().searchDailyAttendance(attendance);
    }

    public boolean deleteAttendance(String attendance) throws SQLException, ClassNotFoundException {
        return daoFactory.getAttendanceDAO().deleteAttendance(attendance);
    }

    public boolean UpdateAttendance(Attendance attendance) throws SQLException, ClassNotFoundException {
        return daoFactory.getAttendanceDAO().updateAttendance(attendance);
    }

    public ArrayList<Attendance> getAllAttendance() throws SQLException, ClassNotFoundException {
        return daoFactory.getAttendanceDAO().viewAllAttendance();
    }

    public ArrayList<Attendance> getOngoingMembers(String curDate) throws SQLException, ClassNotFoundException {
        ArrayList<Attendance> viewAllAttendance = daoFactory.getAttendanceDAO().viewAllAttendance();
        ArrayList<Attendance> ongoingMembers = new ArrayList<>();
        for (Attendance member : viewAllAttendance) {
            if ((member.getDate().equalsIgnoreCase(curDate))
                    && (member.getOutTime() == null)) {
                ongoingMembers.add(member);
            }

        }
        return ongoingMembers;
    }
}
