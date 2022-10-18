# Difference between Spring and Spring Boot .
	
1. - Spring is an open-source lightweight framework widely used to develop enterprise  
     applications.	
   - Spring Boot is built on top of the conventional spring framework, widely used to  
     develop REST APIs.
2. - The most important feature of the Spring Framework is dependency injection.	
   - The most important feature of the Spring Boot is Autoconfiguration.
3. - It helps to create a loosely coupled application.	
   - It helps to create a stand-alone application.
4. - To run the Spring application, we need to set the server explicitly.	
   - Spring Boot provides embedded servers such as Tomcat and Jetty etc.
5. - To run the Spring application, a deployment descriptor is required.	
   - There is no requirement for a deployment descriptor.
6. - To create a Spring application, the developers write lots of code.	
   - It reduces the lines of code.
7. - It doesn’t provide support for the in-memory database.	
   - It provides support for the in-memory database such as H2.
# Difference between JPARepository and CRUDRepository.
JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository.

Their main functions are:

CrudRepository mainly provides CRUD functions.

PagingAndSortingRepository provides methods to do pagination and sorting records.

JpaRepository provides some JPA-related methods such as flushing the persistence context and deleting records in a batch.

Because of the inheritance mentioned above, JpaRepository will have all the functions of CrudRepository and PagingAndSortingRepository. So if you don't need the repository to have the functions provided by JpaRepository and PagingAndSortingRepository , use CrudRepository.
# Why do we use Restful webservice?
# Why do we use JPA repository ?
# Can we write our own queries in repository class ?
# What is the use of @entity annotation ?
# Monolithic Application Vs Microservice Architecture ?
# Polyglot Persistence?
# JWT Authentication ?
# Service discovery and API Gateway ?
# Synchronous Vs Asynchronous Microservice communication ?