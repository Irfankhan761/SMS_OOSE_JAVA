//refactor name regController from Logincontroller
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Data_access_layer.DatabaseManager;

import java.sql.SQLException;

/**
 *
 * @author mnk
 */
public class RegController {
     DatabaseManager dm;
    
    public RegController(){
        
        
         dm=ObjectsFactory.getInstanceOfDatabaseManager();
        
    }
    
    
public  void  Registerstudent(String fname,String lname, String regno, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
    
    
   dm.RegisterStudentrecord(fname,lname,regno, email,Class,pass,Admin_id,setQuery);
   
   
   }
//mine
public  void  Registerteach(String fname,String lname, String t_id, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
    
   dm.Registerteacherrecord(fname,lname,t_id, email,Class,pass,Admin_id,setQuery);
   
   
   }
public  void  Registerclerk(String fname,String lname, String c_id, String email,String pass,String Admin_id,String setQuery) throws SQLException{
    
   dm.Registerclerkrecord(fname,lname,c_id, email,pass,Admin_id,setQuery);
}

   
}
