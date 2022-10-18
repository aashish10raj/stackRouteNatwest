Spring Data
-----------
- It is another project of Spring Framework.
- Umbrella Project
- By default it will use Hibernate ORM as framework.

Spring Data is Spring-based programming model for data access. It reduces the amount of code needed for working with databases and datastores. It consists of several modules. The Spring Data JPA simplifies the development of Spring applications that use JPA technology.



Repository Interface
--------------------
- It is an interface.
- Have all the methods to perform CRUD.

With Spring Data, we define a repository interface for each domain entity in the application. A repository contains methods for performing CRUD operations, sorting and paginating data. @Repository is a marker annotation, which indicates that the underlying interface is a repository.

Spring Data JPA
---------------
1. CrudRepository
2. JpaRepository


Spring Boot + Restful Web Service + Spring Data JPA

Request ---------> Controller -----------> Service -----------------> DAO/Repository -----------------------> DB