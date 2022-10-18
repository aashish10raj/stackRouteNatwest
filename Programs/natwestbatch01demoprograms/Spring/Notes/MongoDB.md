NoSql
-----
- Doesn't have schema
- Not a Sql.

Structured Data ----------------> RDBMS
---------------------------------------
for Example:
Account Credentials
--------------------
name
userid
password
age
gender
dob

Unstructured Data ---------------> NoSql
-----------------------------------------
Post
Like           comment            share
               cid
               like
               emojie
                      reply
                         cid
                         like
                          emojie
                            reply
                              cid
                              like
                               emojie
image - jpeg,gif,png
video - mov,mp4,mpeg,3GP

Sql Database : Vertical Scaling

2017 - i3 8th Generation Machine ------> Deployed

2022 - Customer base increased

Vertical Scaling : Add Extra Storage + Add Extra RAM + i7 8th generation processor

NoSql Database : Horizontal Scaling

2017 - i3 8th Generation Machine ------> Deployed

2022 - Customer base increased

Horizontal Scaling : Machine 1 + Machine 2(New Configuration)

______________________________________________________________________________________________________________________________________

MongoDB
--------
- NoSql Database
- Schema less                  
- Structure of object - very clear
- No joins
- Easy scale out -------------------> Horizontal scaling

Terminologies ----------> RDBMS Vs MongoDB

RDBMS                              MongoDB
Database                           Database
Table                              Collections
Row                                Documents
Columns                            Fields
Primary key                        Id
join                               No Join
Default port:3306                  Default port: 27017

Database: mobileDB
Collections: Posts

____________________________________________________________________________________________________________________________________

Spring Boot + MongoDB
---------------------
Dependencies:
              - Spring Web
              - Spring Data MongoDB




























































