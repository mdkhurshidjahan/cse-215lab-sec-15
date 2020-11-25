/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4hometask;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab4hometask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
        System.out.println("Calculate for radians value....");
        System.out.print("Enter Value(Degrees):");
        double num = inp.nextDouble();
        num = Math.toRadians(num);
        double res = Math.sin(num);
        System.out.println("Sin(" + num + "😞" + res);
        res = Math.cos(num);
        System.out.println("Cos(" + num + "😞" + res);
        res = Math.tan(num);
        System.out.println("tan(" + num + "😞" + res);

        System.out.println("\nCalculate for Degree value....");
        System.out.print("Enter Value(Radians):");
        double num1 = inp.nextFloat();
        num1 = Math.toDegrees(num1);
        double res1 = Math.sin(num1);
        System.out.println("Sin(" + num1 + "😞" + res1);
        res1 = Math.cos(num1);
        System.out.println("Cos(" + num1 + "😞" + res1);
        res1 = Math.tan(num1);
        System.out.println("tan(" + num1 + "😞" + res1);

        System.out.println("\nCalculate for inverse Trigonometric function....");
        System.out.print("Enter Value(Radians):");
        double num2 = inp.nextDouble();
        double res2 = Math.asin(num2);
        System.out.println("inverse of Sin(" + num2 + "😞" + res2);
        res2 = Math.acos(num2);
        System.out.println("inverse of Cos(" + num2 + "😞" + res2);
        res2 = Math.atan(num2);
        System.out.println("inverse of tan(" + num2 + "😞" + res2);

        System.out.println("\nCalculate for diffrent Math method....");
        double num3;
        System.out.print("Enter Value for exponantial function:");
        num3 = inp.nextDouble();
        System.out.println("expo value = " + Math.exp(num3));
        System.out.print("Enter Value for logarithm function:");
        num3 = inp.nextDouble();
        System.out.println("log value= " + Math.log(num3));
        System.out.print("Enter Value for 10 base logarithm function:");
        num3 = inp.nextDouble();
        System.out.println("Ans = " + Math.log10(num3));
        System.out.print("Enter two Value for power function:");
        num3 = inp.nextDouble();
        double num4 = inp.nextDouble();
        System.out.println("Ans = " + Math.pow(num3, num4));
        System.out.print("Enter Value for sqrt function:");
        num3 = inp.nextDouble();
        System.out.println("Ans = " + Math.sqrt(num3));

        System.out.println("\nRound figure....");
        double x;
        System.out.println("Enter a double number:");
        x = inp.nextDouble();
        System.out.println("Ceil=" + Math.ceil(x));
        System.out.println("Floor=" + Math.floor(x));
        System.out.println("Rint=" + Math.rint(x));
        System.out.println("Round=" + Math.round(x));

    }


    }
    

