

package kcjavaappsecc;

import java.util.Scanner;

public class Salaries {
    public void getSalaries(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the numbers of Employees: ");
        int employee = sc.nextInt();
        sc.nextLine();
        
        Salary[] employees = new Salary[employee];
        double totalGross = 0.0;
        double totalDeductions = 0.0;
        double totalNetPay = 0.0;
        
        for (int i=0; i<employee; i++){
            System.out.println("Details of Employee" +(i+1)+ ":");
            
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Employee Name: ");
            String name = sc.nextLine();
            
            System.out.print("Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Hours Worked: ");
            double hrsWorked = sc.nextDouble();

            System.out.print("Total Deduction: ");
            double deduction = sc.nextDouble();

            employees[i] = new Salary(id, name, rate, hrsWorked, deduction);

            totalGross += employees[i].grossPay;
            totalDeductions += employees[i].deduction;
            totalNetPay += employees[i].netpay;
        }

        
        displayEmployeeDetails(employees, totalGross, totalDeductions, totalNetPay);
    }

    
    private void displayEmployeeDetails(Salary[] employees, double totalGross, double totalDeductions, double totalNetPay) {
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");

        for (Salary e : employees) {
            System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",
                    e.id, e.name, e.rate, e.hrsWorked, e.grossPay, e.deduction, e.netpay);
        }

        System.out.printf("\n%-10s %-10s %-10s %-10s %-10.2f %-10.2f %-10.2f\n",
                " ", "Total", " ", " ", totalGross, totalDeductions, totalNetPay);

        System.out.println("\nTotal Gross Pay: " + totalGross);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Total Net Pay to Release: " + totalNetPay);
    }
}
           
           
        
        
    

