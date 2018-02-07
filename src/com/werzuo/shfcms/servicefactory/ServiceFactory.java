/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.servicefactory;

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

/**
 *
 * @author NEOx
 */
public interface ServiceFactory {

    public UserService getUserService();

    public AttendanceService getAttendanceService();

    public MemberService getMemberService();

    public PaymentService getPaymentService();

    public QuestionService getQuestionService();

    public ScheduleService getScheduleService();

    public ScheduleDetailsService getScheduleDetailsService();

    public EventService getEventService();

    public ExerciseServise getExercise();

    public OtherMeasurementService getOtherMeasurementService();
    
    public MeasurmentService getMeasurmentService();
    
    public BackUpService getBackUpService();
    
    public ItemService getItemService();
    
    public ProfilePictureService getProfilePictureService();
}
