package app;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.lang.*;
import java.sql.*;
public class Admin  extends JPanel {

    static final String USERNAME = "root";
    static final String PASSWORD = "root";
    static final String CONN_STRING = "jdbc:mysql://localhost/farmer";

    
    public Admin () {

        try {
            Connection conn;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();
            String query = "Select * from data";
            ResultSet rs = stmt.executeQuery(query);

            rs.beforeFirst();
            String[] columnNames = {"id", "name", "state","city","Address","Average_income","Field_type","Area","Crops","AccountNo","Branch","IFSC"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            while (rs.next()) {
                String id=rs.getString(1);
                String name=rs.getString(2);
                String Address=rs.getString(5);
                String AverageIncome=rs.getString(6);
                String AccountNo=rs.getString(10);
                String IFSC= rs.getString(12);
                String Branch=rs.getString(11);
                String area=rs.getString(8);
                String State=rs.getString(3);
                String city=rs.getString(4);
                String Field_type=rs.getString(7);
                String crops=rs.getString(9);

        
            String[] data = {id,name,State,city,Address,AverageIncome,Field_type,area,crops,AccountNo,Branch,IFSC};
            tableModel.addRow(data);


         
            };
            JTable jt = new JTable(tableModel);
            jt.setFont(new Font("Serif",Font.PLAIN,20));
            jt.setPreferredScrollableViewportSize(new Dimension(500, 70));
            jt.setFillsViewportHeight(true);
            jt.setModel(tableModel);
            jt.setRowHeight(jt.getRowHeight() + 20);
            int x=125;
            jt.getColumnModel().getColumn(0).setPreferredWidth(x);
            jt.getColumnModel().getColumn(1).setPreferredWidth(x);
            jt.getColumnModel().getColumn(2).setPreferredWidth(x);
            jt.getColumnModel().getColumn(3).setPreferredWidth(x);
            jt.getColumnModel().getColumn(4).setPreferredWidth(x);
            jt.getColumnModel().getColumn(5).setPreferredWidth(x);
            jt.getColumnModel().getColumn(6).setPreferredWidth(x);
            jt.getColumnModel().getColumn(7).setPreferredWidth(x);
            jt.getColumnModel().getColumn(8).setPreferredWidth(x);
            jt.getColumnModel().getColumn(9).setPreferredWidth(x);
            jt.getColumnModel().getColumn(10).setPreferredWidth(x);
            jt.getColumnModel().getColumn(11).setPreferredWidth(x);
            //jt.setSize(1920, 1080);
            jt.setPreferredScrollableViewportSize(jt.getPreferredSize());
           // jt.setFillsViewportHeight(true);

            JScrollPane jps = new JScrollPane(jt);
               
              add(jps); }
        catch (Exception er) {System.err.println(er);}
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("test");
        Admin t = new Admin();
        t.setOpaque(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setContentPane(t);
        //jf.setLocationByPlatform(true);
        //jf.setLocationRelativeTo(null);
        jf.setSize(1920, 1080);
        jf.pack();
        jf.setVisible(true);

        //jf.add(t);
    }
}