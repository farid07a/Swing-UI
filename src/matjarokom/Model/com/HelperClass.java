/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.Model.com;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import matjarokom.Control.com.ConnectionDB;

/**
 *
 * @author farid
 */
public class HelperClass {
    
    public Statement stm;
    public ResultSet res;
    public PreparedStatement prs;
    public ConnectionDB cnx=new ConnectionDB();

    public HelperClass() {
    }
    
    
    public void RunStatementExpression(String Query) throws SQLException{
        
        stm=cnx.getConnect().createStatement();
        res=stm.executeQuery(Query);
    }
    
    public void CloseAllOpenConnection() throws SQLException{
    
            stm.close();
            res.close();
            cnx.Deconnect();
    }
    
    
}
