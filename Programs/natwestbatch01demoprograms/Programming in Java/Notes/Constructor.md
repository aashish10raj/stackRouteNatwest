Constructor:
------------
- It is a special method of a class, same name as a class name, no return type.
- Whenever constructor will invoke object will get initialized.

2 types
--------
1. Default Constructor       // new XXX();
2. Parameterized Constructor 

Constructor OverLoading:
------------------------
Constructor with same name and different parameter is called Constructor Overloading.

Static Keyword
--------------

Static Variable:
-----------------
When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level.

static String college;

Static variables are essentially,global variables. All Instances of the class share the same static variable.

Static Methods:
---------------
When a method is declared with static keyword, It is known as static method.
The most common example of a static method is main() method.

Final Keyword
--------------

Final Variable:
----------------
When a variable is declared with final keyword, it's value can't be modified, essentially, a constant. This also means that you must intialize a final variable.

final int pin=1234;
pin=12345; // compilation error
          
Final Method:
------------
When a method is declared with final keyword, It is called a final method. A final method cannot be overridden.

final void run(){} // Method can't be Overridden

Final Class
-----------
When a class is declared with final keyword , It is called final class. A final class can not be extended(inherited);

final class A{

}
class B extends A{} // compilation error































