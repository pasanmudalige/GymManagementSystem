/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.ScheduleDetails;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class ScheduleDetailsController {
    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

//    public boolean addScheduleDetails(ArrayList<ScheduleDetails> scheduleDetails,Connection c) throws SQLException, ClassNotFoundException {
//        return serviceFactory.getScheduleDetailsService().addScheduleDeta(scheduleDetails,c);
//    }

    public boolean deleteScheduleDetails(String sdId) throws SQLException, ClassNotFoundException {
        return serviceFactory.getScheduleDetailsService().deleteScheduleDetails(sdId);
    }

    public boolean updateScheduleDetails(ScheduleDetails scheduleDetails) throws SQLException, ClassNotFoundException {
        return serviceFactory.getScheduleDetailsService().updateScheduleId(scheduleDetails);
    }

    public ScheduleDetails searchScheduleDetails(String sdId) throws SQLException, ClassNotFoundException {
        return serviceFactory.getScheduleDetailsService().searchScheduleDetails(sdId);
    }

    public ArrayList<ScheduleDetails> getScheduleDetails(String scheduleId) throws SQLException, ClassNotFoundException {
        return serviceFactory.getScheduleDetailsService().viewScheduleDetails(scheduleId);
    }

}
