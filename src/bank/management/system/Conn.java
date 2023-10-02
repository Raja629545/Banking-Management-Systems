package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

   public Conn(){

       try {

           c= (Connection) DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","rajesh");
           s=c.createStatement();
       }
       catch (Exception e){
           System.out.println(e);
       }
   }




}
