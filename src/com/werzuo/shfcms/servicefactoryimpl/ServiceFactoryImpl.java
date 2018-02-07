/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.servicefactoryimpl;

import com.werzuo.shfcms.service.AttendanceService;
import com.werzuo.shfcms.service.BackUpService;
import com.werzuo.shfcms.service.EventService;
import com.werzuo.shfcms.service.ExerciseServise;
import com.werzuo.shfcms.service.ItemService;
import com.werzuo.shfcms.service.MeasurmentService;
import com.werzuo.shfcms.service.MemberService;
import com.werzuo.shfcms.service.OtherMeasurementService;
import com.werzuo.shfcms.service.PaymentService;
import com.werzuo.shfcms.service.ProfilePictureService;
import com.werzuo.shfcms.service.QuestionService;
import com.werzuo.shfcms.service.ScheduleDetailsService;
import com.werzuo.shfcms.service.ScheduleService;
import com.werzuo.shfcms.service.UserService;
import com.werzuo.shfcms.servicefactory.ServiceFactory;

/**
 *
 * @author NEOx
 */
public class ServiceFactoryImpl implements ServiceFactory {

    @Override
    public UserService getUserService() {
        return new UserService();
    }

    @Override
    public AttendanceService getAttendanceService() {
        return new AttendanceService();
    }

    @Override
    public MemberService getMemberService() {
        return new MemberService();
    }

    @Override
    public PaymentService getPaymentService() {
        return new PaymentService();
    }

    @Override
    public QuestionService getQuestionService() {
        return new QuestionService();
    }

    @Override
    public ScheduleDetailsService getScheduleDetailsService() {
        return new ScheduleDetailsService();
    }

    @Override
    public EventService getEventService() {
        return new EventService();
    }

    @Override
    public ExerciseServise getExercise() {
        return new ExerciseServise();
    }

    @Override
    public ScheduleService getScheduleService() {
        return new ScheduleService();
    }

    @Override
    public MeasurmentService getMeasurmentService() {
        return new MeasurmentService();
    }

    @Override
    public BackUpService getBackUpService() {
        return new BackUpService();
    }

    @Override
    public ItemService getItemService() {
        return new ItemService();
    }

    @Override
    public OtherMeasurementService getOtherMeasurementService() {
        return new OtherMeasurementService();
    }

    @Override
    public ProfilePictureService getProfilePictureService() {
        return new ProfilePictureService();
    }

}
