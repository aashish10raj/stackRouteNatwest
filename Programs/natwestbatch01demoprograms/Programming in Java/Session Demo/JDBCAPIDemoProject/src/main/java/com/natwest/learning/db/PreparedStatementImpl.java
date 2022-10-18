package com.natwest.learning.db;

import java.sql.*;

public class PreparedStatementImpl {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing a connection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","password123");
        // Creating and executing SQL statements
        PreparedStatement statement=connection.prepareStatement("insert into Customer values(?,?,?,?)");
        statement.setInt(1,4);
        statement.setString(2,"Steve");
        statement.setString(3, "Steve@gmail.com");
        statement.setString(4,"9653675432");
        statement.executeUpdate();
        System.out.println("Record Successfuly inserted");


    }
}
