package matjarokom.Control.com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ConnectionDB {
    
    private Connection cnx;
    
//    public Connection getConnect(){
//        try {
//            try {
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            } catch (ClassNotFoundException ex) {
//                System.out.println("Class Not Found In Connexion Database");
//            }
//            
//            System.out.println("Pilot is download ...");
//            //String url="jdbc:sqlserver://localhost:1433;user=sa;password=farid;databaseName=db_usine_eau";
//            String url="jdbc:sqlserver://192.168.1.10:1433;user=sa;password=farid;databaseName=db_usine_eau";
//            cnx=DriverManager.getConnection(url);
//            
//            //JOptionPane.showMessageDialog(null, "The connection is etablished...");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Eroooooor conect ");
//        }
//        
//        
//    return cnx;
//    }
    
    
    
    
    
    public void Deconnect(){
        try {
            cnx.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in Deconnect");
        }
    }
    
    public Connection getConnect(){
        try {
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String DB;
            System.out.println("Success Download ");          
            DB = "jdbc:ucanaccess:////E:\\StoreDB.accdb";
             cnx=DriverManager.getConnection(DB);
                System.out.println("Success Connecting... ");
           // JOptionPane.showMessageDialog(null, "The connection is etablished...");
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error to connecting Database  "+e.getMessage());
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return cnx;
    }
    
    public static void main(String [ ] args) {
        new ConnectionDB().getConnect();
    }
}
