
package javaapplication30;

import java.util.Scanner;


public class JavaApplication30 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter size : ");
		
		int n = input.nextInt();
		
		System.out.print("Enter numbers : ");
		
		int [] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr [i] = input.nextInt();		
			}
		
        System.out.print("Output : ");
        
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i]==arr[i-1]&&arr[i]==arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
		input.close();
	}
}
       
    
   

