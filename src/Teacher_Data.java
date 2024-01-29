
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author drago
 */
public class Teacher_Data extends javax.swing.JFrame {

    /**
     * Creates new form Teacher_Data
     */
    public Teacher_Data() {
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

        back_btn = new javax.swing.JButton();
        view_btn = new javax.swing.JButton();
        insert_btn = new javax.swing.JButton();
        Search_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_btn.setBackground(new java.awt.Color(153, 153, 255));
        back_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("<");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        view_btn.setBackground(new java.awt.Color(102, 153, 255));
        view_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        view_btn.setForeground(new java.awt.Color(255, 255, 255));
        view_btn.setText("View");
        view_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_btnActionPerformed(evt);
            }
        });

        insert_btn.setBackground(new java.awt.Color(0, 153, 102));
        insert_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        insert_btn.setForeground(new java.awt.Color(255, 255, 255));
        insert_btn.setText("Insert");
        insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btnActionPerformed(evt);
            }
        });

        Search_btn.setText("search");
        Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insert_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(Search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_btn)
                    .addComponent(insert_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_btn)
                    .addComponent(Search_btn))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
            welcome wl = new welcome();
                        wl.setVisible(true);

                        // Close or hide the registration form
                        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_back_btnActionPerformed

    private void insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btnActionPerformed
 String id = JOptionPane.showInputDialog(this, "Enter Student ID:");
        String name = JOptionPane.showInputDialog(this, "Enter teacher Name:");
        String email = JOptionPane.showInputDialog(this, "Enter teacher Email:");

        // Perform insertion logic into the database
        String url = "jdbc:mysql://localhost:3306/login_form";
        String user = "root";
        String pass = "";

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            String query = "INSERT INTO teacher_table (id, name, email) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, email);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data inserted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to insert data!");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        
    }


    }//GEN-LAST:event_insert_btnActionPerformed

    private void view_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_btnActionPerformed
teacher_view_data ad = new teacher_view_data();
                        ad.setVisible(true);

                        // Close or hide the registration form
                        this.dispose(); 
        
    }//GEN-LAST:event_view_btnActionPerformed

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
// Prompt the user for a search term
        String searchTerm = JOptionPane.showInputDialog(this, "Enter search term:");

        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/login_form";
        String user = "root";
        String pass = "";

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            // SQL query to select data from the teacher_table based on the search term
            String query = "SELECT * FROM teacher_table WHERE name LIKE ? OR email LIKE ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Set the parameters in the prepared statement
                preparedStatement.setString(1, "%" + searchTerm + "%");
                preparedStatement.setString(2, "%" + searchTerm + "%");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Process the result set and display the data in a JOptionPane dialog
                    StringBuilder resultMessage = new StringBuilder("Search Results  found:\n");

                    while (resultSet.next()) {
                        String teacherId = resultSet.getString("id");
                        String teacherName = resultSet.getString("name");
                        String teacherEmail = resultSet.getString("email");

                        // Append the retrieved data to the message
                        resultMessage.append("Teacher ID: ").append(teacherId)
                                .append(", Name: ").append(teacherName)
                                .append(", Email: ").append(teacherEmail).append("\n");
                    }

                    // Display the message in a JOptionPane dialog
                    JOptionPane.showMessageDialog(this, resultMessage.toString());
                }
            }
        } catch (SQLException ex) {
            // Handle exceptions
            ex.printStackTrace();
        
    }            }//GEN-LAST:event_Search_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton insert_btn;
    private javax.swing.JButton view_btn;
    // End of variables declaration//GEN-END:variables
}
