/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dairysmart;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Zack
 */
public class SqlCon {
       Connection con =null;
   
   public static Connection ConnectDb(){
   
   try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DairySmart","root","root");
        //JOptionPane.showMessageDialog(null, "Connection Establish");
   
     return con;
  
   } catch(Exception e){
   
   JOptionPane.showMessageDialog(null, e);
   return null;
   }
}
}