/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Register.java
 *
 * Created on Apr 17, 2013, 3:48:43 PM
 */
package dairysmart;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public class Register extends javax.swing.JFrame {
    Connection con;
    ResultSet rs = null;
      PreparedStatement pst= null;
    /** Creates new form Register */
    public Register() {
        initComponents();
         con=(Connection) SqlCon.ConnectDb();
      
    }
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        person = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome to register page");
        setMinimumSize(new java.awt.Dimension(1278, 765));
        setPreferredSize(new java.awt.Dimension(1300, 765));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\registernowaa.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(268, 11, 357, 126);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(258, 168, 75, 26);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(258, 219, 65, 27);
        getContentPane().add(user);
        user.setBounds(346, 165, 190, 32);
        getContentPane().add(pass);
        pass.setBounds(346, 215, 190, 34);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password again:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(235, 269, 93, 26);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(258, 318, 84, 26);

        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });
        getContentPane().add(first);
        first.setBounds(346, 315, 190, 33);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(258, 370, 80, 23);

        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });
        getContentPane().add(last);
        last.setBounds(346, 366, 187, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("        Person number:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 418, 118, 27);
        getContentPane().add(person);
        person.setBounds(346, 414, 187, 34);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("            Email:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(244, 468, 102, 27);
        getContentPane().add(email);
        email.setBounds(346, 466, 187, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("    Key:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(274, 514, 44, 34);
        getContentPane().add(key);
        key.setBounds(346, 516, 187, 30);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 620, 97, 31);
        getContentPane().add(tt);
        tt.setBounds(461, 638, 137, 22);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\my.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(988, 11, 280, 680);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("            Role:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(244, 575, 87, 14);

        role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "Farmer", "Owner", "Worker" }));
        role.setToolTipText("");
        role.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roleItemStateChanged(evt);
            }
        });
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        getContentPane().add(role);
        role.setBounds(346, 566, 191, 32);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(346, 267, 190, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\zack.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1290, 750);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Login Page");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\Button-Close-icon.png")); // NOI18N
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("back");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Get Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void close(){
    
    WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_firstActionPerformed

private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_lastActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      close();
    Login ss= new Login();
    ss.setVisible(true);
    
    
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
    String owner="007";
      String worker1="0101";
       String worker2="0202";
      String worker3="0303";
      
      String worker4="0404";
      
       String worker5="0505";
    String kopa=key.getText();
    
    if(worker1.equals(kopa) || worker2.equals(kopa)||worker3.equals(kopa)|| worker4.equals(kopa)|| worker5.equals(kopa)){
    
    try{
        
         String text = (String)role.getSelectedItem();
        
       String sql="Insert into registration (UserName, word, Firstname, LastName, PersonNumber, Email, MyKey, Role) values(?, ?, ?, ?, ?, ?, ?, ?)"; 
      
            
         pst=(PreparedStatement) con.prepareStatement(sql);
 
         pst.setString(1, user.getText());
         pst.setString(2, pass.getText());
          pst.setString(3, first.getText());
         pst.setString(4, last.getText());
          pst.setString(5, person.getText());
         pst.setString(6, email.getText());
          pst.setString(7, key.getText());
           pst.setString(8, text);
          
  
         pst.execute();
            
        user.setText("");
         pass.setText("");
          first.setText("");
           last.setText("");
            person.setText("");
            email.setText("");
           key.setText("");
            //role.setText("");
                                
    
     close();
      Login s= new Login();
      s.setVisible(true);
    
    
    }catch(Exception e){
        System.out.println(e);
    }
        

    }else{
    
    tt.setText("Inter The correct Code");
    }
    
    
}//GEN-LAST:event_jButton1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    close();
    
  
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void roleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roleItemStateChanged

}//GEN-LAST:event_roleItemStateChanged

private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
//
//    role.addItem("Farmer");
//        role.addItem("owner");
    // TODO add your handling code here:
}//GEN-LAST:event_roleActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

           try {
              close();
             MainFrame  a= new MainFrame();
              a.setVisible(true);
              
              
              // TODO add your handling code here:
          } catch (Exception ex) {
              Logger.getLogger(WorkersSalarySheet.class.getName()).log(Level.SEVERE, null, ex);
          
    } 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

           try {
              
             Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\Help.pdf");
              
              // TODO add your handling code here:
          } catch (Exception ex) {
             
        
        
     
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField first;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField key;
    private javax.swing.JTextField last;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField person;
    private javax.swing.JComboBox role;
    private javax.swing.JLabel tt;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}