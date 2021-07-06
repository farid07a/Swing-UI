/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.Control.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author farid
 */
public class NewConnectionSQLserver {
    
    Connection cnx;
        public Connection getConnect(){
        try {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Class Not Found In Connexion Database");
            }
            System.out.println("Pilot is download ...");
            String url="jdbc:sqlserver://localhost:1433;user=sa;password=farid;databaseName=DB_Residence";
            String urll="jdbc:sqlserver://soft/sqlexpress:1433;user=sa;password=farid;instanceName=SQLEXPRESS;databaseName=DB_Residence";
           //  String urll="jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=DB_Residence";
            String url3="jdbc:sqlserver://SOFT\\SQLEXPRESS:1433;instanceName=SQLEXPRESS;databaseName=DB_Residence";
            
            
            //String url="jdbc:sqlserver://192.168.1.10:1433;user=sa;password=farid;databaseName=db_usine_eau";
            cnx=DriverManager.getConnection(urll);
            
            //JOptionPane.showMessageDialog(null, "The connection is etablished...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    return cnx;
    }
    
    public static void main(String[] args) {
        new NewConnectionSQLserver().getConnect();
    }
}
