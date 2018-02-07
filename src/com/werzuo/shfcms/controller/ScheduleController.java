/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.CreateSchedule;
import com.werzuo.shfcms.model.Schedule;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 *
 * @author NEOx
 */
public class ScheduleController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public Schedule getCurrentSchedule(String mid) throws SQLException, ClassNotFoundException {
        return serviceFactory.getScheduleService().getCurrentSchedule(mid);
    }

    public boolean addSchedule(CreateSchedule createSchedule) throws SQLException, ClassNotFoundException {
        return serviceFactory.getScheduleService().addSchedule(createSchedule);
    }
}
