/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CowsHealthcareSheet.java
 *
 * Created on Apr 21, 2013, 12:14:59 PM
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
public class CowsHealthcareSheet extends javax.swing.JFrame {
  Connection con;
    ResultSet rs = null;
      PreparedStatement pst= null;
    /** Creates new form CowsHealthcareSheet */
    public CowsHealthcareSheet() throws SQLException {
        initComponents();
    
        
          con=(Connection) SqlCon.ConnectDb();
        
        Update_table();
    }

    private void Update_table() throws SQLException{
    
    String sql="select Cows_Id as'Cows ID', Date as'Date', Health_Status as'Health Status' from CowsHealthcareSheet";
    pst=(PreparedStatement) con.prepareStatement(sql);
    rs=pst.executeQuery();
    tab.setModel(DbUtils.resultSetToTableModel(rs));
    
    }
     public void close(){
    
    WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
     
    public void labe(String bb, String vb){
    
    ll.setText(bb);
    li.setText(vb);
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
        dat = new javax.swing.JTextField();
        Date = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        stat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dd = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        li = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome To Cows Health Care Sheet");
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
        jScrollPane1.setBounds(69, 54, 739, 500);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cow ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(838, 87, 55, 26);
        getContentPane().add(id);
        id.setBounds(897, 84, 146, 32);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1061, 86, 40, 29);
        getContentPane().add(dat);
        dat.setBounds(1101, 83, 141, 34);

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(1244, 83, 21, 21);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Health Status:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(820, 140, 80, 23);
        getContentPane().add(stat);
        stat.setBounds(897, 135, 146, 34);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1125, 136, 88, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Health Care Sheet");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(295, 3, 233, 33);

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1180, 0, 80, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UPATE INFORMATION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(908, 206, 124, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(859, 241, 28, 22);
        getContentPane().add(cc);
        cc.setBounds(897, 237, 146, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(842, 288, 45, 27);
        getContentPane().add(dd);
        dd.setBounds(897, 285, 146, 32);

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(897, 335, 87, 32);

        ll.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ll);
        ll.setBounds(1140, 0, 40, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Insert Information");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(900, 40, 150, 30);

        li.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(li);
        li.setBounds(1090, 0, 50, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\zack.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1380, 790);

        jMenu1.setText("File");

        jMenuItem3.setText("Owner Main Page");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

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

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Calf's Birth and Death Rate");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Cow Registration");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Get Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

          String bg=li.getText();
        String sd=ll.getText();
        
              try {
              close();
              WorkersAttendenceSheet a= new WorkersAttendenceSheet();
              a.setVisible(true);
              a.labe(sd,bg);
              
              // TODO add your handling code here:
          } catch (SQLException ex) {
              Logger.getLogger(WorkersAttendenceSheet.class.getName()).log(Level.SEVERE, null, ex);
          
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        
       String sql="Insert into CowsHealthcareSheet(Cows_Id,Date, Health_Status) values(?,?,?)"; 
      
            
         pst=(PreparedStatement) con.prepareStatement(sql);
 
         pst.setString(1, id.getText());
         pst.setString(2, dat.getText());
          pst.setString(3, stat.getText());
         //pst.setString(4, stat.getText());
       //  pst.setString(5, s.getText());
        
  
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
        
        id.setText("");
        // amount.setText("");
          dat.setText("");
           stat.setText("");
            //s.setText("");
 
           if(Date.isSelected()){
            Date.setSelected(false);
}
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
          Calendar cal= new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
     int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      dat.setText(year+"/"+(month+1)+"/"+day);
        
        // TODO add your handling code here:
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

           try {
              
             Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Zack\\Documents\\NetBeansProjects\\DairySmart\\Help.pdf");
              
              // TODO add your handling code here:
          } catch (Exception ex) {
             
        
        
     
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

          try{
        
    String value1=cc.getText();
    String value2=dd.getText();

    
    
   String sql="UPDATE CowsHealthcareSheet SET Health_Status='"+value2+"' WHERE Cows_Id='"+value1+"'";
      
   //   String sqll="UPDATE WorkersAttendenceSheetZ SET EndTime='"+value2+"',WorkingHour='"+value3+"'  WHERE  WorkerId='"+value1+"'";        
   
      pst=(PreparedStatement) con.prepareStatement(sql);
 
        
  
       pst.execute();
    
    
     //     pstt=(PreparedStatement) con.prepareStatement(sqll);
 
        
  
//       pstt.execute();
       
       
    }catch(Exception e){
        System.out.println(e);
    }
        try {
            Update_table();
           
           // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(WorkersSalarySheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cc.setText("");
         dd.setText("");
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

            String ds=ll.getText();
            String bg=li.getText();
        
        if(ds.equalsIgnoreCase("Worker")){
        
         JOptionPane.showMessageDialog(null, "You are not Allow to access the page");
        }
        if(ds.equalsIgnoreCase("Owner")){
       
            try{
                close();
        OwnerAttendenceSheet nn= new OwnerAttendenceSheet();
        nn.labe(ds,bg);
        nn.setVisible(true);
            }catch(Exception ex){


}
        } 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

         String ff=ll.getText();
                String bg=li.getText();
                    try {
              close();
             BirthDeathRateCalf ss= new BirthDeathRateCalf();
              
             ss.labe(ff, bg);
             ss.setVisible(true);
              
              
              // TODO add your handling code here:
          } catch (SQLException ex) {
              Logger.getLogger(BirthDeathRateCalf.class.getName()).log(Level.SEVERE, null, ex);
          
    }
        
      
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

             String bg=li.getText();
        String ws=ll.getText();
             try {
              close();
              CowRegistration sas= new CowRegistration();
              sas.setVisible(true);
              sas.labe(ws,bg);
              
              // TODO add your handling code here:
          } catch (SQLException ex) {
              Logger.getLogger(CowRegistration.class.getName()).log(Level.SEVERE, null, ex);
          
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
            java.util.logging.Logger.getLogger(CowsHealthcareSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CowsHealthcareSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CowsHealthcareSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CowsHealthcareSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new CowsHealthcareSheet().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CowsHealthcareSheet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Date;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField dat;
    private javax.swing.JTextField dd;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel li;
    private javax.swing.JLabel ll;
    private javax.swing.JTextField stat;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
