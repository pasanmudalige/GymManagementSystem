/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Payment;
import com.werzuo.shfcms.model.PaymentArrears;
import com.werzuo.shfcms.model.PaymentType;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author IJSE
 */
public class PaymentController {

    private ServiceFactory factory = new ServiceFactoryImpl();

    public boolean addNewPayment(Payment payment) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().addNewPayment(payment);
    }

    public Payment searchPayment(String pid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().searchPayment(pid);
    }

    public Payment searchPaymentByCid(String cid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().searchPaymentByCid(cid);
    }

    public boolean deletePayment(String payment) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().deletePayment(payment);
    }

    public ArrayList<Payment> viewAllPayments() throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().viewAllPayments();
    }

    public boolean updatePayment(Payment payment) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().updatePayment(payment);
    }

    public boolean addPaymentType(PaymentType paymentType) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().addPaymentType(paymentType);
    }

    public PaymentType searchPaymentType(String ptId) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().searchPaymentType(ptId);
    }

    public PaymentType searchPaymentTypeByType(String type) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().searchPaymentTypeByType(type);
    }

    public boolean updatePaymentType(PaymentType paymentType) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().updatePaymentType(paymentType);
    }

    public ArrayList<PaymentType> viewAllPaymentType() throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().viewAllPaymentType();
    }

    public boolean deletePaymentType(String ptId) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().deletePaymentType(ptId);
    }

    public boolean addNewPaymentArrears(PaymentArrears paymentArrears) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().addNewPaymentArrears(paymentArrears);
    }

    public PaymentArrears searchNewPaymentArrears(String pid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().searchNewPaymentArrears(pid);
    }

    public boolean updateNewPaymentArrears(PaymentArrears paymentArrears) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().updateNewPaymentArrears(paymentArrears);
    }

    public ArrayList<PaymentArrears> viewAllNewPaymentArrears() throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().viewAllNewPaymentArrears();
    }

    public ArrayList<PaymentArrears> viewAllPaymentsArrearsByCid(String cid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().viewAllPaymentsArrearsByCid(cid);
    }

    public boolean deleteNewPaymentArrears(String pid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentService().deleteNewPaymentArrears(pid);
    }
}
