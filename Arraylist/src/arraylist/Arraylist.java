package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist
{

    public static void main(String[] args)
    {
        List l=new ArrayList();
        System.out.println("Enter the input");
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        l.add(a);
        System.out.println(l);
    }
    
}
