
package even.odd;

import java.util.*;
 
public class EvenOdd {

  
    public static void main(String[] args) {
     int num;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer");
        num = in.nextInt();
        switch(num%2) {
            case 0:
                    System.out.println(num + " is a EVEN Number");
                    break;
            case 1:
                    System.out.println(num + " is ODD Number");
            
        }
    }
    
}
