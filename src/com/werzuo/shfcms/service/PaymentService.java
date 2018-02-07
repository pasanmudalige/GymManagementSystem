/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Payment;
import com.werzuo.shfcms.model.PaymentArrears;
import com.werzuo.shfcms.model.PaymentType;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author IJSE
 */
public class PaymentService {

    private DAOFactory factory = new DAOFactoryImpl();

    public boolean addNewPayment(Payment payment) throws SQLException, ClassNotFoundException {
        return factory.getPaymentDAO().addNewPayment(payment, null);
    }

    public Payment searchPayment(String pid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentDAO().searchPayment(pid);
    }

    public Payment searchPaymentByCid(String cid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentDAO().searchPaymentByCid(cid);
    }

    public boolean deletePayment(String payment) throws SQLException, ClassNotFoundException {
        return factory.getPaymentDAO().deletePayment(payment);
    }

    public ArrayList<Payment> viewAllPayments() throws SQLException, ClassNotFoundException {
        return factory.getPaymentDAO().viewAllPayments();
    }

    public boolean updatePayment(Payment payment) throws SQLException, ClassNotFoundException {
        return factory.getPaymentDAO().updatePayment(payment);
    }

    public boolean addPaymentType(PaymentType paymentType) throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().addPaymentType(paymentType);
    }

    public PaymentType searchPaymentType(String ptId) throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().searchPaymentType(ptId);
    }

    public PaymentType searchPaymentTypeByType(String type) throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().searchPaymentTypeByType(type);
    }

    public boolean updatePaymentType(PaymentType paymentType) throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().updatePaymentType(paymentType);
    }

    public ArrayList<PaymentType> viewAllPaymentType() throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().viewAllPaymentType();
    }

    public boolean deletePaymentType(String ptId) throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().deletePaymentType(ptId);
    }

    public boolean addNewPaymentArrears(PaymentArrears paymentArrears) throws SQLException, ClassNotFoundException {
        return factory.getPaymentArrearsDAO().addNewPaymentArrears(paymentArrears);
    }

    public PaymentArrears searchNewPaymentArrears(String pid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentArrearsDAO().searchPaymentArrears(pid);
    }

    public boolean updateNewPaymentArrears(PaymentArrears paymentArrears) throws SQLException, ClassNotFoundException {
        return factory.getPaymentArrearsDAO().updatePaymentArrears(paymentArrears);
    }

    public ArrayList<PaymentArrears> viewAllNewPaymentArrears() throws SQLException, ClassNotFoundException {
        return factory.getPaymentArrearsDAO().viewAllPaymentsArrears();
    }

    public ArrayList<PaymentArrears> viewAllPaymentsArrearsByCid(String cid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentArrearsDAO().viewAllPaymentsArrearsByCid(cid);
    }

    public boolean deleteNewPaymentArrears(String pid) throws SQLException, ClassNotFoundException {
        return factory.getPaymentTypeDAO().deletePaymentType(pid);
    }

}
