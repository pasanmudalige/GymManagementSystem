/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.controller;

import com.werzuo.shfcms.model.Questions;
import com.werzuo.shfcms.servicefactory.ServiceFactory;
import com.werzuo.shfcms.servicefactoryimpl.ServiceFactoryImpl;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Deshaa
 */
public class QuestionController {
      private ServiceFactory serviceFactory = new ServiceFactoryImpl();
      
      public boolean addQuestion(Questions Question)throws SQLException,ClassNotFoundException{
          return serviceFactory.getQuestionService().addQuestion(Question);
      }
      public Questions searchQuestion(String qid)throws SQLException,ClassNotFoundException{
          return serviceFactory.getQuestionService().searchQuestion(qid);
          
      }
      public boolean deleteQuestion(String qid)throws SQLException,ClassNotFoundException{
          return serviceFactory.getQuestionService().deleteQuestion(qid);
      }
      public boolean updateQuestion(Questions questions)throws SQLException,ClassNotFoundException{
          return serviceFactory.getQuestionService().updateQuestion(questions);
      }
      public ArrayList<Questions>getAllQuestion()throws SQLException,ClassNotFoundException{
          return serviceFactory.getQuestionService().getAllQuestion();
      }
}
