/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Member;
import com.werzuo.shfcms.model.MemberRegistration;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;

/**
 *
 * @author SW96
 */
public class MemberService {

    private DAOFactory dAOFactory = new DAOFactoryImpl();

    /**
     * works with five tables in databases
     *
     * @param memberRegistration
     * @return if details added
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean addNewMember(MemberRegistration memberRegistration) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        Savepoint save = connection.setSavepoint("Saved");

        boolean addCustomer = dAOFactory.getMemberDAO().addCustomer(memberRegistration.getMember(), connection);
        boolean allDetailsAdded = false;
        boolean addNewRegDetail = false;
        boolean addOtherMeasurement = false;
        boolean addPhysicalDetails = false;
        boolean addNewPayment = false;

        if (addCustomer) {
            addNewRegDetail = dAOFactory.getRegDetailDAO().addNewRegDetail(memberRegistration.getRegDetails(), connection);
            if (addNewRegDetail) {
                addOtherMeasurement = dAOFactory.getOtherMeasurementDAO().addOtherMeasurement(memberRegistration.getOtherMeasurement(), connection);;
                if (addOtherMeasurement) {
                    addPhysicalDetails = dAOFactory.getPhysicalDetailsDAO().addPhysicalDetails(memberRegistration.getPhysicalDetails(), connection);
                    if (addPhysicalDetails) {
                        addNewPayment = dAOFactory.getPaymentDAO().addNewPayment(memberRegistration.getPayment(), connection);
                    }
                }
            }
        }

        if (addCustomer && addNewPayment && addOtherMeasurement && addPhysicalDetails && addNewPayment) {
            allDetailsAdded = true;
        }

        if (allDetailsAdded) {
            connection.commit();
        } else {
            connection.rollback(save);
        }

        return allDetailsAdded;
    }

    public Member searchMemberBoth(String cid, String nic) throws SQLException, ClassNotFoundException {
        ArrayList<Member> allMembers = dAOFactory.getMemberDAO().getAllCustomers();
        Member searchMember = null;
        for (Member member : allMembers) {
            if (member.getCid().equalsIgnoreCase(cid) || member.getNic().equalsIgnoreCase(nic)) {
                searchMember = member;
            }
        }
        return searchMember;
    }

    public Member searchCustomerByNic(String nic) throws SQLException, ClassNotFoundException {
        return dAOFactory.getMemberDAO().searchCustomerByNic(nic);
    }

    public boolean deleteMember(String cid) throws SQLException, ClassNotFoundException {
        return dAOFactory.getMemberDAO().deleteCustomer(cid);
    }

    public boolean updateMember(Member member) throws SQLException, ClassNotFoundException {
        return dAOFactory.getMemberDAO().updateCustomer(member);
    }

    public Member searchMember(String cid) throws SQLException, ClassNotFoundException {
        return dAOFactory.getMemberDAO().searchCustomer(cid);
    }

    public ArrayList<Member> getAllMember() throws SQLException, ClassNotFoundException {
        return dAOFactory.getMemberDAO().getAllCustomers();
    }

    public ArrayList<Member> searchMemberByBirthday(String dob) throws SQLException, ClassNotFoundException {
        return dAOFactory.getMemberDAO().searchMemberByBirthday(dob);
    }

    public ArrayList<Member> getAdvancedSearchMembers(String search) throws SQLException, ClassNotFoundException {
        ArrayList<Member> allCustomers = dAOFactory.getMemberDAO().getAllCustomers();
        ArrayList<Member> searchedMembers = new ArrayList<>();
        
        for (Member member : allCustomers) {
            if (member.getCid().contains(search) || member.getfName().contains(search)
                    || member.getlName().contains(search) || member.getNic().contains(search)) {
                searchedMembers.add(member);
            }
        }
        
        return searchedMembers;
    }
}
