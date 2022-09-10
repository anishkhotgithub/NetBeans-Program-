package insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo 
{

    public static void main(String[] args)
    {
        try 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employee id");
            int id=sc.nextInt();
            
            System.out.println("Enter employee name");
            String name=sc.next();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Employee","demo","demo");
            
            PreparedStatement ps=con.prepareStatement("insert into employees values(?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Data inserted sucessfully");
            
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    
}
