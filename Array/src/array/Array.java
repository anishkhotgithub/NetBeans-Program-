
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Array {

    public static void main(String[] args) 
    {
        final int NO_OF_STUDENT=5;
        int[] marks=new int[NO_OF_STUDENT];
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<NO_OF_STUDENT;i++)
            {
                System.out.println("Enter Marks of Student #"+(i+1)+":");
                String str=br.readLine();
                marks[i]=Integer.parseInt(str);
            } 
        }
        catch(Exception e)
        {
           e.printStackTrace();
           //System.out.println(e);
        }    
        int total=0;
        for(int i=0;i<NO_OF_STUDENT;i++)
        {
            total +=marks[i];
        }
        System.out.println("Average Marks is"+(float)total/NO_OF_STUDENT); 
    }
    
}
