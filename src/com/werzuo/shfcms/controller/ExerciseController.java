/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Exercise;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class ExerciseController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public boolean addExercise(Exercise exercise) throws SQLException, ClassNotFoundException {
        return serviceFactory.getExercise().addExercise(exercise);
    }

    public boolean deleteExercise(String eid) throws ClassNotFoundException, SQLException {
        return serviceFactory.getExercise().deleteExercise(eid);
    }

    public boolean updateExercise(Exercise exercise) throws ClassNotFoundException, SQLException {
        return serviceFactory.getExercise().updateExercise(exercise);
    }

    public Exercise searchExercise(String eid) throws SQLException, ClassNotFoundException {
        return serviceFactory.getExercise().searchExercise(eid);
    }

    public Exercise searchExercisebyEid(String exercise) throws SQLException, ClassNotFoundException {
        return serviceFactory.getExercise().searchExerciseByEid(exercise);
    }

    public ArrayList<Exercise> getAllExercises() throws SQLException, ClassNotFoundException {
        return serviceFactory.getExercise().getAllExcerciseArrayList();
    }
}
