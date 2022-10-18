Wrapper Class:
--------------
- There are 8 Wrapper classes which are equivalent to 8 primitive data types.

Primitive type                                Wrapper Class
1. byte                                       java.lang.Byte
2. short                                      java.lang.Short
3. int                                        java.lang.Integer
4. long                                       java.lang.Long
5. char                                       java.lang.Character
6. float                                      java.lang.Float
7. double                                     java.lang.Double
8. Boolean                                    java.lang.Boolean


Primitive ----------> Object - Boxing
Object -------------> Primitive - UnBoxing

for Example:
------------
int i=42;

Integer j=new Integer(i); // Boxing
int k=j.intValue(); // UnBoxing

Wrapper classes are useful in the following ways:
1. Wrapper classses are used to convert one data type to another data type.
2. We can convert primitive to object and object to primitive.

How to convert primitive to Wrapper objects ?
1. By using the corresponding constructor
2. By using valueOf(primitive type)
