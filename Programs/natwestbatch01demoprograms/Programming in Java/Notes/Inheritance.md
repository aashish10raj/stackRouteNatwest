# Inheritance
--------------
- It is a process which one object acquires the properties of another object.
- This is important because it supports hierarchial classfication.

# Benifits of Inheritance
-------------------------
1. Code Reusability
2. Stop Data Redundancy
3. Save time and cost

Rule: Super class --------------- is-a----------------Sub class

Super class : The class whose features are inherited is known as super class.

Sub class : The class that inherits the other class is known as sub class.

Syntax:
-------
class sub-class extends super-class{}

Types of Inheritance
--------------------
1. Single level
2. Multi level
3. Hierarchial

For Example:
-------------

class A{
// Attribute
// Behaviour
}
// Single level Inheritance
class B extends A{

}


class A{
// Attribute
// Behaviour
}
class B extends A{

}
// Multi level Inheritance
class C extends B{

}
// Hierarchial Inheritance
class A{
// Attribute
// Behaviour
}
class B extends A{

}

class C extends A{

}
class D extends A{

}

# RelationShip
---------------
1. is-a : Sub class is the type of Super class or not
2. has-a
  for example:
  class Student{
  Address address; // has-a
  }
  
  class Car{
  Engine engine; // has-a
  }






















