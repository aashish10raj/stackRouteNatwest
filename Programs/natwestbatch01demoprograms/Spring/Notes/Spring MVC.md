Web Application:
----------------
- In web application the response will be generated dynamically as per the client.
  For Example:
               - Online Netbanking
               - Netflix
               - IRCTC
     Web Client: It is an application which will send the request to server.
     Web Server: It is an application which will process the request and send back response to a client.               
               
  1. Servlet
     - It is a java program which will runs in web server and it will enhance and extend the functionality of web server.
     - Inside a JavaCode HTML Code is embeded.
     - Inside a dynamic content HTML Content is embeded.
     
     
    
  2. JSP 
     - It is used to create Web application.
     - Inside a HTML Code Java Code is embeded.
     
---------------------------------------------------------------------------------------------------------------------------------------
MVC Architecture 
-----------------
M - Model - POJO
V - View - JSP
C - Controller - Servlet

View(JSP)
---------
- Interacting with the Client.
- Accepting input
- Showing results
- Showing Information screen or pop-ups.

Controller(Servlet)
---------------------
- Validating the request
- Dispatching to component for processing business logic.
- Forwarding to a view.

Model(Pojo):
------------
Perform Business logic.

Limitation
------------
1. Duplication of Code
2. Multiple entry point

Front Controller Design Pattern
--------------------------------
- Every request will goes to front controller.
- This design pattern enforces a single point of entry for all the incoming requests. All the requests are handled by a single piece 
  of code which can then further delegate the responsibility of processing the request to further application objects.
  
Spring MVC
-----------
- Managed by Pivotal.
- Pojo Classes - Annotating them with appropriate controller.

Requirements:
-------------
- Download Apache Tomcat Server
- Create a MVC Project
- Add dependencies
  - Servlet API
  - Spring MVC
- Create a Controller
  @Controller - If you want to define a class Controller, so class has to be marked @Controller annotation.
              - Class annotated with same receives a request and it looks for appropriate handler method to handle request.
              
- Spring MVC:
             - XML Based Config
             - Java Based Config
             
- web.xml - Deployment descriptor
          - Web server will read web.xml file
          - How many servlet are there?
          - Which is starting point of an application.
          - Physical and logical details 
- FrontController
                  - DispatcherServlet
- WEB-INF - Special folder
          _ Anything which is kept inside a folder can't be accessed from outside with an url.
          - However, If any other component of the application forwards to it, it can be accessed.
          - We want every request comes to the application should go through front controller.
- dispatcher-servlet.xml
                         - Naming convention
                         - Servlet Name - dispatcher
                         - dispatcher-servlet.xml
                         - Schema
                                 - beans
                                 - context
                                 - c
                                 - p
- ViewResolver:
               - To Resolve the correct file for logical name is the responsibility of viewResolver.
               
               - @RequestMapping
	              public String indexPage() {
		           return "index";
	               }
                   
                   /WEB-INF/views/- prefix
                    .jsp - suffix
                    
--------------------------------------------------------------------------------------------------------------------------------------

Spring MVC Application:
-----------------------
User App
--------
com.natwest.learning.model ---------> User.java
com.natwest.learning.dao ---------> UserDAO.java
                         ---------> UserDAOImpl.java
com.natwest.learning.controller ---------> UserController.java
com.natwest.learning.config ---------> web.xml ---------> AppConfig.java
                                       dispatcher-servlet.xml ------> WebMvcConfig.java
                                       
        
- Add dependencies
  - Servlet API
  - Spring MVC
  - JSTL
  
Objective : Send the java object from the controller to the view page(jsp).
            1. Model --> add one object while returning view.
            2. ModelAndMap --> add more than one object along with view.
            3. ModelAndView --> Object + view
            
Add some more handler method
-----------------------------
HTTP GET
--------
- Request parameters are transferred via URL.
- Can be bookmarked.
- Has a limitation of the number of characters that can be sent in each request.
  http://www.google.com?var1=value1&var2=value2&var3=value3
  
Query String ---> part of the url which starts with ? and contains a key the request parameters

https://www.coronatracker.com?country=india


HTTP POST
---------
- Data would be sent as a part of request body and not in the url.
- More secure as the data is not visible in the url.
- Can carry more information in the size compared to the GET.

for Example:

1. Sensitive information
2. Login Pages
3. Form submissions

<html>
    <body>
        <form>
        <input type="text" name="name"/>
        </form>
    </body>
</html>

String name=request.getParameter("name");

@RequestParam : Handle the request parameters

QueryParameter
--------------
http://localhost:8080/UserApp/delete?id=1&city="Mumbai"

id=1 -----> Query Parameter
city="Mumbai"

PathVariable-------> Spring

http://localhost:8080/UserApp/delete/10

http://localhost:8080/UserApp/delete/20/Chennai

If there is one parameter that needs to be passed, We work with PathVariable,
but in case of multiple parameters, we can use QueryParameter.

@PathVariable("email")String emailAddress

I have a PathVariable called email whose value is being taken in the emailAddress variable.






                  
                  
                

































