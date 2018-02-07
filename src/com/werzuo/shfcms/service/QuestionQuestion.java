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

/**
 *
 * @author Deshaa
 */
public class QuestionQuestion {
     private DAOFactory dAOFactory=new DAOFactoryImpl();
     
     public boolean addQuestion(Questions questions)throws SQLException,ClassNotFoundException{
        return  true;
     }
}
