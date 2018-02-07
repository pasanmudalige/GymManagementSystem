/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import java.io.IOException;

/**
 *
 * @author SW96
 */
public class BackUpService {

    public int restoreBackup(String path) throws IOException, InterruptedException {
        String[] executeCmd = new String[]{"mysql", "superherofitnesscenter", "--user=root", "--password=yes", "-e", " source " + path};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int res = runtimeProcess.waitFor();
        return res;
    }

    public int writeBackup(String path) throws IOException, InterruptedException {
        Runtime runTime = Runtime.getRuntime();
        Process runtimeProcess = runTime.exec("mysqldump superherofitnesscenter -h localhost -u root -pyes --routines=true -r" + path);
        int res = runtimeProcess.waitFor();
        return res;
    }
}
