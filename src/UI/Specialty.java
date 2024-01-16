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
public class Specialty extends javax.swing.JPanel {

    /**
     * Creates new form Specialty
     */
    
            private JPanel maincard;
    private Login l;
    
    public Specialty(JPanel maicard, Login l) {
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
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtdescription = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("SPECIALTY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 160, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("SPECIALTY NAME");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, -1));

        jTable1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SPECIALTY ID", "NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 470, 350));

        btninsert.setBackground(new java.awt.Color(153, 0, 255));
        btninsert.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("INSERT");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 137, 34));

        btnupdate.setBackground(new java.awt.Color(153, 0, 255));
        btnupdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 140, 34));

        btndelete.setBackground(new java.awt.Color(153, 0, 255));
        btndelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 137, 33));

        btnclear.setBackground(new java.awt.Color(153, 0, 255));
        btnclear.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("VIEW");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 140, 33));

        txtdescription.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        add(txtdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 310, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,password);

            if(txtdescription.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }

            String sql = "INSERT INTO Specialty (SpecialtyName) VALUES " +
            "('" + txtdescription.getText() + "')";

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

            if(txtdescription.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Empty fields encountered");
                return;
            }

            Object selectedValue = jTable1.getValueAt(selectedRowIndex, 0);

            String sql = "UPDATE Specialty SET " +
            "SpecialtyName = '" + txtdescription.getText() + "', " +
            "WHERE SpecialtyID = " + selectedValue;

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

            String sql = "DELETE FROM Specialty WHERE SpecialtyID = '" + selectedValue + "'";

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

            String sql = "select * from Specialty";

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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdescription;
    // End of variables declaration//GEN-END:variables
}
