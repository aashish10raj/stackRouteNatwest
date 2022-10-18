 # Framework
--------------
- It is set of reusable API's.
- Platform for developing application.
- Repeatative functionalities are done by the framework, so that we can focus on business logic.
- It is something which helps developer to ease a task.

# Spring Framework
--------------------
- It is most popular java framework.
- Initially written by Rod Johnson in 2003.
- Open Source
- Powerful
- Faster
- Flexible
- Secured

Features of Spring Framework
-----------------------------
1. Light Weight
----------------
- Because of it's POJO implementation.
- Doesn't force the programmer to inherit any class or implements any interface.

2. Framework of Frameworks:
---------------------------
- Supports many framework such as Struts,Hibernate and so on.

3. Loosely Coupling
--------------------
- Have a low dependency.
- If one class is not dependent on another class and both act independently.

For Example
-----------

class Employee{
private int employeeId;
private String name;
private Address address; // has-a

Employee(){
employeeId=1;
name="Hiranmai";
address=new Address(); // High Coupling
}

Employee(Address address){
this.address=address;
}

// getter & setter

// toString()

}

class Address{
private String city;
private String state;
private String zipCode;

// default constructor

// getter & setter

// toString()
}

class Main{

public static void main(String args[]){
Employee e=new Employee(); // Construction of Address object relise on Construction of Employee Object

Address a=new Address();
Employee e2=new Employee(a);
}
}

Loose Coupling : Dependency can be justified through constructor or setter method.
Instead of we create object we will inject the object by using dependency injection.

4. Dependency Injection:
-------------------------
- Flavours of IOC(Inversion of control)
- IOC is general concept and express in many different ways.

5. Aspect Oriented Programming
-------------------------------
- Used for cross cutting concern.
- Logging,Security and so on from the business application.

--------------------------------------------------------------------------------------------------------------------------------------

IOC(Inversion of Control)
-------------------------
- Creating the Object
- Managing their lifecycle
- Wiring them together
- Configuring

2 type of IOC Container
-----------------------
1. BeanFactory
   - It is an interface which will construct object based on request.
   - It is basic IOC Container.
2. ApplicationContext
   - It is an interface which is providing configuration information to an application.
   - It will construct object even though you don't request them.
   - It is advanced IOC Container.
   
   
--------------------------------------------------------------------------------------------------------------------------------------

1. Pojo Class
2. Add dependency
3. Spring Configuration file
4. Main Class

--------------------------------------------------------------------------------------------------------------------------------------

1. Lazy Loading
2. Eager Loading

-------------------------------------------------------------------------------------------------------------------------------------
Dependency Injection
---------------------
- It is design pattern which removes the dependency from programming code.
- It is focusing on how we can reduce coupling.
- It makes our programming code more loosely coupled which means change in implementation doesn't affect the user.

2 ways- Can Implement
---------------------
1. By Constructor: The <constructor-arg> subelement of <bean> tag is used for constructor Injection.
2. By Setter Method: The <property> subelement of <bean> tag is used for Setter Injection.
    
--------------------------------------------------------------------------------------------------------------------------------------

Autowiring
----------
- Till now, We have been performing bean injection manually by defining which would be injected where with the help of "ref"    
  attribute.
- It help us to inject the appropriate bean to another bean based on it's data type or it's id automatically.






















































