package main.java.com.basic.practice.employee;
//STEPS
//import
//load and register the driver
//create connection
//create a statement
//execute query
//process result
//close

import java.sql.*;


public class Demo {
    public static void main(String[] args) throws Exception {

        try{
//step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","sys","oracle");

//step3 create the statement object
            Statement stmt=con.createStatement();

//step4 execute query
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
