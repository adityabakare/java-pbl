package app.database;

import java.math.BigDecimal;
import java.sql.*;
import app.database.*;
public class AddFarmer {
    public Connection con;

public AddFarmer() throws Exception
{
    Class.forName("com.mysql.cj.jdbc.Driver");  
     try{con=DriverManager.getConnection(  
    "jdbc:mysql://localhost/farmer","root","root");}
    catch(Exception e)
    {
        System.out.println("connection failed");
    }
}

String sqlString="insert into data values(?,?,?,?,?,?,?,?,?,?,?,?)";
public void farmer(Farmer F)
{
        PreparedStatement myStmt = null;
        
        try {
            Statement stmt=con.createStatement();
            myStmt = con.prepareStatement(sqlString);
            myStmt.setInt(1,F.id );
            myStmt.setString(2, F.name);
            myStmt.setString(3,F.State);
            myStmt.setString(4,F.city);
            myStmt.setString(5, F.address);
            myStmt.setBigDecimal(6, F.Average_income);
            myStmt.setString(7, F.field_type);
            myStmt.setInt(8, F.Area);
            myStmt.setInt(9,F.crops);
            myStmt.setLong(10, F.Account_no);
            myStmt.setString(11, F.Branch);
            myStmt.setString(12, F.Ifsc);
            int i= myStmt.executeUpdate();
            System.out.println(i);
            //ResultSet r= stmt.executeQuery("Select * from data");
            //while(r.next())
            //{
            //int id=r.getInt("id");
            //System.out.println(id);
            //}
        }
        catch(SQLException e)
        {
            System.out.println("hi from add farmer constructer");
            System.out.println(e);

        }
    }
    public static void main(String args[]) throws Exception
    {    
    
        AddFarmer add = new AddFarmer();
        
       BigDecimal b= new BigDecimal("156456465");
        Farmer F= new Farmer(1, "piyush","mehkar", "mHr","sdf",b , "black", 100, 125, 2156515, "Branch", "Ifsc");
        add.farmer(F);
        add.con.close();
    
    }
}