
package lab.pkg2;

import java.util.Scanner;




public class ifelse {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    
System.out.print("Enter  number- ");  
double a= sc.nextDouble();  

if(a<18.5)
{
    System.out.println("under weight");
}
   
else if(18.5>a && a<24.9 )
{
    System.out.println("healthy");
}
else if(25>a && a<29.9)
{
    System.out.println("over weight");
}
else if(30>a && a<39.9)
{
    System.out.println("obese");
}
else 
{
    System.out.println("not found");
}
         
         
     }
    
}
