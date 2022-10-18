String Class
-------------
- It is a final class available in java.lang package which represents a group of characters.
- It is fixed in length and immutable.
  
  for Example: 
               String str1="Hello";
               System.out.println(str1); // Hello
                      str1="Hello World";
                      System.out.println(str1); // Hello World
                      
- Strings are generally used when we want to have constant in our program.

2 ways - Create a String Object
--------------------------------
1. By using String literal:
   
   for example:
   ------------
    String str="NatWest";
    
2. By using new Operator
-------------------------
   for example:
                String str1=new String("Sam");
                
- Only String class has the fascility to create the object without the "new" operator.
- There is concept of pooling only for String objects in Java. This has been done for optimum usage of the memory.

String str={"NatWest", "RBS", "IT"}

String Operations:
------------------
1. concat()
2. equals()
3. compareTo()
4. toCharArray()
5. toLowerCase()
6. toUpperCase()
7. substring()


































   
    
    