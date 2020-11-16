/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3.pkgclass.task;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3ClassTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner inp = new Scanner(System.in);
        System.out.println(" please enter an integer : ");
        int num = inp.nextInt();
        
        
        if (num>=0)
        {
            System.out.println( "Your input is non-negative");
        }
        if(num>=1)
        {
            System.out.println( "Your input is also a natural number" );
        }
        else
        {
            System.out.println( "Your input is negative");
        }
    }
}



