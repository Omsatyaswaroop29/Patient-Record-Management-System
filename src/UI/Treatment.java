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
public class Treatment extends javax.swing.JPanel {

    /**
     * Creates new form Treatment
     */
    
            private JPanel maincard;
    private Login l;
    
    public Treatment(JPanel maicard, Login l) {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdiagnosis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        plan = new javax.swing.JTextField();
        jstart = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtphysician = new javax.swing.JTextField();
        txtrecord = new javax.swing.JTextField();
        jend = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("TREATMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("END DATE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("DIAGNOSIS ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TREATMENT NAME");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 140, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("TREATMENT PLAN");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 140, 40));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("START DATE");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        txtname.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 205, 30));

        txtdiagnosis.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtdiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 205, 30));

        jTable1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RECORD ID", "PHYSICIAN ID", "DIAGNOSIS ID", "NAME", "PLAN", "START DATE", "END DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
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

        plan.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 205, 30));
        add(jstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 200, 31));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("RECORD ID");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 40));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PHYSICIAN ID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 40));

        txtphysician.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtphysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphysicianActionPerformed(evt);
            }
        });
        add(txtphysician, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 205, 30));

        txtrecord.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 205, 30));
        add(jend, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 31));
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            if(txtrecord.getText().isEmpty() || txtphysician.getText().isEmpty() ||txtdiagnosis.getText().isEmpty() || txtname.getText().isEmpty() || plan.getText().isEmpty() || jstart.getDate()==null||jend.getDate()==null)
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }
            String formattedDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jstart.getDate());
            String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jend.getDate());

            String sql = "INSERT INTO Treatment (RecordID, PhysicianID, DiagnosisID, TreatmentName, TreatmentPlan,TreatmentStartDate,TreatmentEndDate) VALUES " +
            "('" + txtrecord.getText() + "','" + txtphysician.getText() + "','" +
            txtdiagnosis.getText() + "','" + txtname.getText() + "','" + plan.getText() +"','"+ formattedDate1 +"','"+formattedDate2 + "')";

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

            if(txtrecord.getText().isEmpty() || txtphysician.getText().isEmpty() ||txtdiagnosis.getText().isEmpty() || txtname.getText().isEmpty() || plan.getText().isEmpty() || jstart.getDate()==null||jend.getDate()==null)
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }
            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);
            String formattedDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jstart.getDate());
            String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(jend.getDate());

            String sql = "UPDATE Treatment SET " +
            "RecordID = '" + txtrecord.getText() + "', " +
            "PhysicianID = '" + txtphysician.getText() + "', " +
            "DiagnosisID = '" + txtdiagnosis.getText() + "', " +
            "TreatmentName = '" + txtname.getText() + "', " +
            "TreatmentPlan = '" + plan.getText() + "', " +
            "TreatmentStartDate = '" + formattedDate1 + "', " +
            "TreatmentEndDate = '" + formattedDate2 + "', " +
            "WHERE TreatmentID = " + selectedValue;

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

            String sql = "DELETE FROM Treatment WHERE TreatmentID = '" + selectedValue + "'";

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

            String sql = "select * from Treatment";

            st=conn.createStatement();
            rs=st.executeQuery(sql);

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtphysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphysicianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphysicianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jend;
    private com.toedter.calendar.JDateChooser jstart;
    private javax.swing.JTextField plan;
    private javax.swing.JTextField txtdiagnosis;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphysician;
    private javax.swing.JTextField txtrecord;
    // End of variables declaration//GEN-END:variables
}
