
package lab.pkg3.home.task;

import java.util.Scanner;


public class task2 {
    
  public static void main(String[] args){
       Scanner inp=new Scanner(System.in);
        for(int i=0;i<5;i++)
        { 
            for(int k=5-i;k>0;k--)
        {
            System.out.print(k); } 
        System.out.println(); 
        for(int j=0;j<i+1;j++){ 
            System.out.print(" "); 
        } 
  }  
    
    
    
  }
}
