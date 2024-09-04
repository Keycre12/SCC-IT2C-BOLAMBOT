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
public class KcJavaAppSecc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product pr = new Product();
        pr.addProduct(10011, "Soap", 20, 30, 20.00);
        pr.viewProduct();
    }
    
}
