File Handling
-------------
java.io;
i-input - Read
o-output - Write

File : Collection of data
--------------------------

File Operations
---------------

Stream: A flow of data from source to destination is called stream.

source -------------------------------------- destination

Java supports 2 types of stream:
---------------------------------
1. Byte Stream
   - Read or write data inform of bytes
   - 1 byte=8 bits
   - Object, Audio file, image file etc.
2. Character Stream
   - Read or write data inform of character
   - 1 char = 2 byte = 16 bits
   - Web Application and Websites
   
--------------------------------------------------------------------------------------------------------------------------------------
InputStream:
 - FileInputStream
 - BufferedInputStream
 - DataInputStream
 
FileInputStream Class
----------------------
- This stream is used for reading data from files.
- Object can be created using the new keyword and there are several types of constructor available.
  for eaxmple:
  FileInputStream fis=new FileInputStream("Path");
  
--------------------------------------------------------------------------------------------------------------------------------------
OutputStream:
  - FileOutputStream
  - BufferedOutputStream
  - DataOutputStream
  
FileOutputStream
-----------------
- It is used to create a file and write data into it.
- This stream would create a file, if it doesn't already exists, before opening it for output.
  for example:
  ------------
  FileOutputStream fos=new FileOutputStream("file_name");
  -----------------------------------------------------------------------------------------------------------------------------------
  
  Reader
  FileReader
  BufferedReader
  InputStreamReader
  
  -----------------------------------------------------------------------------------------------------------------------------------
  Writer
  FileWriter
  BufferedWriter
  OutputStreamWriter
  -----------------------------------------------------------------------------------------------------------------------------------
  DataInputStream
  ----------------
  - It allows an application to read primitive data from the input stream in machine independent way.
  
  DataOutputStream
  ----------------
  - It allows an application to write primitive data types to the output stream in machine independent way.
  
  Source ----------FileInputStream-------------------BufferedInputStream--------------DataInputStream -----------Read
  
  DataOutputStream ------------ BufferedOutputStream-------------FileOutputStream---------------Destination -------- Write
  
  ------------------------------------------------------------------------------------------------------------------------------------
  
  Serialization
  --------------
  - It is a mechanism of writing the state of an object into a byte stream.
  - It is mainly used in Hibernate, JPA, JMS technologies etc.
  - The reverse operation of Serailization is called Deseralization.
  
  Serializable Interface
  ----------------------
  - It is marker interface.
  interface x{
  
  }
  - It is used to "mark" java classes so that objects of these classes may get certain capability.
  - It must be implemented by the class whose object you want to persist.
  
ObjectOutputStream 
------------------
- It is used to write primitive data type and objects to an output stream.

ObjectInputStream
-----------------
- It deserializes objects and primitive data written using ObjectOutputStream.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
