
package deletedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {

    public static void main(String[] args)
    {
        try 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id");
            int id=sc.nextInt();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Employee","demo","demo");
            PreparedStatement ps=con.prepareStatement("delete from employees where employeeid=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data deleted successfully!!");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    
}
