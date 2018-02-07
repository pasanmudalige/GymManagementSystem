/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.service;

import com.werzuo.shfcms.daofactory.DAOFactory;
import com.werzuo.shfcms.daofactoryimpl.DAOFactoryImpl;
import com.werzuo.shfcms.model.Questions;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Deshaa
 */
public class QuestionService {
     private DAOFactory daoFactory = new DAOFactoryImpl();
     
     public boolean addQuestion(Questions questions)throws SQLException,ClassNotFoundException{
         return daoFactory.getQuestionsDAO().addQuestion(questions);
     }
     public Questions searchQuestion(String qid)throws SQLException, ClassNotFoundException{
         return daoFactory.getQuestionsDAO().searchQuestion(qid);
     }
     public  boolean deleteQuestion(String qid)throws SQLException,ClassNotFoundException{
         return daoFactory.getQuestionsDAO().deleteQuestion(qid);
     }
     public  boolean updateQuestion(Questions questions)throws SQLException,ClassNotFoundException{
         return daoFactory.getQuestionsDAO().updateQuestion(questions);
     }
     public ArrayList<Questions>getAllQuestion()throws SQLException,ClassNotFoundException{
         return daoFactory.getQuestionsDAO().getAllQuestions();
     }
     

}
