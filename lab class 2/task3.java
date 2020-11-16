
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" please enter the number : ");
        int num1 = inp.nextInt();
        System.out.println(" Entered  " +num1);
        int num2 = inp.nextInt();
        System.out.println(" Entered  " +num2);
        
        
        if (num1>num2)
        {
            System.out.println( num1+" is greater than  " +num2);
        }
        else if(num2>num1)
        {
            System.out.println( num2+" is greater than  " +num1 );
        }
        else
        {
            System.out.println( num1+ "and" +num2+ "are equal ");
        }
    }
    
}
