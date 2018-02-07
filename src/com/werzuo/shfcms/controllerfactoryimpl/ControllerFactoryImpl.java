/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controllerfactoryimpl;

import com.werzuo.shfcms.controller.AttendanceController;
import com.werzuo.shfcms.controller.BackUpController;
import com.werzuo.shfcms.controller.EventController;
import com.werzuo.shfcms.controller.ExerciseController;
import com.werzuo.shfcms.controller.ItemController;
import com.werzuo.shfcms.controller.MemberController;
import com.werzuo.shfcms.controller.MesurmentController;
import com.werzuo.shfcms.controller.OtherMeasurementController;
import com.werzuo.shfcms.controller.PaymentController;
import com.werzuo.shfcms.controller.ProfilePictureController;
import com.werzuo.shfcms.controller.QuestionController;
import com.werzuo.shfcms.controller.ScheduleController;
import com.werzuo.shfcms.controller.ScheduleDetailsController;
import com.werzuo.shfcms.controller.UserController;
import com.werzuo.shfcms.controllerfactory.ControllerFactory;

/**
 *
 * @author NEOx
 */
public class ControllerFactoryImpl implements ControllerFactory {

    @Override
    public UserController getUserController() {
        return new UserController();
    }

    @Override
    public AttendanceController getAttendanceController() {
        return new AttendanceController();
    }

    @Override
    public MemberController getMemberController() {
        return new MemberController();
    }

    @Override
    public PaymentController getPaymentController() {
        return new PaymentController();
    }

    @Override
    public QuestionController getQuestionController() {
        return new QuestionController();
    }

    @Override
    public ExerciseController getExerciseController() {
        return new ExerciseController();
    }

    @Override
    public ScheduleController getScheduleController() {
        return new ScheduleController();
    }

    @Override
    public ScheduleDetailsController getScheduleDetailsController() {
        return new ScheduleDetailsController();
    }

    @Override
    public EventController getEventController() {
        return new EventController();
    }

    @Override
    public BackUpController getBackUpController() {
        return new BackUpController();
    }

    @Override
    public ItemController getItemController() {
        return new ItemController();
    }

    @Override
    public MesurmentController getMesurmentController() {
        return new MesurmentController();
    }

    @Override
    public OtherMeasurementController getOtherMeasurementController() {
       return new OtherMeasurementController();
    }

    @Override
    public ProfilePictureController getProfilePictureController() {
        return new ProfilePictureController();
    }

}
