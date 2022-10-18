Restful Web Service:
--------------------

Web Service:
------------
- Services provided on a web.
- Return of the service is raw data.
- Can be utilized by a programmer.

2 Web Services :

1. SOAP:
- SOAP stands for Simple Object Access Protocol. It is a XML-based protocol for accessing web services.
- SOAP is a W3C recommendation for communication between two applications.
- SOAP is XML based protocol. It is platform independent and language independent. By using SOAP, you will be able to interact with 
  other programming language applications.

2. REST:
- Representational state Transfer
  Object state is nothing but data.
- No Rules
- It was first introduced by Roy Fielding in 2000.

URI
----
- Uniform Resource Identifier
for Example:
------------
http://localhost:8080/welcome

location : http://localhost:8080/
name: welcome

URL
----
- Uninform resource locator
for Example:
------------
http://localhost:8080/welcome

URL - /Welcome

2 types of URI
---------------
1. Collection Based : Have more than 1 data
   for Example:
   http://localhost:8080/messages
   http://localhost:8080/messages/msgId/comments
    
2. Resource Based : Have 1 data
   for Example:
   http://localhost:8080/messages/msgId
     http://localhost:8080/messages/msgId/comments/commentId
     
HTTP methods
------------
Following four HTTP methods are commonly used in REST based architecture.
1. GET − Provides a read only access to a resource.
2. POST − Used to create a new resource.
3. DELETE − Used to remove a resource.
4. PUT − Used to update a existing resource or create a new resource.

Idompotent
----------
GET 
PUT  
DELETE 

Non Idompotent
--------------
POST

Return : ResponseEntity:
                        HttpResponseBody
                        StatusCode
                        Header
                        
                        
Status Code: 
------------
2XX - Success
3XX - Informative
4XX - Client Side Error
5XX - Server Side Error





 