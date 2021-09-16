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
import javax.swing.JOptionPane;
import matjarokom.Control.com.ConnectionDB;

/**
 *
 * @author farid
 */
public class Unit_SousUnit {
    private int Id_Unit;
    private int Id_sousUnit;
    //private String Description;
    Statement stm;
    PreparedStatement prstm;
    ResultSet res;
    ConnectionDB connection_db=new ConnectionDB();
    public Unit_SousUnit(int Id_Unit, int Id_sousUnit) {
        this.Id_Unit = Id_Unit;
        this.Id_sousUnit = Id_sousUnit;
        
    }

    public Unit_SousUnit() {
    }
    
    
    
    public void AddRelationShipUnit_SousUnit(){
    String Query="INSERT INTO Unit_SousUnit (Id_Unit ,Id_sousUnit) VALUES ("+Id_Unit+","+Id_sousUnit+") ";
        try {
            prstm=connection_db.getConnect().prepareStatement(Query);
            int val=prstm.executeUpdate();
            if (val>0) {
                JOptionPane.showMessageDialog(null, "Succes add RelationShip");
            }else {
            JOptionPane.showMessageDialog(null, "Error insert data ");
            }
            
        prstm.close();
        connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    public static void main(String[] args) {
        
    }
    
    
    
    
}
