/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controllerfactory;

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

/**
 *
 * @author NEOx
 */
public interface ControllerFactory {

    public UserController getUserController();

    public AttendanceController getAttendanceController();

    public MemberController getMemberController();

    public PaymentController getPaymentController();

    public QuestionController getQuestionController();

    public ExerciseController getExerciseController();

    public ScheduleController getScheduleController();

    public ScheduleDetailsController getScheduleDetailsController();

    public EventController getEventController();

    public BackUpController getBackUpController();

    public ItemController getItemController();

    public MesurmentController getMesurmentController();
    
    public OtherMeasurementController getOtherMeasurementController();
    
    public ProfilePictureController getProfilePictureController();

}
