/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.daofactoryimpl;

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
import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.service.ScheduleService;

/**
 *
 * @author NEOx
 */
public class DAOFactoryImpl implements DAOFactory {

    @Override
    public UserDAO getUserDAO() {
        return new UserDAO();
    }

    @Override
    public AttendanceDAO getAttendanceDAO() {
        return new AttendanceDAO();
    }

    @Override
    public PaymentDAO getPaymentDAO() {
        return new PaymentDAO();
    }

    @Override
    public MemberDAO getMemberDAO() {
        return new MemberDAO();
    }

    @Override
    public PaymentTypeDAO getPaymentTypeDAO() {
        return new PaymentTypeDAO();
    }

    @Override
    public QuestionsDAO getQuestionsDAO() {
        return new QuestionsDAO();
    }

    @Override
    public PaymentArrearsDAO getPaymentArrearsDAO() {
        return new PaymentArrearsDAO();
    }

    @Override
    public OtherMeasurementDAO getOtherMeasurementDAO() {
        return new OtherMeasurementDAO();
    }

    @Override
    public ScheduleDetailsDAO getScheduleDetailsDAO() {
        return new ScheduleDetailsDAO();
    }

    @Override
    public RegDetailDAO getRegDetailDAO() {
        return new RegDetailDAO();
    }

    @Override
    public PhysicalDetailsDAO getPhysicalDetailsDAO() {
        return new PhysicalDetailsDAO();
    }

    @Override
    public ScheduleDAO getScheduleDAO() {
        return new ScheduleDAO();
    }

    @Override
    public ExersiceDAO getExersiceDAO() {
        return new ExersiceDAO();
    }

    @Override
    public EventDAO getEventDAO() {
        return new EventDAO();
    }

    @Override
    public MeasurementDAO getMeasurementDAO() {
        return new MeasurementDAO();
    }

    @Override
    public ItemDAO getItemDAO() {
        return new ItemDAO();
    }

    @Override
    public ProfilePictureDAO getProfilePictureDAO() {
        return new ProfilePictureDAO();
    }

}
