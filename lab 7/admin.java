/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Admin
 */
public class admin {
    public String name;
   private int account_num;
   private  double balance=0;
   public void deposit(double amount){
         balance+=amount;
        System.out.println("after the deposit the balance is"+balance);
    
    }
     public void withdraw(double amount){
         if(amount > balance){System.out.println("YOu Can not withdraw because withdraw balance is  more than deposit balance");}
         else 
             balance-=amount;
         System.out.println("after the withdraw the balance is  "+balance);
    
    }
     
     public void checkbalance(){System.out.println(balance);}
     public void exit(){System.exit(0);}
     
     
     
}
    
