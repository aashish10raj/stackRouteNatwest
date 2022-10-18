```

Select Consumer_Id, Consumer_Name, city, Grade, Rep_ID from consumer where city='Bangalore' OR city='Kolkatta';


select Invoice_ID, Invoice_Date, Consumer_ID, Rep_ID, Invoice_Amount from invoice where
Invoice_amount>5000;


select Rep_ID, name, City, Commision from sales_rep where CITY LIKE '%i';