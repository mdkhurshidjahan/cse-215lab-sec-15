
package javaapplication26;

import java.util.Scanner;


public class JavaApplication26 {

   
    public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
        }
    }
    
}