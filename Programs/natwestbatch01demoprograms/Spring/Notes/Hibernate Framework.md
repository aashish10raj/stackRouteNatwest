Hibernate Framework
--------------------

Pros and Cons of JDBC
----------------------

Advantages
----------
- Can handle large data
- Simple query processing
- Simple symtx

Issues
-------
- In large projects implementing JDBC would be difficult.
- Additional programming overhead
- No Encapsultion
- Hard to implement in mvc concept.
- Query is database specific.

OOP's Vs RDBMS
---------------
1. Granularity:
---------------
- One Java class can have more than on table, on the other hand it is also possible the data of one table can be mapped with more than a class in the OOP's.

For Example:

class Student{
Address address;
Result  result;
Attendance attendnce;
}

claas Address{

}
class Result{
Attendance attendance;

}
class Attendance{

}

2. Inheritance
---------------
- It is a feature of oop's but not available in RDBMS.
3. Association
---------------
- In RDBMS, We have constraint specifically the foreign key constraint. Constraints are not available in oop's.

4. Identity
------------
- Primary key is there in RDBMS, but in java we check the equality with the helps of equals method using the hashcode of the object.

Introducing ORM as a Solution
------------------------------
Object Relational Mapping
--------------------------
ORM Tool------------> JDBC

Pros and Cons of ORM Tools
--------------------------
- You can work with java objects rather than RDBMS tables.
- SQL queries would be hidden from OO logic.
- Based on JDBC
- The developer doesn't need to interact with RDBMS solution. Now it is responsibility of the ORM Tool.
- Transaction Management, Autogeneration of primary key would be taken care by ORM.
- Fast Application Development.

Components of an ORM Solution
-----------------------------
- An API to perform basic CRUD operations on object rather than persistent classes.
- An API would be needed where queries can be specified which will refer to class and properties.
- Configuration to hold mapping data.
- A technique to interact with transactional object.

List of Java Based ORM Frameworks/Tools
---------------------------------------
1. Hibernate
2. EJB
3. Spring DAO
4. Castor
5. TopLink

Hibernate
----------
- It is orm tool.
- It creates mapping between java classes and database objects and their data types and takes a load of most of the common data persistence programming task.

Hibernate Features and advantages
---------------------------------
1. Take care of mapping in non-invasive way.
2. Provide a way in which we can directly store, retrieve and modify java objects from database table.
3. If there is change in either the table structure or the java class, you can just modify the hibernate config.
4. It will generate the SQL queries.
5. Caching

for Example:

save(student) -------> insert ------------>JDBC API ---------------> Database
get(1) ----------> select ----------> JDBC API -------------------> ResultSet ----------------> Generating the Java Object ------> Object

Supported RDBMS Solution
-------------------------
- MySQL

SessionFactory
--------------
- Provide Session instances.
- immutable
- It holds all the metadata required for object relational mapping
- It maintains second level cache.


Session
--------
- It is main interface which will interact between java application and hibernate.
- Life of session depends on completion of the transaction.
- Create, Read, Update, Delete

Sate of instance
-----------------
1. Transient - Object instance is created but not saved.
2. Persistent - Object state is saved in DB.
3. Detached - Session object gets closed, instance will be in detached.

Dependencies
------------
- commons-dbcp2
- hibernate core
- spring orm
- spring jdbc
- mysql connector
- jax-b

HQL
---
- Hibernate Query Language
- Table name - Class name
- Column name - Fields name

sql : Select * from tablename;
hql : from classname;
































