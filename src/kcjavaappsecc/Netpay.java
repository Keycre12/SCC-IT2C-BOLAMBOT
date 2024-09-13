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
public class Netpay {
    public void getPay(){
        Scanner input = new Scanner(System.in);
        
        double money = 19500;
        String name;
        int birthyr, total, diff, deduc, rate, hrs;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter Brithyear: ");
        birthyr = input.nextInt();
        System.out.print("Rate per Hour: ");
        rate = input.nextInt();
        System.out.print("Enter Total Hours Worked: ");
        hrs = input.nextInt();
        System.out.print("Enter Total Deduction: ");
        deduc = input.nextInt();
        
        total = rate * hrs;
        diff = total - deduc;
        
        System.out.println("August 14, 2024");
        System.out.println("Hello "+name+", your age is "+(2024-birthyr));
        System.out.println("Total Gross: "+ total);
        System.out.println("Total Deduction: "+ deduc);
        System.out.printf("Netpay: %.2f%n",(double) rate * hrs - deduc);
       
        
    }
}
