package app;
import app.database.*;
import java.awt.*;
import java.awt.event.*;

public class edit_farmer extends javax.swing.JFrame {

    /**
     * Creates new form edit_farmer
     */
    public edit_farmer(stringfarmer f) {
        initComponents( f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(stringfarmer farm) {
       /// Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        choice3 = new java.awt.Choice();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2.setText(farm.id);
        jTextField3.setText(farm.Average_income);
        jTextField4.setText(farm.Account_no);
        jTextField5.setText(farm.Ifsc);
        jTextField6.setText(farm.Branch);
        jTextField7.setText(farm.Area);
        jTextArea1.setText(farm.address);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(null);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+13));
        jLabel1.setText("User Registration Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 10, 340, 50);
        jTextField1.setText(farm.name);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 100, 280, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 100, 50, 30);

        choice1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        choice1.setName(""); // NOI18N
        choice1.add("Maharashtra");
        choice1.add("Bihar");
        choice1.add("Uttar Pradesh");
        getContentPane().add(choice1);
        choice1.setBounds(180, 170, 280, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Personal Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 50, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("State:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 170, 50, 20);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (choice1.getItem(choice1.getSelectedIndex())=="Maharashtra")
                {
                    choice2.removeAll();
                    choice2.add("Pune");
                    choice2.add("Mumbai");
                }
                else if(choice1.getItem(choice1.getSelectedIndex())=="Bihar")
                {
                    choice2.removeAll();
                    choice2.add("Patna");
                    choice2.add("Bhagalpur");
                }
                else if (choice1.getItem(choice1.getSelectedIndex())=="Uttar Pradesh")
                {
                    choice2.removeAll();
                    choice2.add("Lucknow");
                    choice2.add("Kanpur");
                }
            }
        });
        choice2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(choice2);
        choice2.setBounds(930, 160, 280, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("City:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(830, 160, 80, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 160, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 220, 100, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(930, 220, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Average Income:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 220, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Field Details");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 310, 200, 40);

        choice3.add("Alluvial Soil");
        choice3.add("Black Soil");
        choice3.add("Red Soil");
        choice3.add("Laterite Soil");
        choice3.add("Mountain Soil");
        choice3.add("Desert Soil");
        choice3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(choice3);
        choice3.setBounds(180, 370, 210, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Field Type:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 370, 120, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Crops Grown:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 430, 120, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Bank Details");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 470, 140, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Account No. :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 530, 120, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(180, 530, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("IFSC Code :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 590, 120, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Branch Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(820, 530, 120, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 590, 100, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(940, 530, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Area:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(830, 370, 100, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(930, 370, 150, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 620, 160, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 220, 250, 70);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Rice");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(190, 430, 60, 25);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Wheat");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(310, 430, 80, 25);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Millets");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(440, 430, 90, 25);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Maize");
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(570, 430, 80, 25);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Sugarcane");
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(670, 430, 100, 25);

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Pulses");
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(810, 430, 70, 25);

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("Oil Seeds");
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(920, 430, 80, 25);

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Tea");
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(1040, 430, 70, 25);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(930, 90, 200, 30);
    
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Aadhar No.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(830, 90, 100, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(390, 10, 380, 50);

        pack();
        this.setSize(1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        long id= Long.parseLong(jTextField2.getText());
                String name=jTextField1.getText();
                String Address=jTextArea1.getText();
                long AverageIncome=Long.parseLong(jTextField3.getText());
                long AccountNo=Long.parseLong(jTextField4.getText());
                String IFSC= jTextField5.getText();
                String Branch=jTextField6.getText();
                int area=Integer.parseInt(jTextField7.getText());
                String State=choice1.getItem(choice1.getSelectedIndex());
                String city=choice2.getItem(choice2.getSelectedIndex());
                String Field_type=choice3.getItem(choice3.getSelectedIndex());
                String crops="0";
                if(jCheckBox1.isSelected()==true)
                   { crops=crops+1;}
                   if(jCheckBox2.isSelected()==true)
                   { crops=crops+2;}
                   if(jCheckBox3.isSelected()==true)
                   { crops=crops+3;}
                   if(jCheckBox4.isSelected()==true)
                   { crops=crops+4;}
                   if(jCheckBox5.isSelected()==true)
                   { crops=crops+5;}
                   if(jCheckBox6.isSelected()==true)
                   { crops=crops+6;}  
                   if(jCheckBox7.isSelected()==true)
                   { crops=crops+7;}
                   if(jCheckBox8.isSelected()==true)
                   { crops=crops+8;} 
                   int crop=Integer.parseInt(crops);
                  Farmer F= new Farmer(id, name, city, State, Address, AverageIncome, Field_type, area, crop, AccountNo, Branch, IFSC);
                   udatefarmer update=null;
                   try
                   {
                       update = new udatefarmer();
                   }
                   catch(Exception e){System.out.println("error aala re aala");}
                   update.farmer(F);
                   try{update.con.close();}catch(Exception e){ System.out.println();}
        System.out.println(jTextArea1.getText());
        System.out.println(jTextField1.getText());
        System.out.println(jTextField2.getText());
        System.out.println(jTextField3.getText());
        System.out.println(jTextField4.getText());
        System.out.println(jTextField5.getText());
        System.out.println(jTextField6.getText());
        System.out.println(jTextField7.getText());
        System.out.println(jCheckBox1.isSelected());
        System.out.println(choice1.getItem(choice1.getSelectedIndex()));
        System.out.println(choice2.getItem(choice2.getSelectedIndex()));
        System.out.println(choice3.getItem(choice3.getSelectedIndex()));
        Homepage hp = new Homepage(); 
        hp.setVisible(true);  
        //hp.pack();
        this.dispose();
        //System.out.print();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edit_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new edit_farmer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private java.awt.Choice choice3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
