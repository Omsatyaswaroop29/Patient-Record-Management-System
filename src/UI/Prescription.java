/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import CLASS.Login;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author vaish
 */
public class Prescription extends javax.swing.JPanel {

    /**
     * Creates new form PRECRIPTION
     */
    
            private JPanel maincard;
    private Login l;
    
    public Prescription(JPanel maicard, Login l) {
        initComponents();
                this.maincard=maincard;
        this.l=l;
    }
        String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url= "jdbc:sqlserver://localhost:1433;databaseName=PATIENTMANAGEMENT;encrypt=true;trustServerCertificate=true;";
    String user="sa";
    String password="sa";
    
     Statement st;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtmedication = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtdosage = new javax.swing.JTextField();
        txtduration = new javax.swing.JTextField();
        jrefill = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtrecord = new javax.swing.JTextField();
        txtphysician = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfrequency = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jprescription = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("PRESCRIPTION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("REFILL DATE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MEDICATION ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DOSAGE");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 110, 40));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("DURATION");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        txtmedication.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtmedication, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 205, 30));

        jTable1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PHYSICIANID", "RECORDID", "MEDID", "DATE", "DOSAGE", "DURATION", "FREQUENCY", "REFILL", "CODE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 9, 810, 650));

        btninsert.setBackground(new java.awt.Color(153, 0, 255));
        btninsert.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("INSERT");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 137, 34));

        btnupdate.setBackground(new java.awt.Color(153, 0, 255));
        btnupdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 140, 34));

        btndelete.setBackground(new java.awt.Color(153, 0, 255));
        btndelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 137, 33));

        btnclear.setBackground(new java.awt.Color(153, 0, 255));
        btnclear.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("VIEW");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 140, 33));

        txtdosage.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtdosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 205, 30));

        txtduration.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 205, 30));
        add(jrefill, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 200, 31));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PHYSICIAN ID");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 40));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("RECORD ID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 40));

        txtrecord.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecordActionPerformed(evt);
            }
        });
        add(txtrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 205, 30));

        txtphysician.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtphysician, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 205, 30));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("FREQUENCY");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, -1));

        txtfrequency.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtfrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 205, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PRECRIPTION DATE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 150, 40));
        add(jprescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, 31));
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            if(txtphysician.getText().isEmpty() || txtrecord.getText().isEmpty() ||txtmedication.getText().isEmpty() ||jprescription.getDate()==null ||  txtdosage.getText().isEmpty() || txtduration.getText().isEmpty() || txtfrequency.getText().isEmpty() || jrefill.getDate()==null)
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }
            String formattedDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jprescription.getDate());

            String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jrefill.getDate());

            String sql = "INSERT INTO Prescriptions (PhysicianID, RecordID, MedicationID, PrescriptionDate, Dosage,Duration,Frequency,RefillDate) VALUES " +
            "('" + txtphysician.getText() + "','" + txtrecord.getText() + "','" +
            txtmedication.getText() + "','" + formattedDate1 + "','" + txtdosage.getText() +"','"+ txtduration.getText() +"','"+txtfrequency.getText() + "','" +formattedDate2 + "')";

            st=conn.createStatement();
            st.execute(sql);

            JOptionPane.showMessageDialog(this, "Inserted Successfully");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            int selectedRowIndex = jTable1.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }
            
            if(txtphysician.getText().isEmpty() || txtrecord.getText().isEmpty() ||txtmedication.getText().isEmpty() ||jprescription.getDate()==null ||  txtdosage.getText().isEmpty() || txtduration.getText().isEmpty() || txtfrequency.getText().isEmpty() || jrefill.getDate()==null)
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }

            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);
            String formattedDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jprescription.getDate());

            String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jrefill.getDate());

            String sql = "UPDATE Prescriptions SET " +
            "PhysicianID = '" + txtphysician.getText() + "', " +
            "RecordID = '" + txtrecord.getText() + "', " +
            "MedicationID = '" + txtmedication.getText() + "', " +
            "PrescriptionDate = '" + formattedDate1 + "', " +
            "Dosage = '" + txtdosage.getText() + "', " +
            "Duration = '" + txtduration.getText() + "', " +
            "Frequency = '" + txtfrequency.getText() + "', " +
            "RefillDate = '" + formattedDate2 + "', " +
            "WHERE PrescriptionID = " + selectedValue;

            st=conn.createStatement();

            int rowsUpdated = st.executeUpdate(sql);

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Update failed");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            int selectedRowIndex = jTable1.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete");
                return;
            }

            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);

            String sql = "DELETE FROM Prescriptions WHERE PrescriptionID = '" + selectedValue + "'";

            st = conn.createStatement();

            int rowsDeleted = st.executeUpdate(sql);

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Delete failed");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            String sql = "select * from Prescriptions";

            st=conn.createStatement();
            rs=st.executeQuery(sql);

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrecordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jprescription;
    private com.toedter.calendar.JDateChooser jrefill;
    private javax.swing.JTextField txtdosage;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtfrequency;
    private javax.swing.JTextField txtmedication;
    private javax.swing.JTextField txtphysician;
    private javax.swing.JTextField txtrecord;
    // End of variables declaration//GEN-END:variables
}