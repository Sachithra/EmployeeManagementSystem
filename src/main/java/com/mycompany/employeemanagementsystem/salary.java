/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author User
 */
public class salary extends salaryAbstract{


    
    @Override
    public int Salary(int days, int salary, int hr) {
        int Hr= hr*100;
        int sum=days*salary+Hr;
        
        return sum;
    }

    @Override
    public int CalOt(int otHr) {
        int sum=otHr*150;
        
        return sum;
    }

    @Override
    public int FullSalary(int salary, int ot) {
       int sum=salary+ot;
       return sum;
    }
    

   
    
}
