
package kcjavaappsecc;
import java.util.Arrays;

public class AccountsSecC {
    
    int id;
    String fname, email, uname, pass;
    
    public void addAccounts(int id, String fname, String email, String uname, String pass){
    
    this.id = id;
    this.fname = fname;
    this.email = email;
    this.uname = uname;
    this.pass = pass;

}
    
    public void viewAccounts(){
        System.out.printf("%-10d %-10s %-10s %-20s %-13s %-10s\n",
        this.id, this.fname, this.email, this.uname, this.pass);
    }
    
    public boolean passwordVerify(String password){
        char e;
        int digitCount = 0;
        int upperCase = 0;
        String[] commonPass = {"admin" ,"1234", "password"};
        
        if (pass.length() < 8){
            System.out.printf("Password is too short, Try a new one: ");
            return false;
        }
        
        if (Arrays.asList (commonPass).contains (password)){
            System.out.printf("Password is too common, Try a new one: ");
            return false;
           
        }
        
        for (int x = 0; x < pass.length(); x++){
            e = pass.charAt(x);
            if (Character.isDigit(e)){
                digitCount++;
            } else if (Character.isUpperCase(e)){
                upperCase++;
            }
        }
        
        if (upperCase == 0){
            System.out.printf("Password must have at least one uppercase");
            return false;
        }
        
        if(digitCount == 0){
            System.out.println("Password must have at least one number");
            return false; 
        }
        
        return true;
     
    }


}