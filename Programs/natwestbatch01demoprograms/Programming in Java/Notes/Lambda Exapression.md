Java7 - OOP
------------
Java8 - Functional Programming
-------------------------------
- Java8 new features has been introduced to enable functional programming in Java.
- Concise the coding of Java.

1. Lambda Expression
2. Functional Interface
3. Stream API
4. Using default and static keyword
5. Optional class
6. Date & Time API

Lambda Expression
------------------
- Lambda Expression are new in Java8.
- The main purpose of Lambda Expression is to bring functional programming in java.
  1. Function which don't have a name.
  2. It can be assigned to a variable.
  3. Passed as parameters to other methods.
  4. More readable less verbose.
  
  Syntax:
  -------
            lambda operator -> body
             ()->{body of the functions}
        ???  multiply=(int a, int b)->{return a*b};
        for example:
        public String convertToLowerCase(String s){
        // stmt
        }
Lambda: (String s)->{
 // stmt
}
Rule : It should have functional interface.

Functional Interface
--------------------
- It is SAM(Single Abstract Method) interface.
- An interface which have exactly one Abstract method.
- You may have default and static methods.

for example:Comparable, Comparator, Runnable etc.

@FunctionalInterface
interface Dream{
void everyDayDream(); // SAM
// void everyDayFortune();  // compilation error
default void everyDayFortune(){
// stmt
}
}

Comparator Interface
--------------------

public int compare(Object o1, Object o2){

}



































