Programming in Java
--------------------
# Java :
  - It is a programming language which is developed in 1991 by James Gosling and his teammates.
  
API's(Application Programming Interface) : It is set of classes,interfaces and methods

Save : ProgramName.java
Compile: javac ProgramName.java
Run    : Java ProgramName
  
# Features of Java
------------------
1. Simple
   - No Memory Allocation or Delocation Probem
   - No Ambiguties
   - No Pointer
2. OOP
   - It will implement the concept of Abstraction, Encapsulation, Inheritance and Polymorphism.
3. Portable
   - When we compile java program, It will be converted into a .class file i.e. byte code.
   - Due to byte code compilation process any os or hardware platform i.e. containing JVM(Java Virtual Machine).
     They can execute this byte code.
   
   Hello.java --------->Compile----------->Hello.class--------->Interpreter----------->Hello.exe, Hello.obj
   
4. Compiled and Interpreted 
   - Compiler as well as Interpreter
5. High Performance
6. Secure
   - Due to strong type checking in java, If any program is travelling from source to destination and it is tagged with any error or 
     virus. Destination system will not allow to execute this byte code.
   
7. Robust
   1. Garbage Collection
      - It is an implicit process which automatically frees memory from a memory space(Heap).
        - Heap - Permanent Memmory
        - Stack - Temporary Memmory
   2. Exception Handling
   3. Error Handling
8. Multithreaded
   - If you to perform more than one task simultaneously.
9. Distributed
   PIJ : WORA - Write once Run Anywhere
   JEE : WODA - Write once Deploy Anywhere.

--------------------------------------------------------------------------------------------------------------------------------------
   
Programming Construct in Java
-----------------------------
1. Package
   - It is similar kind of classes,interfaces and methods.
   For Example:
               - java.lang.*; // Default Package
               - java.util.*;
               - java.io.*;
               - java.nio.*;
               - java.sql.*;
               - javax.sql.*;
               
    import statement:
    ----------------
     import java.util.*; - All the classes
     import java.util.ArrayList;
     
2. Class
   - It is userdefined data type.
     for Example : School Management Software
                   class Student{}
                   class Mentor{}
                   class Attendance{}
                   
   - It is set of objects which shares common attributes and behaviour.
   - It is a bleuprint of an Object.

3. Object
   - It is an instance of a class.
4. Data Type
   2 types
   -------
   1. Primitive
      - Basic data type in Java
      - 8 Primitive data types
        1. byte : 1 byte
        2. short: 2 byte
        3. int : 4 byte
        4. long : 8 byte
        5. char : 2 byte
        6. float : 4 byte
        7. double : 8 byte
        8. boolean : 1 bite
        
   2. Non-Prinitive
        1. String
        2. Array
        3. Class
        
5. Variable:
   - It is named memory location where we can store value.
   Syntax: Data type name of the variable
            int x;
            
   Types of Variable
   ------------------
   1. Instance Variable
   2. Static Variable
   3. Local Variable
        
6. Access Specifier
   - It will determine in which way you are going to access member variable and member function from one class to another class or one package to another packages.
   
7. Methods
   - It is submodule of a program which will perform some actions.
   Syntax: access specifier return type method name(Param List){
                 // stmts
                 // stmts
   }
   
   public void display(){
   // stmt.
   }
   
Scanner Class
-------------
- It is a class which will accept input from user.
- It is there in java.util package.

for Example
-----------
int studentId
String name;
float fees;
char gender;

import java.util.Scanner;

Scanner scan=new Scanner(System.in);
studentId=scan.nextInt();
name=scan.next();
fees=scan.nextFloat();
gender=scan.next().charAt(0);


Maven:
------
- It is build management tool.
- Provide standard structure
- src---------------->main - java
                           - resources
                           
     ---------------->test - java
                           - resources
        
    ----------------->target - compiled classes
    
Maven Archetype
---------------
- maven-quickstart - Java Application
- maven-webapp - Web Application

Dependency Management
---------------------
- GAV Co-ordinates --------> Group Id, Artifact Id, Version
- Group ID : Company domain name
- Artifact ID : Project Name

POM ---> Project Object Model 
         Configuring project
         Configure your dependencies
         
Maven Central Repository
------------------------
         
local repository:
------------------
- users/.m2/repository - All the jar file will be stored here.

Conditonal Construct and Looping Construct
-------------------------------------------
1.if Statement
2.if-else Satement
3.if-else if-else
4.Switch Case

Looping Construct
------------------
1. While loop
2. do-while loop
3. for loop




                          




















   



   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
