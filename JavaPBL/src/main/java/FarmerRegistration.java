/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Belwal
 */
import java.awt.*;
import java.awt.event.*;
public class FarmerRegistration extends javax.swing.JFrame {

    /**
     * Creates new form FarmerRegistration
     */
    public FarmerRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(null);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+13));
        jLabel1.setText("User Registration Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 10, 340, 50);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 100, 280, 30);

        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 100, 40, 14);

        choice1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice1.setName(""); // NOI18N
        choice1.add("Maharashtra");
        choice1.add("Bihar");
        choice1.add("Uttar Pradesh");
        getContentPane().add(choice1);
        choice1.setBounds(140, 160, 280, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Personal Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 50, 120, 30);

        jLabel4.setText("State:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 160, 50, 14);

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
        getContentPane().add(choice2);
        choice2.setBounds(140, 220, 280, 20);

        jLabel5.setText("City:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 220, 50, 14);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 160, 47, 23);

        jLabel6.setText("Address:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 270, 50, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 350, 140, 30);

        jLabel7.setText("Average Income:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 350, 110, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Field Details");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 390, 90, 40);

        choice3.add("Alluvial Soil");
        choice3.add("Black Soil");
        choice3.add("Red Soil");
        choice3.add("Laterite Soil");
        choice3.add("Mountain Soil");
        choice3.add("Desert Soil");
        getContentPane().add(choice3);
        choice3.setBounds(180, 440, 130, 20);

        jLabel9.setText("Field Type:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 440, 60, 14);

        jLabel10.setText("Crops Grown:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 480, 80, 14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Bank Details");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(200, 510, 100, 40);

        jLabel12.setText("Account No. :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 570, 80, 14);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(190, 570, 190, 30);

        jLabel13.setText("IFSC Code :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(90, 604, 80, 20);

        jLabel14.setText("Branch Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(500, 570, 90, 14);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(190, 610, 100, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(610, 570, 100, 30);

        jLabel15.setText("Area:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(440, 440, 50, 14);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(510, 440, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 630, 160, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 260, 250, 70);

        jCheckBox1.setText("Rice");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(180, 480, 60, 23);

        jCheckBox2.setText("Wheat");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(270, 480, 57, 23);

        jCheckBox3.setText("Millets");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(360, 480, 80, 23);

        jCheckBox4.setText("Maize");
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(450, 480, 53, 23);

        jCheckBox5.setText("Sugarcane");
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(540, 480, 90, 23);

        jCheckBox6.setText("Pulses");
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(630, 480, 70, 23);

        jCheckBox7.setText("Oil Seeds");
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(720, 480, 80, 23);

        jCheckBox8.setText("Tea");
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(820, 480, 43, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(jTextArea1.getText());
        System.out.println(jTextField1.getText());
        //System.out.println(jTextField2.getText());
        System.out.println(jTextField3.getText());
        System.out.println(jTextField4.getText());
        System.out.println(jTextField5.getText());
        System.out.println(jTextField6.getText());
        System.out.println(jTextField7.getText());
        System.out.println(jCheckBox1.isSelected());
        
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(FarmerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FarmerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FarmerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FarmerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FarmerRegistration().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
