/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Measurement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public class MeasurmentService {

    private DAOFactory daoFactory = new DAOFactoryImpl();

    public boolean addMessurment(Measurement measurement, Connection c) throws ClassNotFoundException, SQLException {
        return daoFactory.getMeasurementDAO().addMeasurement(measurement, c);
    }

    public Measurement searchMeasurementBySchedulId(String memberID) throws ClassNotFoundException, SQLException {
        return daoFactory.getMeasurementDAO().searchMeasurementBySchduleId(memberID);

    }

}
