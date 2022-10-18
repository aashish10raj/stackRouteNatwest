DBMS(Database Management System)
--------------------------------
- It is used to manage database.
- A DBMS is a software designed to store, retrieve, define and manage database.

Database:
---------
- It is a collection of logically related information.

RDBMS(Relational database Management System)
--------------------------------------------
Relational Database concept
---------------------------
- Dr. E.F. codd proposed the relational model for database system in 1970.
- It is basis for the RDBMS.
- The relational model consists of the following:
  - Collection of objects or relations
  - Set of operators to act on the relations
  - Data Integrity for accuracy and consistency.
  
  A-------------------------------------------B
  
  Relation: Table
  Tuple: Rows
  Columns: Attribute
  
  Table: It is the collection of records
  
  ER Diagram
  -----------
  
  Database Operation
  ------------------
  
  DDL(Data Definition Language)
  -----------------------------
  Create
  Alter
  Drop
  
  DML(Data Manipulation Language)
  -------------------------------
  Insert
  Update 
  Delete
  
  DQL(Data Query Language)
  ------------------------
  Select
  
  Writing SQL(Structure Query Language) statements
  ------------------------------------------------
  - Sql statements are not case-sensitive.
  - Sql statements can be on one or more lines.
  - Keywords cannot be abbreviated or split across lines.
  - Clauses are usually placed in separate lines.
  - Indents are used to enhance redability.
  
  SQL Queries
  ------------
  
  create database hr;
  
  show databases;
  
  use hr;
  
  Create table Employee(
  
  )
  
  
  -----------------------------------------------------------------------------------------------------------------------------------
  
create database hr;
show databases;
use hr;

--- Create table ---
create table Employee(
empid int primary key,
name varchar(30),
address varchar(70),
salary double
);

describe Employee;

----- Retrieve Data -----
select * from Employee;

------ Insert Data in a Table ------------
insert into Employee values(100, 'Steve', 'London', 7000.00);
insert into Employee values(111, 'Shane', 'Paris', 9000.00);
insert into Employee values(122, 'Andy', 'Mumbai', 11000.00);
insert into Employee values(133, 'Peter', 'Delhi', 12000.00);
insert into Employee values(144, 'Tina', 'Lukhnow', 7000.00);
insert into Employee values(155, 'John', 'Bangalore', 7000.00);

Select empid,name from Employee;

Select empid,name,salary+salary*.4 "Gross Salary" from Employee;

select * from Employee
where salary>9000;

------ Update data in a table --------
update Employee set salary=15000
where empid=155;

update Employee set age=21
where empid=100;
update Employee set age=24
where empid=111;
update Employee set age=40
where empid=122;
update Employee set age=28
where empid=133;
update Employee set age=27
where empid=144;
update Employee set age=35
where empid=155;


create table Employee11(
empid int primary key,
name varchar(30),
address varchar(70),
salary double
);

insert into Employee11 values(100, 'Steve', 'London', 7000.00);
insert into Employee11 values(111, 'Shane', 'Paris', 9000.00);
insert into Employee11 values(122, 'Andy', 'Mumbai', 11000.00);
insert into Employee11 values(133, 'Peter', 'Delhi', 12000.00);
insert into Employee11 values(144, 'Tina', 'Lukhnow', 7000.00);
insert into Employee11 values(155, 'John', 'Bangalore', 7000.00);

select * from Employee11;

------ delete data in table ---------

delete from Employee11
where empid=144;

delete from Employee11;

select * from Employee;

------- Alter Table-------
alter table Employee add age int;
describe Employee;

------ Drop Table ----------
drop table Employee11;
describe Employee11;

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


