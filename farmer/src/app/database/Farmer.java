package app.database;
import java.math.BigDecimal;

public class Farmer {
    public long id;
    public String name;
    public String State;
    public String city;
    public String address;
    public long Average_income;
    public String field_type;
    public int Area;
    public int crops;
    public long Account_no;
    public String Branch;
    public String Ifsc;

    public Farmer(long id,String Name,String city,String State,String address,long average
    ,String field_type,int Area,int crops,long Account_no,String Branch,String Ifsc)
    {
        this.Account_no=Account_no;
        this.id=id;
        this.Area=Area;
        this.name=Name;
        this.address=address;
        this.Branch=Branch;
        this.State=State;
        this.Average_income=average;
        this.field_type=field_type;
        this.Ifsc=Ifsc;
        this.crops=crops;
        this.city=city;
        }



}