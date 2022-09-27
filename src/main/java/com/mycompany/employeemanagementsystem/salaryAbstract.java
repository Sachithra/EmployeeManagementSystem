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
public abstract class salaryAbstract {
    
    public abstract int Salary(int days,int salary,int hr);
    
    public abstract int CalOt(int otHr);
    
    public abstract int FullSalary(int salary,int ot);
    
}
