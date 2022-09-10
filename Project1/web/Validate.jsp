


<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            try
            {
                String name=request.getParameter("name");
                String password=request.getParameter("password");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
                PreparedStatement ps=con.prepareStatement("select * from login where name="+name+" and password="+password+"");
                ps.setString(1, name);
                ps.setString(2, password);
                ResultSet rs=ps.executeQuery();
                int count=0;
                while(rs.next())
                {
                    count++;
                }
                if(count>0)
                {
                       out.println("Succesfully");
                }
                else
                {
                    out.println("Failed");
                }
            }
            catch(Exception e)
            {
                out.println(e);
            }
        %>
    </body>
</html>
