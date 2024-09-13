/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcjavaappsecc;

import java.util.Scanner;

/**
 *
 * @author Keycee Bolambot
 */
public class Grade {
    
    public void genGrade(){
     Scanner sc = new Scanner (System.in);
        Grades[] gr = new Grades[100];
        
        System.out.println("Enter npp. of Students");
        int nums = sc.nextInt();
        
        for (int i = 0; i < nums; i++){
            System.out.println("Enter Details of Student "+ (i+1)+":");
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Prelim: ");
            double pr = sc.nextDouble();
            System.out.println("Midterm: ");
            double md = sc.nextDouble();
            System.out.println("Prefinal: ");
            double pf = sc.nextDouble();
            System.out.println("Finals: ");
            double fn = sc.nextDouble();
            gr[i] = new Grades();
            gr[i].addGrades(id, name, pr, md, pf, fn);
           
        }
        for(int i = 0; i < nums; i++){
            gr[i].viewGrades();
        }
       
            
    }
    
   
    }
    

