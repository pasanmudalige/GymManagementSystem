/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.CreateSchedule;
import com.werzuo.shfcms.model.Schedule;
import com.werzuo.shfcms.model.ScheduleDetails;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author NEOx
 */
public class ScheduleService {

    private DAOFactory dAOFactory = new DAOFactoryImpl();

    public Schedule getCurrentSchedule(String mid) throws SQLException, ClassNotFoundException {
        ArrayList<Schedule> allSchedules = dAOFactory.getScheduleDAO().viewAllSchedules();

        ArrayList<Schedule> memberSchedule = new ArrayList();
        for (Schedule allSchedule : allSchedules) {
            if (allSchedule.getCid().equalsIgnoreCase(mid)) {
                memberSchedule.add(allSchedule);
            }
        }

        ArrayList<String> schNo = new ArrayList<>();
        for (Schedule memberSch : memberSchedule) {
            schNo.add(memberSch.getSheduleNumber());
        }
        Collections.sort(schNo);

        if ((schNo.size() - 1) >= 0) {
            return memberSchedule.get(schNo.size() - 1);
        } else {
            return null;
        }
    }

    public boolean addSchedule(CreateSchedule createSchedule) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        Savepoint save = connection.setSavepoint("Saved");

        boolean addShedule = dAOFactory.getScheduleDAO().addShedule(createSchedule.getSchedule(), connection);
        boolean allDetailsAdded = false;
        boolean addNewRegDetail = false;
        boolean addedAll = false;
        int scheduleDetilsCount = 0;
        int length = createSchedule.getScheduleDetailses().size();

        if (addShedule) {
            for (ScheduleDetails sd : createSchedule.getScheduleDetailses()) {
                boolean add = dAOFactory.getScheduleDetailsDAO().addSheduleDetail(sd, connection);
                if (!add) {
                    allDetailsAdded = false;
                    break;
                } else {
                    scheduleDetilsCount++;
                }
                if (length == scheduleDetilsCount) {
                    allDetailsAdded = true;
                }
            }
            if (allDetailsAdded) {
                addNewRegDetail = dAOFactory.getMeasurementDAO().addMeasurement(createSchedule.getMeasurement(), connection);
            }
        }

        if (addShedule && allDetailsAdded && addNewRegDetail) {
            addedAll = true;
        }

        if (addedAll) {
            connection.commit();
        } else {
            connection.rollback(save);
        }

        return addedAll;
    }
}
