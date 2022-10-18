package com.natwest.learning.db;

import java.sql.*;

public class CrudOperationImpl {
    private Connection connection=null;
    private Statement statement=null;
    private ResultSet rs=null;

    public void displayCustomer() throws ClassNotFoundException, SQLException {
            // Loading a driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing a connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","password123");
            System.out.println("Connected");
            // Creating and executing SQL statements
             statement=connection.createStatement();
             rs=statement.executeQuery("Select * from Customer");

             while(rs.next()){
                 System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4));
             }
             connection.close();

    }
}
