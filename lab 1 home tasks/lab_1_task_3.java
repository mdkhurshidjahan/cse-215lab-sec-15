/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab_1_task_3 {
    public static void main(String[] args){
          Scanner input= new Scanner(System.in);
     System.out.println("enter a number");
     int num= input.nextInt();
     if(num%2==0){
         System.out.println(num+" is a even number");
         
     }
     else if(num%2!=0){
         System.out.println(num+ " is odd number ");
     }
    }
    
}
