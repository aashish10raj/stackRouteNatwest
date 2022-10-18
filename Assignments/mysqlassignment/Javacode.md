
```

public void displaySales() throws ClassNotFoundException, SQLException {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlassignment","root","1234");
          
           
             statement=connection.createStatement();
             rs=statement.executeQuery("Select * from sales_rep");

             while(rs.next()){
                 System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));
             }
             connection.close();

    }



public class StoreSalesData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlassignment","root","1234");
    
        String str1="insert into Customer values(11007,'Abbas','Hyderabad',0.1)";
     
        Statement statement=connection.createStatement();
        int count1=statement.executeUpdate(str1);
    

        

    }
}
