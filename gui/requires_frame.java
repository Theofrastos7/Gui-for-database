/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_MysqlConn;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;     

/**
 *
 * @author Theo
 */
public class requires_frame extends javax.swing.JFrame {

    
    private static final String username = "root";
    private static final String password = "12345theo";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/project2";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int q, i, id, deleteItem;
    
    public requires_frame() {
        initComponents();
        upDateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    //=============================FUNCTION==========================//
    
    public void upDateDB()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(DB_URL,username,password);
            pst = sqlConn.prepareStatement("Select * FROM requires");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next())
            {
                Vector columnData = new Vector();
                
                for (i = 1; i<= q; i++)
                {
                    columnData.add(rs.getInt("job_id"));
                    columnData.add(rs.getString("subject_title"));
                    
                }
                
                RecordTable.addRow(columnData);
            }                
        }
        catch(Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Username_label = new javax.swing.JLabel();
        Password_label = new javax.swing.JLabel();
        job_id_text = new javax.swing.JTextField();
        subject_title_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        insert_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Requires");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        Username_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Username_label.setText("Job_id");

        Password_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password_label.setText("subject_title");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "job_id", "subject_title"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        insert_button.setText("Insert");
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(job_id_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subject_title_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insert_button)
                                    .addComponent(update_button)
                                    .addComponent(delete_button)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(job_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_button)
                    .addComponent(subject_title_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(delete_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset_button)
                .addGap(18, 18, 18)
                .addComponent(exit_button)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed
        
       try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(DB_URL,username,password);
            pst = sqlConn.prepareStatement("INSERT INTO requires(job_id, subject_title) VALUES (?, ?)");
            
            pst.setString(1, job_id_text.getText());
            pst.setString(2, subject_title_text.getText());

           
            
            int rowsUpdates = pst.executeUpdate();
            
            if (rowsUpdates > 0) {
                JOptionPane.showMessageDialog(this, "Record Added.");
            upDateDB();
            } else {
                JOptionPane.showMessageDialog(this, "No changes made. Record not added.");
            }
       }
       
       catch(ClassNotFoundException ex)
       {
           java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE,
                   null, ex);  
       }
       catch(SQLException ex)
       {
           java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE,
                   null, ex);  
       }        
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
     try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(DB_URL,username,password);
            pst = sqlConn.prepareStatement("DELETE FROM requires WHERE job_id = ? AND subject_title = ?");
            
            pst.setString(1, job_id_text.getText());
            pst.setString(2, subject_title_text.getText());
                        
            int rowsUpdates = pst.executeUpdate();
            
            if (rowsUpdates > 0) {
                JOptionPane.showMessageDialog(this, "Record Deleted.");
            upDateDB();
            } else {
                JOptionPane.showMessageDialog(this, "No changes made. Record not deleted.");
            }
        }
       
       catch(ClassNotFoundException ex)
       {
           java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE,
                   null, ex);  
       }
       catch(SQLException ex)
       {
           java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE,
                   null, ex);  
           
       }   
              
    }//GEN-LAST:event_delete_buttonActionPerformed

    private JFrame frame;
    
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit.", "MySQL User",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
       job_id_text.setText("");
       subject_title_text.setText("");
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(DB_URL,username,password);
            pst = sqlConn.prepareStatement("UPDATE requires SET job_id = ?, subject_title = ?"
                    + "WHERE job_id = ? AND subject_title = ?");
            
            pst.setString(1, job_id_text.getText());
            pst.setString(2, subject_title_text.getText());
             
            pst.setString(3, job_id_text.getText());
            pst.setString(4, subject_title_text.getText()); // Use the username entered by the user
            
            int rowsUpdates = pst.executeUpdate();
            
            if (rowsUpdates > 0) {
                JOptionPane.showMessageDialog(this, "Record Updated.");
            upDateDB();
            } else {
                JOptionPane.showMessageDialog(this, "No changes made. Record not updated.");
            }
        }
       
       catch(ClassNotFoundException ex)
       {
           java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE,
                   null, ex);  
       }
       catch(SQLException ex)
       {
           java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE,
                   null, ex);  
           
       }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        job_id_text.setText(RecordTable.getValueAt(SelectedRows, 0).toString()); 
        subject_title_text.setText(RecordTable.getValueAt(SelectedRows, 1).toString());      
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(requires_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new requires_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel Username_label;
    private javax.swing.JButton delete_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton insert_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField job_id_text;
    private javax.swing.JButton reset_button;
    private javax.swing.JTextField subject_title_text;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}