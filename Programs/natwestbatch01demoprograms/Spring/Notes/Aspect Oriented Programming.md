Aspect Oriented Programming
---------------------------

# Aspect
---------
- Classes which provide support to create independent modules, that cuts across multiple classes.

JoinPoint
---------
- Specific point of method execution.
- Execution of Method

Advice
------
- Modules
- Methods which gets called before/after target methods.
- Loggers

1. @Before: Get Called before the target method.
----------

2. @After: Get Called after the target method.
-----------

3.@AfterReturning: Get Called after the target method only if there is no exception.
------------------

4.@AfterThrowing: Get Called after the target method only if there is throwing exception.
-----------------

5.@Around: surrounds the(JoinPoint) target Method.
---------

PointCut
---------
- Cross cutting concern
- It will cuts between execution of program and perform task.
- Are expression that require to invoke advice.

--------------------------------------------------------------------------------------------------------------------------------------
Logger:
       - java.util.logging.Logger
       - getLogger()
       - info()
       - fine()
       - severe()
       - warning()

HandlerClasses
---------------
       - ConsoleHandler
       
Limitation:
-----------
- Performance is not upto mark and difficult to handle for 2 different application.
- Due to that we move from this external libraries.

External Libraries for Logging :
------------------------------
- Log4j- Log4j12
- Logback

Levels
------
- debug()
- info()
- error()

Appenders:
- ConsoleAppender
- FileAppender


A application --------------> Log4j
B application --------------> Logback

Facade Libraries
----------------
- Libraries with only method definition but no implementation.
- SLF4J
- Apache Commons

SLF4J:
-----
A appliaction ------------>SLF4J------------>Log4j
B application ------------>SLF4J------------> Logback

debug
-----
- debug
- info
- warn
- error

info
-----
- info
- warn 
- error

Repository Layer

Service Layer

Controller Layer


       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       


