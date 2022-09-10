
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateAcc extends Student
{
    public void update()
    {
        try 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Student rollno");
            int rollno=sc.nextInt();
            
            System.out.println("Enter new  First name");
            String fname=sc.next();
            System.out.println("Enter new  Last name");
            String lname=sc.next();
                    
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Student","demo");
            
            PreparedStatement ps=con.prepareStatement("update Student set first_name=?,last_name=? where Rollno=?");
            ps.setString(1,fname);
            ps.setString(2, lname);
            ps.setInt(3, rollno);
            ps.executeUpdate();
            System.out.println("Data updated successfully!!!");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

