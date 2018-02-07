/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Member;
import com.werzuo.shfcms.model.MemberRegistration;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Deshaa
 */
public class MemberController {

    private ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public boolean addNewMember(MemberRegistration memberRegistration) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().addNewMember(memberRegistration);
    }

    public boolean deleteMember(String cid) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().deleteMember(cid);
    }

    public boolean updateMember(Member member) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().updateMember(member);
    }

    public Member searchMember(String cid) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().searchMember(cid);
    }

    public Member searchCustomerByNic(String nic) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().searchCustomerByNic(nic);
    }

    public Member searchMemberBoth(String cid, String nic) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().searchMemberBoth(cid, nic);
    }

    public ArrayList<Member> getAllMember() throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().getAllMember();
    }

    public ArrayList<Member> getmenberByDob(String dob) throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().searchMemberByBirthday(dob);
    }

    public ArrayList<Member> getAdvancedSearchMembers(String search)throws SQLException, ClassNotFoundException {
        return serviceFactory.getMemberService().getAdvancedSearchMembers(search);
    } 
}
