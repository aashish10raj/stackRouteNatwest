Stream API
----------
Stream
------
- Sequence of objects which you can get from an array,collection or IO resources.
- Perform operation on the data from the datastructure.

Stream Operations: 2 types
--------------------------
1. Intermediate Operation:
--------------------------
   - Lazily evaluated
   - Don't close stream.
   - Return back to stream
   - Chain multiple operations
   - filtering, limit, transform the stream, sort etc......
   
2. Terminal Operation:
-----------------------
  - End the Stream
  - Stream can't be used again
  - Displaying, Store them in different collection etc......
  
Working with Stream
--------------------
- Create a Stream from the datasource,
- Perform intermediate operation
- Perform terminal operation.

I1------->I2---------->I3------------>I4-------------->I5------------->I1

Creating a Stream from DataSource
----------------------------------
Integer[] arr= ------------;

Stream<Integer> nums=Array.stream(arr);
    
Intermediate Operation:
------------------------
filter(Predicate) - Filtering objects in a stream
limit(int)
distinct()
skip()
sorted()
sorted(Comparator)
map(Function) - Transforming Stream from one type to another type.

Terminal Operation
------------------
forEach(Consumer)
toArray()
collect() - Store the stream objects in new collection
Searching - findAny(), findFirst()
Matching - anyMatch(), allMatch(), noneMatch()
Aggregate Operations - sum(), count(), max(), average(), min().


Predefined Functional Interface
-------------------------------
Predicate -> take an input return boolean.
BiPredicate
Consumer -> takes an input doesn't return anything
BiConsumer
Function -> Takes one input parameter and return result
BiFunction
Supplier -> Doesn't take any input parameter but returns a result.



list.forEach(p->System.out.println(p));

list.forEach(System.out::println);




















