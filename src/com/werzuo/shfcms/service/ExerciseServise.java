/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Exercise;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class ExerciseServise {

    private DAOFactory daoFactory = new DAOFactoryImpl();

    public boolean addExercise(Exercise exercise) throws SQLException, ClassNotFoundException {
        return daoFactory.getExersiceDAO().addNewExercise(exercise);
    }

    public boolean updateExercise(Exercise exercise) throws ClassNotFoundException, SQLException {
        return daoFactory.getExersiceDAO().updateExercise(exercise);
    }

    public boolean deleteExercise(String eid) throws SQLException, ClassNotFoundException {
        return daoFactory.getExersiceDAO().deleteExercise(eid);
    }

    public Exercise searchExercise(String eid) throws SQLException, ClassNotFoundException {
        return daoFactory.getExersiceDAO().searchExercise(eid);
    }

    public Exercise searchExerciseByEid(String exercise) throws SQLException, ClassNotFoundException {
        return daoFactory.getExersiceDAO().searchbyExerciseName(exercise);
    }

    public ArrayList<Exercise> getAllExcerciseArrayList() throws SQLException, ClassNotFoundException {
        return daoFactory.getExersiceDAO().viewAllExercises();
    }

}
