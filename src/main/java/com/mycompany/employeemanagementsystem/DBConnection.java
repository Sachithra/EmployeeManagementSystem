/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DBConnection {
     static Connection connection(){
        
        try{
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_m_system","root","");
            return con;
            
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
       
        
    }
}
