
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception 
{

    public static void main(String[] args) 
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            int c=a+b;
            System.out.println("Your value is"+c);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
    
}
