```

select city, name, commision from sales_rep;

select Invoice_Date, Rep_ID, Invoice_Id, Invoice_Amount from invoice 
group by Rep_ID
order by Invoice_Amount;


select Consumer_ID, Consumer_name, city, Grade from consumer 
order by consumer_name;