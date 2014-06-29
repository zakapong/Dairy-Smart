/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DailySellingMilkSheet.java
 *
 * Created on Apr 21, 2013, 12:47:13 PM
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
public class DailySellingMilkSheet extends javax.swing.JFrame {
   Connection con;
    ResultSet rs = null;
      PreparedStatement pst= null;
    /** Creates new form DailySellingMilkSheet */
    public DailySellingMilkSheet() throws SQLException {
        initComponents();
       con=(Connection) SqlCon.ConnectDb();
        
        Update_table();
    }

    private void Update_table() throws SQLException{
    
    String sql="select Time as'Time', Date as'Date', Amount_Kg as'Amount (Kg)',Price_Kr as 'Price (Kr)' from DailySellingMilkSheet";
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

        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        selling = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        Date = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        txtt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        li = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WelcomeTo daily Milk Sheet");
        setMinimumSize(new java.awt.Dimension(1322, 765));
        setPreferredSize(new java.awt.Dimension(1322, 765));
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
        jScrollPane1.setBounds(387, 73, 790, 402);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Time:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 110, 40, 20);
        getContentPane().add(time);
        time.setBounds(131, 100, 191, 34);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 160, 40, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selling amount:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 190, 90, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(81, 252, 40, 20);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(131, 294, 92, 23);
        getContentPane().add(date);
        date.setBounds(131, 145, 191, 37);
        getContentPane().add(selling);
        selling.setBounds(131, 193, 191, 31);
        getContentPane().add(price);
        price.setBounds(131, 242, 191, 34);

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(328, 145, 21, 21);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Daily Selling Milk Sheet");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(704, 28, 240, 27);

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(660, 480, 80, 30);
        getContentPane().add(txt);
        txt.setBounds(750, 480, 71, 30);
        getContentPane().add(txtt);
        txtt.setBounds(970, 480, 75, 30);

        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1060, 480, 80, 30);

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1186, 0, 90, 30);

        ll.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ll);
        ll.setBounds(1132, 0, 44, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Insert Milk Information");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 60, 191, 40);

        li.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(li);
        li.setBounds(1076, 0, 50, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\zack.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1300, 800);

        jMenu1.setText("File");

        jMenuItem4.setText("Owner Main Page");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Refeshment");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

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

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Calculator");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Refresh data");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Get Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

          try{
        
       String sql="Insert into DailySellingMilkSheet(Time, Date, Amount_Kg, Price_Kr) values(?,?,?,?)"; 
      
       
       
       
         pst=(PreparedStatement) con.prepareStatement(sql);
 
         pst.setString(1, time.getText());
         pst.setString(2, date.getText());
          pst.setString(3, selling.getText());
         pst.setString(4, price.getText());
          //pst.setString(5, s.getText());
        
  
         pst.execute();
          String sqll="Insert into DailySellingMilkSheetZ(Time, Date, Amount_Kg, Price_Kr) values(?,?,?,?)"; 
    
     pst=(PreparedStatement) con.prepareStatement(sqll);
 
         pst.setString(1, time.getText());
         pst.setString(2, date.getText());
          pst.setString(3, selling.getText());
         pst.setString(4, price.getText());
          //pst.setString(5, s.getText());
        
  
         pst.execute();
          
          
          
    }catch(Exception e){
        System.out.println(e);
    }
        try {
            Update_table();
           
           // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(WorkersSalarySheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        time.setText("");
         date.setText("");
          selling.setText("");
           price.setText("");
            //salary.setText("");
 
           if(Date.isSelected()){
            Date.setSelected(false);
}
       
            try{
        String sql="Select sum(Amount_Kg) from DailySellingMilkSheet";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Amount_Kg)");

         
         txt.setText(sum);
         }
        
        }catch(Exception e){
        
        }
             try{
        String sql="Select sum(Price_Kr) from DailySellingMilkSheet";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Price_Kr)");

         
         txtt.setText(sum);
         }
        
        }catch(Exception e){
        
        }
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
   Calendar cal= new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
     int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      date.setText(year+"/"+(month+1)+"/"+day);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        
        try{
        String sql="Select sum(Amount_Kg) from DailySellingMilkSheet";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Amount_Kg)");

         
         txt.setText(sum);
         }
        
        }catch(Exception e){
        
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

          String bg=li.getText();
        String ff=ll.getText();
              try {
              close();
              WorkersAttendenceSheet a= new WorkersAttendenceSheet();
              a.setVisible(true);
              a.labe(ff,bg);
              
              // TODO add your handling code here:
          } catch (Exception ex) {
              Logger.getLogger(WorkersAttendenceSheet.class.getName()).log(Level.SEVERE, null, ex);
          
    } 
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         try{
        String sql="Select sum(Price_Kr) from DailySellingMilkSheet";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Price_Kr)");

         
         txtt.setText(sum);
         }
        
        }catch(Exception e){
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

             try {
              close();
              MainFrame a= new MainFrame();
              a.setVisible(true);
              
              
              // TODO add your handling code here:
          } catch (Exception ex) {
              Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        
          }    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        
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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

          String ds=ll.getText();
         String qge=li.getText();
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
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        
          int  p =JOptionPane.showConfirmDialog(null, "Do you really want to refresh", "Refesh", JOptionPane.YES_NO_OPTION);
       
       if(p==0){
           try{
        
       String sql="DELETE FROM DailySellingMilkSheet"; 
      
            
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
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        txt.setText("");
        txtt.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    
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
            java.util.logging.Logger.getLogger(DailySellingMilkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailySellingMilkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailySellingMilkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailySellingMilkSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new DailySellingMilkSheet().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DailySellingMilkSheet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Date;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel li;
    private javax.swing.JLabel ll;
    private javax.swing.JTextField price;
    private javax.swing.JTextField selling;
    private javax.swing.JTable tab;
    private javax.swing.JTextField time;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txtt;
    // End of variables declaration//GEN-END:variables
}