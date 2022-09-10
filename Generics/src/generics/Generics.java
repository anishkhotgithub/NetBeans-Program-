
package generics;

import java.util.Scanner;


public class Generics 
{
    public<T> void display(T a[])
    {
        for(T i : a)
        {
            System.out.println(i);
        }
            
    }

    public static void main(String[] args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter integer number");
           Integer arr1 =sc.nextInt();
           
           System.out.println("Enter Float number");
           Float arr2 =sc.nextFloat();
           
           System.out.println("Enter Character");
           String arr3 =sc.next();
           
           Generics gd=new Generics();
           gd.display(args);
    }
    
}
