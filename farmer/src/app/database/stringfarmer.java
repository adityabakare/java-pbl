package app.database;
import java.math.BigDecimal;

public class stringfarmer {
    public String id;
    public String name;
    public String State;
    public String city;
    public String address;
    public String Average_income;
    public String field_type;
    public String Area;
    public String crops;
    public String Account_no;
    public String Branch;
    public String Ifsc;

    public stringfarmer(String id,String Name,String city,String State,String address,String average
    ,String field_type,String Area,String crops,String Account_no,String Branch,String Ifsc)
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