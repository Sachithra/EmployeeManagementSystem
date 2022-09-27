/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class addEvents {
    
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
   
   public  void addEvent(String evt){
    con=DBConnection.connection();
     
    String sql=" INSERT INTO `events`(`Event`) VALUES (?)";
    
    try{
       pst=con.prepareStatement(sql);
       pst.setString(1,evt );
       pst.executeUpdate();

    }catch(Exception ex){
        
     JOptionPane.showMessageDialog(null,"DB Connection Error"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

    }
      
    
   }     
        
    
}
