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
public class EmergencyContact extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyContact
     */
        private JPanel maincard;
    private Login l;
    
    public EmergencyContact(JPanel maicard, Login l) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtlast = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtstreet = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtfirst = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtstate = new javax.swing.JTextField();
        txtzip = new javax.swing.JTextField();
        txtrelation = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("PATIENT EMERGENCY CONTACT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 410, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CONTACT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 100, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("FIRST NAME");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("LAST NAME");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("STREET");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CITY");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 60, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("STATE");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 70, 40));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("RELATION");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 110, 40));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PATIENT ID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ZIPCODE");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 100, -1));

        txtlast.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 205, 30));

        txtcity.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 205, 30));

        txtstreet.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 205, 30));

        txtid.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 205, 30));

        txtcontact.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 205, 30));

        txtfirst.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 205, 30));

        jTable1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FIRST", "LAST", "STREET", "CITY", "STATE", "ZIP", "RELATION", "CONTACT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 49, 870, 607));

        btninsert.setBackground(new java.awt.Color(153, 0, 255));
        btninsert.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("INSERT");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 137, 34));

        btnupdate.setBackground(new java.awt.Color(153, 0, 255));
        btnupdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 140, 34));

        btndelete.setBackground(new java.awt.Color(153, 0, 255));
        btndelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 137, 33));

        btnclear.setBackground(new java.awt.Color(153, 0, 255));
        btnclear.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("VIEW");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 140, 33));

        txtstate.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 205, 30));

        txtzip.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 205, 30));

        txtrelation.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtrelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 205, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            if(txtid.getText().isEmpty() || txtfirst.getText().isEmpty() ||  txtlast.getText().isEmpty() ||txtstreet.getText().isEmpty() ||txtcity.getText().isEmpty()|| txtstate.getText().isEmpty() || txtzip.getText().isEmpty()||txtrelation.getText().isEmpty() || txtcontact.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }

            String sql = "INSERT INTO EmergencyContact (PatientID, FirstName, LastName, Street, City, State,Zipcode,Relationship,ContactNumber) VALUES " +
            "('" + txtid.getText() + "','" + txtfirst.getText() + "','" + txtlast.getText() + "','" +
            txtstreet.getText() + "','" + txtcity.getText() + "','" + txtstate.getText() + "','" + txtzip.getText() + "','" +
            txtrelation.getText() + "','" + txtcontact.getText() + "')";

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
            
             if(txtid.getText().isEmpty() || txtfirst.getText().isEmpty() ||  txtlast.getText().isEmpty() ||txtstreet.getText().isEmpty() ||txtcity.getText().isEmpty()|| txtstate.getText().isEmpty() || txtzip.getText().isEmpty()||txtrelation.getText().isEmpty() || txtcontact.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }

            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);
            
            String sql = "UPDATE EmergencyContact SET " +
        "PatientID = '" + txtid.getText() + "', " +
        "FirstName = '" + txtfirst.getText() + "', " +
        "LastName = '" + txtlast.getText() + "', " +
        "Street = '" + txtstreet.getText() + "', " +
        "City = '" + txtcity.getText() + "', " +
        "State = '" + txtstate.getText() + "', " +
        "ZipCode = '" + txtzip.getText() + "', " +
        "Relationship = '" + txtrelation.getText() + "', " +
        "ContactNumber = '" + txtcontact.getText() + "' " +
        "WHERE PatientID = " + selectedValue;

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

            String sql = "DELETE FROM EmergencyContact WHERE PatientID = '" + selectedValue + "'";

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

            String sql = "select * from EmergencyContact";

            st=conn.createStatement();
            rs=st.executeQuery(sql);

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtrelation;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtstreet;
    private javax.swing.JTextField txtzip;
    // End of variables declaration//GEN-END:variables
}
