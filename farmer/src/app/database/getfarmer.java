package app.database;

import java.sql.*;
public class getfarmer {
    public Connection con;

    public getfarmer () throws Exception
{
    Class.forName("com.mysql.cj.jdbc.Driver");  
     try{con=DriverManager.getConnection(  
    "jdbc:mysql://localhost/farmer","root","root");}
    catch(Exception e)
    {
        System.out.println("connection failed");
    }
}
String sql="Select * from data where id=?";

public stringfarmer getFStringfarmer(long id)
{
    stringfarmer f =null;
    PreparedStatement myStmt = null;
        try
        {    
            myStmt = con.prepareStatement(sql);
            myStmt.setLong(1,id );
            ResultSet rs = myStmt.executeQuery();
     
            while(rs.next())
            {
                 f = new stringfarmer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
            }
           
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return f;
}
public static void main(String args[]) throws Exception
{
    getfarmer a= new getfarmer();
    long l=852654;
    stringfarmer f= a.getFStringfarmer(l);
    a.con.close();
    System.out.println(f.Branch);



}
    
}