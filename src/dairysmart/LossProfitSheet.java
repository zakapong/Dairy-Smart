/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LossProfitSheet.java
 *
 * Created on Apr 21, 2013, 12:44:11 PM
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
public class LossProfitSheet extends javax.swing.JFrame {
Connection con;
    ResultSet rs = null;
      PreparedStatement pst= null;
    
    
    /** Creates new form LossProfitSheet */
    public LossProfitSheet() throws SQLException {
        initComponents();con=(Connection) SqlCon.ConnectDb();
        
        Update_table();
        Update_tables();
    }

    private void Update_table() throws SQLException{
    
    String sql="select * from ProfitSheet";
    pst=(PreparedStatement) con.prepareStatement(sql);
    rs=pst.executeQuery();
    tab.setModel(DbUtils.resultSetToTableModel(rs));
    
    }
      private void Update_tables() throws SQLException{
    
    String sql="select * from LossSheet";
    pst=(PreparedStatement) con.prepareStatement(sql);
    rs=pst.executeQuery();
    tabs.setModel(DbUtils.resultSetToTableModel(rs));
    
    }  public void close(){
    
    WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    public void labe(String bb,String cd){
    
    ll.setText(bb);
    li.setText(cd);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        profit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sign = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loss1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sign1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Date = new javax.swing.JCheckBox();
        Date1 = new javax.swing.JCheckBox();
        c = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        d = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        li = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1322, 765));
        setPreferredSize(new java.awt.Dimension(1322, 765));
        getContentPane().setLayout(null);

        tab.setBackground(new java.awt.Color(0, 255, 0));
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
        jScrollPane1.setBounds(261, 84, 362, 402);

        tabs.setBackground(new java.awt.Color(255, 51, 102));
        tabs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Loss/Other", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabs.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabs);
        tabs.getColumnModel().getColumn(1).setResizable(false);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(883, 84, 364, 402);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Month:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 114, 40, 14);
        getContentPane().add(date);
        date.setBounds(68, 105, 160, 32);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Profit:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(2, 165, 70, 14);
        getContentPane().add(profit);
        profit.setBounds(63, 155, 161, 34);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("       Sign:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 210, 50, 20);
        getContentPane().add(sign);
        sign.setBounds(63, 207, 161, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Month:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(647, 109, 40, 14);
        getContentPane().add(date1);
        date1.setBounds(697, 100, 161, 33);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Loss/Other:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(627, 162, 70, 14);
        getContentPane().add(loss1);
        loss1.setBounds(697, 151, 161, 36);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Owner Sign:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(628, 209, 70, 14);
        getContentPane().add(sign1);
        sign1.setBounds(697, 200, 161, 32);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(697, 250, 74, 31);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(63, 255, 80, 32);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Loss Sheet");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1003, 33, 146, 32);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Profit Sheet");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 30, 146, 32);

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(234, 105, 21, 21);

        Date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date1ActionPerformed(evt);
            }
        });
        getContentPane().add(Date1);
        Date1.setBounds(860, 100, 21, 21);
        getContentPane().add(c);
        c.setBounds(420, 490, 77, 28);

        jButton3.setText("Yearly");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 490, 63, 23);

        jButton4.setText("Yearly");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1180, 500, 63, 23);
        getContentPane().add(d);
        d.setBounds(1100, 500, 67, 28);

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1200, 0, 70, 23);

        ll.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ll);
        ll.setBounds(1150, 0, 50, 20);

        li.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(li);
        li.setBounds(1100, 0, 50, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\zack.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1320, 730);

        jMenu1.setText("File");
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

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Calculator");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Get Help");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        
       String sql="Insert into Losssheet(Date, Loss_Other_Kr, Sign) values(?,?,?)"; 
      
            
         pst=(PreparedStatement) con.prepareStatement(sql);
 
         pst.setString(1, date1.getText());
         pst.setString(2, loss1.getText());
          pst.setString(3, sign1.getText());
        
        
  
         pst.execute();
    
    
    }catch(Exception e){
        System.out.println(e);
    }
        try {
            Update_tables();
           
           // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(WorkersSalarySheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        date1.setText("");
         loss1.setText("");
          sign1.setText("");
         
 
           if(Date1.isSelected()){
            Date1.setSelected(false);
}    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        
       String sql="Insert into Profitsheet(Date, Profit_Kr, Sign) values(?,?,?)"; 
      
            
         pst=(PreparedStatement) con.prepareStatement(sql);
 
         pst.setString(1, date.getText());
         pst.setString(2, profit.getText());
          pst.setString(3, sign.getText());
        
        
  
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
        
        date.setText("");
         profit.setText("");
          sign.setText("");
         
 
           if(Date.isSelected()){
            Date.setSelected(false);
}
    
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
      Calendar cal= new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
     int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      date.setText(year+"/"+(month+1)+"/"+day);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date1ActionPerformed

              Calendar cal= new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
     int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      date1.setText(year+"/"+(month+1)+"/"+day);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Date1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        
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
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         try{
        String sql="Select sum(Profit_Kr) from Profitsheet";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Profit_Kr)");
         c.setText(sum);
         }
        
        }catch(Exception e){
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

          try{
        String sql="Select sum(Loss_Other_Kr) from Losssheet";
        
         pst=(PreparedStatement) con.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
         
         String sum=rs.getString("sum(Loss_Other_Kr)");
         d.setText(sum);
         }
        
        }catch(Exception e){
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

          
        SimpleCalculator as= new SimpleCalculator();
        as.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(LossProfitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LossProfitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LossProfitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LossProfitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new LossProfitSheet().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(LossProfitSheet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Date;
    private javax.swing.JCheckBox Date1;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField date;
    private javax.swing.JTextField date1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel li;
    private javax.swing.JLabel ll;
    private javax.swing.JTextField loss1;
    private javax.swing.JTextField profit;
    private javax.swing.JTextField sign;
    private javax.swing.JTextField sign1;
    private javax.swing.JTable tab;
    private javax.swing.JTable tabs;
    // End of variables declaration//GEN-END:variables
}
