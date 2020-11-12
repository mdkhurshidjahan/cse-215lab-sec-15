
package lab.pkg3.home.task;

import java.util.Scanner;


 
public class Lab3HomeTask {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String array1=input.nextLine();
        System.out.print("print name  :");
        int num=input.nextInt(); 
        for(int i=0;i<num;i++){ System.out.println(array1); }
       
    }
    
}
