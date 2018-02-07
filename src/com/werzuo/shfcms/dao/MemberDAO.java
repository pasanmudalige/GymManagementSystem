/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kaushalya
 */
public class MemberDAO {

    /**
     * add new Customer to database
     *
     * @param member
     * @param connection
     * @return if member added correctly
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean addCustomer(Member member, Connection connection) throws ClassNotFoundException, SQLException {

        String sql = "insert into member values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, member.getCid());
        statement.setObject(2, member.getfName());
        statement.setObject(3, member.getlName());
        statement.setObject(4, member.getPhoneNo());
        statement.setObject(5, member.getOccupation());
        statement.setObject(6, member.getNic());
        statement.setObject(7, member.getGender());
        statement.setObject(8, member.getDob());
        statement.setObject(9, member.getAge());
        statement.setObject(10, member.getEmail());
        statement.setObject(11, member.getAddress());
        statement.setObject(12, member.getFacebook());
        statement.setObject(13, member.getPic());
        int res = statement.executeUpdate();

        return res > 0;
    }

    /**
     * search member
     *
     * @param cid
     * @return return member if exist
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Member searchCustomer(String cid) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM member WHERE cid=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, cid);
        ResultSet rst = statement.executeQuery();
        Member member = null;
        while (rst.next()) {
            member = new Member(rst.getString(1), rst.getString(2), rst.getString(3),
                    rst.getInt(4), rst.getString(5), rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getInt(9), rst.getString(10), rst.getString(11),
                    rst.getString(12), rst.getString(13));

        }

        return member;
    }

    public Member searchCustomerByNic(String nic) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM member WHERE nic=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, nic);
        ResultSet rst = statement.executeQuery();
        Member member = null;
        while (rst.next()) {
            member = new Member(rst.getString(1), rst.getString(2), rst.getString(3),
                    rst.getInt(4), rst.getString(5), rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getInt(9), rst.getString(10), rst.getString(11),
                    rst.getString(12), rst.getString(13));

        }

        return member;
    }

    /**
     * search member by birthday
     *
     * @param date
     * @return member list
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Member> searchMemberByBirthday(String date) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        System.out.println(date);
        String sql = "SELECT * FROM member WHERE dob like'%" + date + "%'";
        Statement statement = connection.createStatement();
        ArrayList<Member> members = new ArrayList<>();
        ResultSet rst = statement.executeQuery(sql);

        while (rst.next()) {
            Member member = new Member(rst.getString(1), rst.getString(2), rst.getString(3),
                    rst.getInt(4), rst.getString(5), rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getInt(9), rst.getString(10), rst.getString(11),
                    rst.getString(12), rst.getString(13));
            System.out.println(member.getfName());
            members.add(member);
        }

        return members;
    }

    /**
     * update member name
     *
     * @param member
     * @return boolean
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean updateCustomer(Member member) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE member SET fName=? ,lName=?,phoneNO=?,occupation=?,nic=?,gender=?,dob=?,age=?,email=?,address=?,facebook=?,pic=? where eid=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(13, member.getCid());
        statement.setObject(1, member.getfName());
        statement.setObject(2, member.getlName());
        statement.setObject(3, member.getPhoneNo());
        statement.setObject(4, member.getOccupation());
        statement.setObject(5, member.getNic());
        statement.setObject(6, member.getGender());
        statement.setObject(7, member.getDob());
        statement.setObject(8, member.getAge());
        statement.setObject(9, member.getEmail());
        statement.setObject(10, member.getAddress());
        statement.setObject(11, member.getFacebook());
        statement.setObject(12, member.getPic());
        return statement.executeUpdate() > 0;
    }

    /**
     * delete member
     *
     * @param cid
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteCustomer(String cid) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "delete from member where cid=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, cid);
        return statement.executeUpdate() > 0;

    }

    /**
     * get all Customers details
     *
     * @return member List
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Member> getAllCustomers() throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "select * from member";
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        ArrayList<Member> memberList = new ArrayList<>();
        while (rst.next()) {
            Member member = new Member(rst.getString(1), rst.getString(2), rst.getString(3),
                    rst.getInt(4), rst.getString(5), rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getInt(9), rst.getString(10), rst.getString(11),
                    rst.getString(12), rst.getString(13));
            memberList.add(member);
        }

        return memberList;
    }
}
