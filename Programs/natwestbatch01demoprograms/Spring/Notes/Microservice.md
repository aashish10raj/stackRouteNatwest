Monolithic Application
----------------------
- Entire application will run in single unit.

Pros:
-----
- Easy to develop
- Cross cutting concerns such as logging, rate limiting or transaction management can be done easily.
- Single Application Repository, hence simpler management.
- Easy branching and tagging

Cons:
-----
- Application is large and complex.
- Web container is overloaded.
- CI/CD implementation would be difficult.
- Application Scaling can be possible only in one way.
- Commitment to a single tech stack

For Example:
------------
IRCTC - Ahead of the time

CGI PERL ------> 40000 Concurrent Users

CGI PERL --------> Java Tech Stack

40000 Concurrent Users --------------> 120000 Concurrent Users

Microservice Architecture
--------------------------
Microsservice
--------------
- Microservice Architecture is an architectural style that structures an application as a collection of small autononous services modeled around a business domain.

Features of Microservice
-------------------------
- small focused
- loosely coupled
- language neutral
- bounded context

Advantages of Microservices
---------------------------
- Small development team.
- Each microservices can have it's own development and release cycle.
- Independent development
- Fault isolation
- mixted tech stack
- granular scaling
- simple and fast implementation of CI/CD.
- If there is need to change a part of the application, only that microservice will change.

Disadvantages of Microservices
-------------------------------
- testing is complicated and tedious.
- issues like fault tolerance, network latency will have to be taken care of.
- there is possibility of duplication of efforts
- developer will have to additionally think of the communication between microservices separately.

Spring Boot and Microservice
----------------------------
- Embeded Server
- Metrics(dev tools)
- Health Check
- Externalize configuration(application.properties/application.yml)

            // mysql                                       // mongo                                  // DB2
Development(Own Laptop/Server)------------------->Staging(Data Center/Cloud)----------------->QA(Data Center/Cloud)------------------> Production(Data Center/Cloud)



























