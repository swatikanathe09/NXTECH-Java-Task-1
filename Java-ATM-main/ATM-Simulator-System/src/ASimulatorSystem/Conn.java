package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            System.out.println("for connection");
                    String url="jdbc:mysql://localhost:3306/bankmanagementsystem";
                    Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
            s =c.createStatement(); 
            }catch(Exception e)
            { 
            System.out.println(e);
            }
         if(c!=null)
                   System.out.println("Connection Establish");
                   else
                   System.out.println("no");
    }  
}  