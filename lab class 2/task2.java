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
public class task2 {
    public static void main(String[] args) {
 Scanner inp = new Scanner(System.in);
        System.out.println(" please enter an integer : ");
        int num = inp.nextInt();
        if (num==0)
        {
            System.out.println(" It's a zero ");
        }
        else 
        {
            System.out.println(" It's a nonzero ");
        }
        
    }
    
}
