
package javaapplication26;

import java.util.Scanner;


public class task2new {
   

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        int n1=s1.length();
         int n2=s2.length();
        
         if(n1>n2){
             System.out.println("s1 String is gatter Than s2");
         }
         else
         {
             System.out.println("s2 String is gatter Than s1");
         }
    }
}
