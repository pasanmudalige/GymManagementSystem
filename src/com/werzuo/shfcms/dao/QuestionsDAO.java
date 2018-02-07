/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.dao;

import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Questions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class QuestionsDAO {

    /**
     * add Questions to database
     *
     * @param question
     * @return boolean
     */
    public boolean addQuestion(Questions question) throws SQLException, 
            ClassNotFoundException {
        
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "INSERT INTO QUESTIONS VALUES(?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, question.getQid());
        stm.setObject(2, question.getQuestions());
        
        return stm.executeUpdate() > 0;
    }

    /**
     * Search questions according to the question ID;
     *
     * @param qid
     * @return Questions
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Questions searchQuestion(String qid) throws SQLException,
            ClassNotFoundException {
        
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM QUESTIONS WHERE qid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, qid);
        ResultSet rst = stm.executeQuery();
        
        Questions question = null;
        while (rst.next()) {
            question = new Questions(rst.getString(1), rst.getString(2));
        }
        
        return question;
    }

    /**
     * delete questions according o the Question ID
     *
     * @param qid
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean deleteQuestion(String qid) throws SQLException,
            ClassNotFoundException {
        
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "DELETE FROM QUESTIONS WHERE qid=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, qid);
        
        return stm.executeUpdate() > 0;
    }

    /**
     * Update Questions according to qid
     *
     * @param questions
     * @return boolean
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean updateQuestion(Questions questions) throws SQLException,
            ClassNotFoundException {
       
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "UPDATE QUESTIONS SET questions =? WHERE qid = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, questions.getQuestions());
        stm.setObject(2, questions.getQid());
        
        return stm.executeUpdate() > 0;
    }

    /**
     * return all questions
     *
     * @return ArrayList<Questions>
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ArrayList<Questions> getAllQuestions() throws SQLException,
            ClassNotFoundException {
        
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT * FROM questions";
        PreparedStatement stm = conn.prepareCall(sql);
        ResultSet rst = stm.executeQuery();
        
        ArrayList<Questions> allQuestions = new ArrayList<>();
        while (rst.next()) {
            Questions question = new Questions(rst.getString(1), rst.getString(2));
            allQuestions.add(question);
        }
        
        return allQuestions;
    }
}
