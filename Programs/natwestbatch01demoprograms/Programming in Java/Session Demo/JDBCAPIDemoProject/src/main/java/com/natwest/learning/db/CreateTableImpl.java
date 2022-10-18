package com.natwest.learning.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableImpl {
    public static void main(String[] args) {
        // Creating Table
        try {
            // Loading a driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing a connection
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","password123");
            // Creating and executing SQL statements
            Statement statement=connection.createStatement();

            boolean a=statement.execute("create table Customer(customerId int, name varchar(25), email varchar(20), mobNo varchar(12))");
            System.out.println(a);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
