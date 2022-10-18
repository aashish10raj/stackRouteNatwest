package com.natwest.learning.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataImpl {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing a connection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","password123");
        // Creating and executing SQL statements
        String str1="insert into Customer values(1,'Haresh','Haresh@gmail.com',9876543211)";
        String str2="insert into Customer values(2,'Gaurav','Gaurav@gmail.com',98765435678)";
        String str3="insert into Customer values(3,'Araghya','Arghya@gmail.com',9156543211)";
        Statement statement=connection.createStatement();
        int count1=statement.executeUpdate(str1);
        int count2=statement.executeUpdate(str2);
        int count3=statement.executeUpdate(str3);

        System.out.println("Record sucessfuly inserted");

    }
}
