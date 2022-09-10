
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DeleteAcc 
{
    public void DeleteAccount()
    {
         try 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Rollno");
            int rollno=sc.nextInt();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Student","demo");
            PreparedStatement ps=con.prepareStatement("delete from Student where Rollno=?");
            ps.setInt(1, rollno);
            ps.executeUpdate();
            System.out.println("Data deleted successfully!!");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
 
}
