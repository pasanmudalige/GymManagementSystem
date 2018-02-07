/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.OtherMeasurement;
import java.sql.SQLException;

/**
 *
 * @author NEOx
 */
public class OtherMeasurementService {
    
    private DAOFactory dAOFactory = new DAOFactoryImpl();
    
    public OtherMeasurement searchOtherMeasurement(String cid) throws SQLException, ClassNotFoundException {
        return dAOFactory.getOtherMeasurementDAO().searchotherMeasurement(cid);
    }
}
