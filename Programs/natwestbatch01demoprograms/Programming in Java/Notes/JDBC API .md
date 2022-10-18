JDBC API
---------
- Java Database connectivity(JDBC) is an API for the Java, which defines how a client may access a database.

  = java.sql.*;
  - javax.sql.*;

The JDBC API provides the following interfaces and classes −

DriverManager − This class manages a list of database drivers. Matches connection requests from the java application with the proper database driver using communication sub protocol. The first driver that recognizes a certain subprotocol under JDBC will be used to establish a database Connection.

Driver − This interface handles the communications with the database server. You will interact directly with Driver objects very rarely. Instead, you use DriverManager objects, which manages objects of this type. It also abstracts the details associated with working with Driver objects.

Connection − This interface with all methods for contacting a database. The connection object represents communication context, i.e., all communication with database is through connection object only.

Statement − You use objects created from this interface to submit the SQL statements to the database. Some derived interfaces accept parameters in addition to executing stored procedures.

ResultSet − These objects hold data retrieved from a database after you execute an SQL query using Statement objects. It acts as an iterator to allow you to move through its data.

SQLException − This class handles any errors that occur in a database application.

Steps to connect the database
------------------------------
try{
1. Loading a Driver:
----------------------
java.lang.Class
forName() - static method of Class

Class.forName("Driver Name");

2. Establishing a Connection

Connection con=DriverManager.getConnection("URL", "Uname", "Password");

3. Creating and Executing SQL Statements
    
    String str="SQL Statements";
    
    Statement stat=con.createStatement();
    
    int count=stat.executeUpdate(str);
    
4. Handling SQL Exception
}catch(SQLException | ClassNotFoundException e){

}

Database Operation
-------------------
DDL : execute():boolen
create
alter
drop

DML : executeUpdate() : int
insert
update
delete

DQL : executeQuery(): ResultSet

Select

















































