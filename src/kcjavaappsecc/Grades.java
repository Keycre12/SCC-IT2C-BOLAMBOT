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
public class Grades {
     int id;
    String name;
    double p, m, pf, f;
    
    public void addGrades(int sid, String name, double prl, double mid, double prf, double fnl){
        this.name = name;
        this.id = sid;
        this.p = prl;
        this.m = mid;
        this.pf = prf;
        this.f = fnl;
        
    }
    
    public void viewGrades(){
         double average = (this.p + this.m + this.pf + this.f) / 4;
         String remarks = (average > 3.0) ? "Failed" : "Passed";
         
         System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                      this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
}
}
