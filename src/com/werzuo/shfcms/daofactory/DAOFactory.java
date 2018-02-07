/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.daofactory;

import com.werzuo.shfcms.dao.AttendanceDAO;
import com.werzuo.shfcms.dao.EventDAO;
import com.werzuo.shfcms.dao.ExersiceDAO;
import com.werzuo.shfcms.dao.ItemDAO;
import com.werzuo.shfcms.dao.MeasurementDAO;
import com.werzuo.shfcms.dao.MemberDAO;
import com.werzuo.shfcms.dao.OtherMeasurementDAO;
import com.werzuo.shfcms.dao.PaymentArrearsDAO;
import com.werzuo.shfcms.dao.PaymentDAO;
import com.werzuo.shfcms.dao.PaymentTypeDAO;
import com.werzuo.shfcms.dao.PhysicalDetailsDAO;
import com.werzuo.shfcms.dao.ProfilePictureDAO;
import com.werzuo.shfcms.dao.QuestionsDAO;
import com.werzuo.shfcms.dao.RegDetailDAO;
import com.werzuo.shfcms.dao.ScheduleDAO;
import com.werzuo.shfcms.dao.ScheduleDetailsDAO;
import com.werzuo.shfcms.dao.UserDAO;

/**
 *
 * @author NEOx
 */
public interface DAOFactory {

    public UserDAO getUserDAO();

    public AttendanceDAO getAttendanceDAO();

    public PaymentDAO getPaymentDAO();

    public MemberDAO getMemberDAO();

    public PaymentTypeDAO getPaymentTypeDAO();

    public QuestionsDAO getQuestionsDAO();

    public PaymentArrearsDAO getPaymentArrearsDAO();

    public OtherMeasurementDAO getOtherMeasurementDAO();

    public ScheduleDAO getScheduleDAO();

    public ScheduleDetailsDAO getScheduleDetailsDAO();

    public RegDetailDAO getRegDetailDAO();

    public PhysicalDetailsDAO getPhysicalDetailsDAO();

    public ExersiceDAO getExersiceDAO();

    public EventDAO getEventDAO();

    public MeasurementDAO getMeasurementDAO();
    
    public ItemDAO getItemDAO();
    
    public ProfilePictureDAO getProfilePictureDAO();
}
