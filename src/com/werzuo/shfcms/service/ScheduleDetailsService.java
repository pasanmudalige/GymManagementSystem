/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.ScheduleDetails;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class ScheduleDetailsService {

    private DAOFactory factory = new DAOFactoryImpl();
//
//    public boolean addScheduleDetail(ArrayList<ScheduleDetails> scheduleDetails,Connection c) throws SQLException, ClassNotFoundException {
//        return factory.getScheduleDetailsDAO().addSheduleDetail(scheduleDetails,c);
//    }

    public ScheduleDetails searchScheduleDetails(String sdId) throws SQLException, ClassNotFoundException {
        return factory.getScheduleDetailsDAO().searchScheduleDetail(sdId);
    }

    public boolean deleteScheduleDetails(String sdId) throws SQLException, ClassNotFoundException {
        return factory.getScheduleDetailsDAO().deleteScheduleDetails(sdId);
    }

    public ArrayList<ScheduleDetails> viewScheduleDetails(String scheduleId) throws SQLException, ClassNotFoundException {
        return factory.getScheduleDetailsDAO().viewScheduleDetails(scheduleId);
    }

    public boolean updateScheduleId(ScheduleDetails scheduleDetails) throws SQLException, ClassNotFoundException {
        return factory.getScheduleDetailsDAO().updateScheduleDetails(scheduleDetails);
    }
}
