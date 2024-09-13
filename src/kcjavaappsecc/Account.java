/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcjavaappsecc;

/**
 *
 * @author SCC-COLLEGE
 */
public class Account {
    class Acc{
        int id; 
        String fname; 
        String lname;
        String email;
        String uname;
        String pass;
        
        Acc(int id, String fname, String lname, String email, String uname, String pass){
            this.id = id;
            this.fname = fname;
            this.email = email;
            this.uname = uname;
            this.pass = pass;
        }
    }
}
