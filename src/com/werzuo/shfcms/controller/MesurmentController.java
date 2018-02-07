/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Measurement;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public class MesurmentController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public boolean addMesurment(Measurement measurement) {
            return false;
    }

    public Measurement searchMeasurmentByScheduleId(String schduldeID) throws ClassNotFoundException, SQLException {
        return serviceFactory.getMeasurmentService().searchMeasurementBySchedulId(schduldeID);
    }

}
