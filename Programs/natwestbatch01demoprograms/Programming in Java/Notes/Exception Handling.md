Exception Handling
-------------------

Exception
----------
- It is an abnormal situation of program.

for Example:
------------
   try
   {
1. int x;
   x=5.2f; // NumberFormatException

2. int x=10;
   int y=0;
   int z=x/y; // DivideByZeroException
   
3. int myArray[]=new int[5];
   myArray[5]=60; // ArrayIndexOutOfBoundsException
   
4. Employee e;
   e.getName(); // NullPointerException
   
5. FileInputStram obj=new FileInputStream("myfile.txt"); // FileNotFoundException
   }
   catch(Exception e){
   
   }
   
   Exception - It is the base class for all the exceptions.

Exception Handling
-------------------
- It is a process to handle abnormal situation of a program.
- There are 5 keywords which will help us to handle exception.

1. try
2. catch
3. finally
4. throws
5. throw

Userdefined Exception:
----------------------
- Are all exception classes written by developer.
- Writing the user defined exception
  - the class must extend either class Exception or Runtime Exception
  - if you want to create a checked exception extend class Exception.
  - if you want to create an unchecked exception extend class RuntimeException.






























