/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Measurement;
import com.werzuo.shfcms.model.OtherMeasurement;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;

/**
 *
 * @author NEOx
 */
public class OtherMeasurementController {
    
     private ServiceFactory serviceFactory = new ServiceFactoryImpl();
     
     public OtherMeasurement searchOtherMeasurment(String cid) throws ClassNotFoundException, SQLException {
        return serviceFactory.getOtherMeasurementService().searchOtherMeasurement(cid);
    }
}
