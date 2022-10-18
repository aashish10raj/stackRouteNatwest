Collection Framework
---------------------
Package : java.util.*;

Collection : Group of objects
Framework : It will provide set of reusable API's.

Student[] student=new Student[100];

1. Collection Interface
2. Map Interface


1. Collection Interface
------------------------
- It is nothing but group of similar data.
- It provide us an API to work with data structure such as lists, sets, maps, arrays, trees etc.
- It allows to add, retreive, update and delete a set of objects(CRUD Operation).

Collection framework has mainly 4 categories:

1. List - Used to store multiple objects with duplicates.
2. Set - Used to store multiple objects without duplicates.
3. Queue - Used to hold the elements about to processed in FIFO or FCFS order.
4. Map - Used to store key-value pairs.

Non-Generic Collection
----------------------
- Collection of different kinds of objects.

for example:

Generic Collection
-------------------
- Collection of same type of object.
- Means parametrized types.
- Add the type safety feature.



List Interface
--------------
- It is an interface which is extending Collection Interface.
- It is used to store multiple objects with duplicates.
- It will add element in natural order
- It is an ordered collection.

2 classes
----------
1. ArrayList
2. LinkedList

--------------------------------------------------------------------------------------------------------------------------------------

Comparable Interface and Comparator Interface
----------------------------------------------
- Sorting the collection

Collection - Interface
Collections - Class

Comparable Interface
---------------------
- It is there in java.lang pacakage.
- Default Sorting mechanism in natural order
- Single Sorting
- Wrapper classes and String class
- compareTo Method.

Comparator Interface
--------------------
- It is there in java.util package.
- Customised Sorting
- Multi sorting sequence
- compare()
- equals()

-------------------------------------------------------------------------------------------------------------------------------------

Unordered Collection
---------------------
Set Interface
--------------
- It is an interface which is extending collection interface.
- It is used to store multiple objects without duplicates.
- It will add element in custom order.
- It is an unordered collection.

2 classes
---------
1. HashSet
2. TreeSet


Map Interface
--------------
- A Map is an object which stores key/value pairs.
- Both key and value are object.
- Given a key, you can find it's value.
- The key must be unique, but you can have duplicate values.
- Some map allow null keys and null values, others don't.

keySet:Set - return the keys
values:Collection - return the values
entrySet:Set - return key and value pairs.

3 classes 
----------
1. HashMap
2. TreeMap
3. Hashtable

Map.Entry interface in Java provides certain methods to access the entry in the Map. By gaining access to the entry of the Map we can easily manipulate them. Map.Entry is a generic and is defined in the java.util package.

Declaration :

Interface Map.Entry
k -> Key
V -> Value

Queue Interface
---------------
FIFO

A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value.


	      Throws exception	  Returns special value
Insert	   add(e)	              offer(e)
Remove	   remove()	              poll()
Examine	   element()	          peek()














































