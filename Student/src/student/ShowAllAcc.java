package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowAllAcc 
{
    public void ShowAllAccount()
    {
         try 
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Student","demo");
            
            PreparedStatement ps=con.prepareStatement("select * from Student");
            ResultSet rs=ps.executeQuery();
            
            
            while(rs.next())
            {
                System.out.println("Student rollno: "+rs.getInt("Rollno"));
                System.out.println("Student Fname: "+rs.getString(2));
                System.out.println("Student Lname: "+rs.getString(3));
                System.out.println("Student Email: "+rs.getString(4));
                System.out.println("Student mobile:"+rs.getString(5));
                System.out.println("");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

