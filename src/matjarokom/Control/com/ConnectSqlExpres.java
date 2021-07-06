/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.Control.com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author farid
 */
public class ConnectSqlExpres {
    
    
    public static void main(String[] args) {
        
         Connection conn = null;
 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://.\\SQLExpress:1433;instance=SQLEXPRESS;databaseName=DB_Residence";  //DB_Residence 
                                                                                                     //jdbc:sqlserver://127.0.0.1:1433;instance=SQLEXPRESS;databaseName=jdo;
            
             String drvConn="jdbc:sqlserver://localhost:1433;instance=sqlexpress;databaseName=DB_Residence;";                                                                                        
                               
             
               String dbURL1 = "jdbc:sqlserver://soft\\sqlexpress:1433;instance=SQLEXPRESS;databaseName=DB_Residence";
               
               String dbURL12 = "jdbc:sqlserver://localhost/sqlexpress:1433;databaseName=DB_Residence ";
               
            String user = "sa";
            String pass = "farid";
            conn = DriverManager.getConnection(dbURL12, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectSqlExpres.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
        
    }

