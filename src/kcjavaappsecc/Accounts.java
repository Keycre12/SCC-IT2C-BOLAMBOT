/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcjavaappsecc;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author Keycee Bolambot
 */
class Accounts {
     Account.Acc[] accountArray;
    int numberOfAccounts;

    public void createAccounts() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Accounts: ");
        numberOfAccounts = sc.nextInt();
        sc.nextLine();

        accountArray = new Account.Acc[numberOfAccounts];

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter details for Account " + (i + 1) + ":");

            System.out.print("First Name: ");
            String fname = sc.nextLine();

            System.out.print("Last Name: ");
            String lname = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Username: ");
            String uname = sc.nextLine();

            String pass;
            do {
                System.out.print("Password: ");
                pass = sc.nextLine();
            } while (validatePasswordWithInt(pass) == 0);

            accountArray[i] = new Account().new Acc(i + 1, fname, lname, email, uname, pass);
            System.out.println("Account created successfully!\n");
        }
    }

    public int validatePasswordWithInt(String pass) {
        if (pass.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return 0;
        }
        if (!Pattern.compile("[A-Z]").matcher(pass).find()) {
            System.out.println("Password must contain at least one uppercase letter.");
            return 0;
        }
        if (!Pattern.compile("[a-z]").matcher(pass).find()) {
            System.out.println("Password must contain at least one lowercase letter.");
            return 0;
        }
        if (!Pattern.compile("[0-9]").matcher(pass).find()) {
            System.out.println("Password must contain at least one number.");
            return 0;
        }
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(pass).find()) {
            System.out.println("Password must contain at least one special character.");
            return 0;
         }
        if (pass.equalsIgnoreCase("admin") || pass.equalsIgnoreCase("password") || pass.equals("123")) {
            System.out.println("Password cannot be a common password such as 'admin', 'password', or '123'.");
            return 0;
        }
        return 1;
    }

    public void displayAccounts() {
        System.out.printf("%-5s %-10s %-10s %-20s %-15s %-10s%n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
        System.out.println("--------------------------------------------------------------------------------------------");

        for (int i = 0; i < numberOfAccounts; i++) {
            Account.Acc account = accountArray[i];
            System.out.printf("%-5d %-10s %-10s %-20s %-15s %-10s%n",
                    account.id, account.fname, account.lname, account.email, account.uname, account.pass);
        }
    }
}    

