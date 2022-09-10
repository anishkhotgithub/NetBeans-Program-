package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateAcc
{
    public void CreateAccount()
    {
        try 
        {
            System.out.println("To create an account try to insert the data");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Rollno:");
            int rollno=sc.nextInt();
            System.out.println("Enter FirstName:");
            String fname=sc.next();
            System.out.println("Enter LastName:");
            String Lname=sc.next();
            System.out.println("Enter Email:");
            String Email=sc.next();
            System.out.println("Mobile no");
            String mobile=sc.next();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Student","demo");
            
            PreparedStatement ps=con.prepareStatement("insert into Student values(?,?,?,?,?)");
            ps.setInt(1, rollno);
            ps.setString(2, fname);
            ps.setString(3,Lname);
            ps.setString(4, Email);
            ps.setString(5, mobile);
            ps.executeUpdate();
            System.out.println("Data inserted sucessfully");
            
           
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
