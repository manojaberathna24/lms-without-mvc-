
import java.security.acl.Owner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manoj Aberathna
 */
public class NewBook extends javax.swing.JFrame {

    /**
     * Creates new form NewBook
     */
    Connection con;
    public NewBook() {
        initComponents();
       String url = "jdbc:mysql://localhost:3306/testdb";
       String user="root";
       String pass ="";
       try{
           con=DriverManager.getConnection(url,user,pass);
           
           
           
           
           
       }
       catch(Exception ex){
           System.out.print("error" +ex.getMessage());
       }
       
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        title = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebook = new javax.swing.JTable();
        author = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3), "ADD_Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Authors_Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 105, -1));

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-32.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, 30));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Book_Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 105, -1));

        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reset-32.png"))); // NOI18N
        resetBtn.setText("reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 40));

        btnview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-view-32.png"))); // NOI18N
        btnview.setText("view");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Authors_Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-32 (1).png"))); // NOI18N
        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 301, -1, 40));

        tablebook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book_Id", "Book_Name", "Authors_Name", "Authors_Email", "Quantity"
            }
        ));
        tablebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablebook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 480, 210));

        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-32.png"))); // NOI18N
        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Book_ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(boid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));

        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 190, -1));

        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-32 (1).png"))); // NOI18N
        updatebtn.setText("update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 22, 906, 406));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/R (2).jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/R (2).jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -50, 1420, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            String Query = "insert into book(bookID, name, author, title, quantity) values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(Query) ;
            pst.setString(1, boid.getText());
            pst.setString(2, name.getText());
            pst.setString(3, author.getText());
            pst.setString(4, title.getText());
            pst.setString(5, quantity.getText());

            
            
            pst.executeUpdate();
          
           
            JOptionPane.showMessageDialog(null, "book inserted succesfully");


         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        boid.setText("");
         name.setText("");
         author.setText("");
          title.setText("");
          quantity.setText("");
        
        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
       String sql = "SELECT * FROM book";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tablebook.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            model.addRow(new Object[]{rs.getInt("bookID"), rs.getString("name"), rs.getString("author"), rs.getString("title"), rs.getInt("quantity")});
                           

        }
    } catch (Exception ex) {
        System.out.print("error" + ex.getMessage());
    }
            
            
            
            
            
        
        
        
    }//GEN-LAST:event_btnviewActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
     
      try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
    
    int row = tablebook.getSelectedRow();
    String value = tablebook.getModel().getValueAt(row, 0).toString(); // Assuming the author column is at index 0
    
    String query = "DELETE FROM book WHERE bookID='" + value + "'";
    
    PreparedStatement pst = con.prepareStatement(query);
    pst.executeUpdate();
    
    DefaultTableModel model = (DefaultTableModel) tablebook.getModel();
    model.removeRow(row); // Remove the row from the table model
    
    pst.close();
    con.close();
    
    JOptionPane.showMessageDialog(null, "Row deleted successfully!");
    
    // Optionally, refresh the table after deletion
    show_user();
} catch (Exception ex) {
    System.out.print("error" + ex.getMessage());
}

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
            this.toBack();
        setVisible(false);
        new MainMenu().toFront();
        new MainMenu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_backBtnActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:try {
    try {
    String query = "UPDATE book SET name=?, author=?, title=?, quantity=? WHERE bookID=?";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, name.getText());
    pst.setString(2, author.getText());
    pst.setString(3, title.getText());
    pst.setString(4, quantity.getText());
    pst.setString(5, boid.getText()); // Set the bookID for the WHERE clause
    
    pst.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Book updated successfully!");
    
    // Refresh data by calling the view button action
    btnviewActionPerformed(evt);
    
    // Clear fields after update
    boid.setText("");
    name.setText("");
    author.setText("");
    title.setText("");
    quantity.setText("");
} catch (Exception ex) {
    System.out.print("error" + ex.getMessage());
}
   
 
  
   
    }//GEN-LAST:event_updatebtnActionPerformed

   
    private void tablebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebookMouseClicked
        // TODO add your handling code here:
        
         int i = tablebook.getSelectedRow();        
        TableModel model = tablebook.getModel();
        boid.setText(model.getValueAt(i,0).toString());   //table varyble name
        name.setText(model.getValueAt(i,1).toString());
        author.setText(model.getValueAt(i,2).toString());
        title.setText(model.getValueAt(i,3).toString());
        quantity.setText(model.getValueAt(i,4).toString());
        
        
        
    }//GEN-LAST:event_tablebookMouseClicked

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField boid;
    private javax.swing.JButton btnview;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTable tablebook;
    private javax.swing.JTextField title;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void show_user() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
