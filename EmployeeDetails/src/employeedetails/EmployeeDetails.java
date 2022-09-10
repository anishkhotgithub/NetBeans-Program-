
package employeedetails;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Student
{
    public  void ShowDetails()
    {
        Scanner sc=new Scanner(System.in);
        String Employeename,EmpId;
        
        System.out.println("Enter Name:");
        Employeename=sc.next();
        
        System.out.println("Your Id:");
        EmpId =sc.next();
    }

    OutputStream ShowDetails(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class EmployeeDetails {

   
    public static void main(String[] args) throws Exception
    {
        Student s=new Student();
        String line="";
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.ShowDetails(System.in))))
         {
            s.ShowDetails();
            line=br.readLine();
            System.out.println("File copied Successfully!!!");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }

        
        
    }
    
}
