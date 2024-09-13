/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcjavaappsecc;

/**
 *
 * @author Keycee Bolambot
 */
public class Salary {
    int id;
    String name;
    double rate;
    double hrsWorked;
    double grossPay;
    double deduction;
    double netpay;
    
    public Salary(int id, String name, double rate, double hrsWorked, double deduction ){
       
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hrsWorked = hrsWorked;
        this.grossPay = rate*hrsWorked;
        this.deduction = deduction;
        this.netpay = grossPay - deduction;
    }
}
