Object Class
-------------
- It is present in java.lang package.
- Every class in java is directly or indirectly derived from the Object class.
- It is root class for all the classes in java.

for Example
-----------
class Customer{

toString()
hashCode()
equals()

}

Object Class Method
-------------------
1. equals(Object obj):
------------
- It is overridden to check the state of equality of two objects.
- If we want to compare two primitive variables we can use "==" operator.
- It checks the content in those variable.
 for Example:
 ------------
 int a=10;
 int b=20;
 if(a==b){} // false
 
 - if we want to compare two reference variable , we have 2 options
 i) "==" Operator
     for Example:
                 Box b1=new Box(1,2,3);
                 Box b2=new Box(1,2,3);
                 
                 if(b1==b2){} // false
 ii) equals(Object obj)
      
      for Example:
                 Box b1=new Box(1,2,3);
                 Box b2=new Box(1,2,3);
                 
                 if(b1.equals(b2)){} // true
                 
--------------------------------------------------------------------------------------------------------------------------------

2.hashCode():
-------------
- It returns the hashcode value of an object in terms of integer.
- Hashcode is nothing but an identification number for an object which will be used by the JVM to search a particular object 
  among the multiple objects in the memory(Heap).
- If we don't want to use existing hashcode generation algorithm which is already available in JVM, you can use your own 
  algorithm by overriding hashcode method in your class.
--------------------------------------------------------------------------------------------------------------------------------

toString()
----------
- Method is generally overridden to give a String representation to an object.
- toString() method available in class Object returns the string which is a combination of classname+@+hexadecimal equivalent of   hashcode of an object.

for Example
-----------
Book: Book@72ea2f77

- If we want to return our own String representation instead of default format, you can do by overriding toString method in your 
  class.









  































