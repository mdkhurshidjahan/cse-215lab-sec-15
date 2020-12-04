/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5task3;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Lab5task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to your Bank Account....");
            Scanner s = new Scanner(System.in);
            int end = 0;
            System.out.println("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
            System.out.println("Enter your choice(integer):");
            int choice = s.nextInt();
            if (choice > 0 && choice < 5) {
                switch (choice) {
                    case 1: {
                        depoSite();
                        break;
                    }
                    case 2: {
                        withDraw();
                        break;
                    }
                    case 3: {
                    String balance = null;
                        System.out.println("Your Total Balnace is: " + balance);
                        break;
                    }
                    case 4: {
                        eNd();
                        break;
                    }
                }
                System.out.println("Enter your choice: \n1.Close\n2.Continue");
                end = s.nextInt();
                if (end == 1) {
                    break;
                }
            } else {
                System.out.println("Wrong input!.\nTry Again..");
            }
        }
    }

    public static void depoSite() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to add on Balace:");
        int dep = s.nextInt();
        int balance = 0 ;
         balance = balance + dep;
    }

    public static void withDraw() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        int out = s.nextInt();
        int balance = 0;
        if (balance > out) {
            balance = balance - out;
        } else {
            System.out.println("Sorry,You dont have sufficient money for withdraw.");
            System.out.println("Please,check your balance and agin try.\nThank you.");
        }
    }

    public static void eNd() {
        System.exit(0);
    }
}

    
    

