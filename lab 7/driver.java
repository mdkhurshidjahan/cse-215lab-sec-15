/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class driver {
  public static void main(String[] args) {
        System.out.println("press 1 for deposit");
        System.out.println("press 2 for withdraw");
        System.out.println("press 3 for balance");
        System.out.println("press 4 for Exit");
       int n;
       Admin user=new Admin();
       while(true){
        Scanner input=new Scanner(System.in);
            System.out.println("please Enter a number for your task ");
             n=input.nextInt();
         if(n==1){
             System.out.println("Enter how much you want to deposit");
             double x=input.nextDouble();
             
            user.deposit(x);}
         else if(n==2){
             System.out.println("Enter how much you want to withdraw");
             double x=input.nextDouble();
             
            user.withdraw(x);}
         else if(n==3){user.checkbalance();}
         else if(n==4){user.exit();}
         else System.out.println("invalid");
        
        
        }
    }  
}
