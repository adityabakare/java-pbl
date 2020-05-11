package app;

import java.sql.*;  
class App{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/farmer","root","root");  
//here sonoo is database name, root is username and password 
String sqlString="insert into data values(2,'piyush','Maharastra','Mehkar','vitthal nagar mehkar',1000.00,'Black soil',15,123,9970384403,'MEhkar','Sbiin00001')"; 
Statement stmt=con.createStatement();  
stmt.executeUpdate(sqlString);  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  