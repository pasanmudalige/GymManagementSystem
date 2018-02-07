/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.io.IOException;

/**
 *
 * @author SW96
 */
public class BackUpController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public int restoreBackup(String path) throws IOException, InterruptedException {
        return serviceFactory.getBackUpService().restoreBackup(path);
    }

    public int writeBackup(String path) throws IOException, InterruptedException {
        return serviceFactory.getBackUpService().writeBackup(path);
    }

}
