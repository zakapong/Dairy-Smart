/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CowsMilkGivingAmount.java
 *
 * Created on Apr 19, 2013, 1:19:41 PM
 */
package dairysmart;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zack
 */
public class CowsMilkGivingAmount extends javax.swing.JFrame {
   Connection con;
    ResultSet rs = null;
      PreparedStatement pst= null;
    /** Creates new form CowsMilkGivingAmount */
    public CowsMilkGivingAmount() throws SQLException {
        initComponents();
         con=(Connection) SqlCon.ConnectDb();
        
        Update_table();
    }

    private void Update_table() throws SQLException{
    
    String sql="select Cows_Id as'Cows ID',Milk_Amount as'Milk Amount', Date as'Date', Status as 'Status'from CowsMilkGivingAmount";
    pst=(PreparedStatement) con.prepareStatement(sql);
    rs=pst.executeQuery();
    tab.setModel(DbUtils.resultSetToTableModel(rs));
    
    }
      public void close(){
    
    WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
      
      
    public void labe(String bb,String cc){
    
    ll.setText(bb);
    li.setText(cc);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Date = new javax.swing.JCheckBox();
        mi = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cc = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        li = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daily Milk getting amount");
        setMinimumSize(new java.awt.Dimension(1300, 750));
        setPreferredSize(new java.awt.Dimension(1300, 760));
        getContentPane().setLayout(null);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(464, 70, 773, 402);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cow ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 119, 55, 27);
        getContentPane().add(id);
        id.setBounds(69, 112, 134, 38);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Milk Amount:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(213, 121, 69, 23);
        getContentPane().add(amount);
        amount.setBounds(300, 112, 135, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("      Date:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 163, 50, 24);
        getContentPane().add(dat);
        dat.setBounds(68, 163, 135, 34);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 174, 42, 14);
        getContentPane().add(stat);
        stat.setBounds(300, 163, 135, 36);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(68, 217, 82, 31);

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(213, 163, 21, 21);

        mi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mi.setForeground(new java.awt.Color(255, 255, 255));
        mi.setText("Daily Milk Sheet");
        getContentPane().add(mi);
        mi.setBounds(781, 19, 218, 40);

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1200, 0, 73, 23);

        jButton4.setText("Total Milk Amount");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(464, 503, 195, 23);
        getContentPane().add(cc);
        cc.setBounds(669, 503, 75, 23);

        jButton5.setText("Refresh Sheet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(93, 323, 275, 31);

        ll.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ll);
        ll.setBounds(1136, 0, 60, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Insert Cows Milk Information");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(131, 46, 241, 39);

        li.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(li);
        li.setBounds(1090, 0, 50, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\zack.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1280, 730);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1280, 390);

        jMenu1.setText("File");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Owner Main Page");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("option");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Calculator");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Fresh");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Get Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
           String bg=li.getText();   
        String ff=ll.getText();
              try {
              close();
              WorkersAttendenceSheet a= new WorkersAttendenceSheet();
              a.setVisible(true);
              a.labe(ff,bg);
              
            
          } catch (Exception ex) {
              Logger.getLogger(WorkersAttendenceSheet.class.getName()).log(Level.SEVERE, null, ex);
          
    } 
        
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            try{
        
       String sql="Insert into CowsMilkGivingAmount(Cows_Id, Milk_Amount, Date, Status) values(?,?,?,?)"; 
      
            
         pst=(PreparedStatement) con.prepareStatement(sql);
 
         pst.setString(1, id.getText());
         pst.setString(2, amount.getText());
          pst.setString(3, dat.getText());
         pst.setString(4, stat.getText());
      
        
  
         pst.execute();
    
    
    }catch(Exception e){
        System.out.println(e);
    }
        try {
            Update_table();
           
         
        } catch (SQLException ex) {
            Logger.getLogger(WorkersSalarySheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        id.setText("");
         amount.setText("");
          dat.setText("");
           stat.setText("");
            //s.setText("");
 
           if(Date.isSelected()){
            Date.setSelected(false);
}
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed

                  Calendar cal= new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
     int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      dat.setText(year+"/"+(month+1)+"/"+day);
        
       
    }//GEN-LAST:event_DateActionPerformed
  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
         try {
              close();
              MainFrame a= new MainFrame();
              a.setVisible(true);
              
              
              // TODO add your handling code here:
          } catch (Exception ex) {
              Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        
        
        // TODO add your handling code here:
    }             
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

          //close();
        SimpleCalculator as= new SimpleCalculator();
        as.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

           try {
              
             Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\Help.pdf");
              
              // TODO add your handling code here:
          } catch (Exception ex) {
             
        
        
     
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

           try{
        String sql="Select sum(Milk_Amount) from CowsMilkGivingAmount";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Milk_Amount)");

         
         cc.setText(sum);
         }
        
        }catch(Exception e){
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        
        cc.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

          int  p =JOptionPane.showConfirmDialog(null, "Do you really want to refresh", "Refesh", JOptionPane.YES_NO_OPTION);
       
       if(p==0){
           try{
        
       String sql="DELETE FROM CowsMilkGivingAmount"; 
      
            
         pst=(PreparedStatement) con.prepareStatement(sql);
 
   
        
  
         pst.execute();
    
    
    }catch(Exception e){
        System.out.println(e);
    }
        try {
            Update_table();
           
         
        } catch (SQLException ex) {
            Logger.getLogger(WorkersSalarySheet.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

         String qge=li.getText();    
        String ds=ll.getText();
        
        if(ds.equalsIgnoreCase("Worker")){
        
         JOptionPane.showMessageDialog(null, "You are not Allow to access the page");
        }
        if(ds.equalsIgnoreCase("Owner")){
       
            try{
                close();
        OwnerAttendenceSheet nn= new OwnerAttendenceSheet();
        nn.labe(ds,qge);
        nn.setVisible(true);
            }catch(Exception ex){


}
        } 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed
      
    

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
            java.util.logging.Logger.getLogger(CowsMilkGivingAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CowsMilkGivingAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CowsMilkGivingAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CowsMilkGivingAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new CowsMilkGivingAmount().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CowsMilkGivingAmount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Date;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField dat;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel li;
    private javax.swing.JLabel ll;
    private javax.swing.JLabel mi;
    private javax.swing.JTextField stat;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
