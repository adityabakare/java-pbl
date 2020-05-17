package app.database;

import java.math.BigDecimal;
import java.sql.*;
import app.database.*;
public class udatefarmer {
    public Connection con;

public udatefarmer() throws Exception
{
    Class.forName("com.mysql.cj.jdbc.Driver");  
     try{con=DriverManager.getConnection(  
    "jdbc:mysql://localhost/farmer","root","root");}
    catch(Exception e)
    {
        System.out.println("connection failed");
    }
}

String sqlString="update data set Name=?,State=?,City=?,Address=?,AverageIncome=?,Feild_type=?,Area=?,Crops=?,AccountNo=?,Branch=?,IFSC=? Where id=?";
public void farmer(Farmer F)
{
        PreparedStatement myStmt = null;
        
        try {
            //Statement stmt=con.createStatement();
            myStmt = con.prepareStatement(sqlString);
             myStmt.setLong(12,F.id );
            myStmt.setString(1, F.name);
            myStmt.setString(2,F.State);
            myStmt.setString(3,F.city);
            myStmt.setString(4, F.address);
            myStmt.setLong(5, F.Average_income);
            myStmt.setString(6, F.field_type);
            myStmt.setInt(7, F.Area);
            myStmt.setInt(8,F.crops);
            myStmt.setLong(9, F.Account_no);
            myStmt.setString(10, F.Branch);
            myStmt.setString(11, F.Ifsc);
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
    
     /*   AddFarmer add = new AddFarmer();
        
       BigDecimal b= new BigDecimal("156456465");
        Farmer F= new Farmer(1, "piyush","mehkar", "mHr","sdf",b , "black", 100, 125, 2156515, "Branch", "Ifsc");
        add.farmer(F);
        add.con.close();*/
    
    }
}