/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Employee2 {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
  
    
    
    public void EmployeeMethod( int id){
        
        
        con=DBConnection.connection();
        String sql="DELETE FROM `employee` WHERE id=?";
       
        
       try{
           pst=con.prepareStatement(sql);
           pst.setInt(1, id);
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Employee Delete Success");
           
          }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"DB Connection Error"+
           ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
          }
        
    }
    
    public void EmployeeMethod(int id,String date,String Present,String Absent){
                con=DBConnection.connection();
        String sql="INSERT INTO attendance (id,date,Present,Absent) VALUES (?,?,?,?)";
        
        
        
        
        
        try{
            pst=con.prepareStatement(sql);
            
            pst.setInt(1,id);
            pst.setString(2, date);
            pst.setString(3, Present);
            pst.setString(4, Absent);
            
            
            pst.executeUpdate();
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"DB Connection Error"+
            ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }

}

 
  
    