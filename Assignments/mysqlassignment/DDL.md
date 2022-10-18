```
create database mysqlassignment;
use mysqlassignment;




CREATE TABLE Sales_Rep (
    Rep_ID int NOT NULL,
    Name varchar(255) ,
    City varchar(255),
    commision double,
    PRIMARY KEY (Rep_ID)
); 

CREATE TABLE Consumer (
    Consumer_ID int NOT NULL,
    Consumer_Name varchar(255) ,
    City varchar(255),
    Grade varchar(255),
    Rep_ID int,    
    PRIMARY KEY (Consumer_ID),
    FOREIGN KEY (Rep_ID) REFERENCES Sales_Rep(Rep_ID)
); 

CREATE TABLE Invoice (
    Invoice_ID int NOT NULL,
    Invoice_amount double,
    Invoice_Date date,
    Rep_ID int,  
    Consumer_ID int,
    PRIMARY KEY (Invoice_ID),
    FOREIGN KEY (Rep_ID) REFERENCES Sales_Rep(Rep_ID),
foreign key (Consumer_ID) References consumer(Consumer_ID)
    );

