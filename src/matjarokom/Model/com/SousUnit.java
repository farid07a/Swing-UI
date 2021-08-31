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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import matjarokom.Control.com.ConnectionDB;

/**
 *
 * @author farid
 */
public class SousUnit {
    private int Id_sousUnit;
    private String sousUnit_Name;
    private String DescSousUnit; 
    private Statement stm;
    private PreparedStatement prst;
    private ResultSet res;
    private ConnectionDB connection_db = new ConnectionDB();

    public SousUnit() {
    }

    public SousUnit(int Id_sousUnit, String sousUnit_Name, String DescSousUnit) {
        this.Id_sousUnit = Id_sousUnit;
        this.sousUnit_Name = sousUnit_Name;
        this.DescSousUnit = DescSousUnit;
    }
    
    
    public void insertSousUnit(){
    String Query="INSERT INTO SousUnit (sousUnit_Name,DescSousUnit)VALUES(?,?)";
        try {
            setPrst(getConnection_db().getConnect().prepareStatement(Query));
            getPrst().setString(1, getSousUnit_Name());
            getPrst().setString(2, getDescSousUnit());
            int x=getPrst().executeUpdate();
            if (x>0) {
                JOptionPane.showMessageDialog(null, "Succes Add Sous Unit");
            }
            
            getPrst().close();
            getConnection_db().Deconnect();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int GetID_SousUnit(String SousUnit){
    String Query="SELECT Id_sousUnit FROM SousUnit WHERE sousUnit_Name='"+SousUnit+"' ";
    int  IdSousUnit=1;
        try {
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            if (res.next()) {
                IdSousUnit=res.getInt(1);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return IdSousUnit;
    }
    
    
    
    
    public ArrayList <SousUnit> GetlistSousUnitsItems() {
        ArrayList<SousUnit> listDataUnits;
        listDataUnits = new ArrayList<>();
        String Query = "SELECT * FROM SousUnit ";
        try {
            setStm(getConnection_db().getConnect().createStatement());
            setRes(getStm().executeQuery(Query));
            //Unit unitObj;
            while (getRes().next()) {
               
                listDataUnits.add(new SousUnit(getRes().getInt("Id_sousUnit"), getRes().getString("sousUnit_Name"), getRes().getString("DescSousUnit")));

            }
            
            getStm().close();
            getRes().close();
            getConnection_db().Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listDataUnits;
    }
    
    
    public static void main(String[] args) {
        
    }

    /**
     * @return the Id_sousUnit
     */
    public int getId_sousUnit() {
        return Id_sousUnit;
    }

    /**
     * @param Id_sousUnit the Id_sousUnit to set
     */
    public void setId_sousUnit(int Id_sousUnit) {
        this.Id_sousUnit = Id_sousUnit;
    }

    /**
     * @return the sousUnit_Name
     */
    public String getSousUnit_Name() {
        return sousUnit_Name;
    }

    /**
     * @param sousUnit_Name the sousUnit_Name to set
     */
    public void setSousUnit_Name(String sousUnit_Name) {
        this.sousUnit_Name = sousUnit_Name;
    }

    /**
     * @return the DescSousUnit
     */
    public String getDescSousUnit() {
        return DescSousUnit;
    }

    /**
     * @param DescSousUnit the DescSousUnit to set
     */
    public void setDescSousUnit(String DescSousUnit) {
        this.DescSousUnit = DescSousUnit;
    }

    /**
     * @return the stm
     */
    public Statement getStm() {
        return stm;
    }

    /**
     * @param stm the stm to set
     */
    public void setStm(Statement stm) {
        this.stm = stm;
    }

    /**
     * @return the prst
     */
    public PreparedStatement getPrst() {
        return prst;
    }

    /**
     * @param prst the prst to set
     */
    public void setPrst(PreparedStatement prst) {
        this.prst = prst;
    }

    /**
     * @return the res
     */
    public ResultSet getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(ResultSet res) {
        this.res = res;
    }

    /**
     * @return the connection_db
     */
    public ConnectionDB getConnection_db() {
        return connection_db;
    }

    /**
     * @param connection_db the connection_db to set
     */
    public void setConnection_db(ConnectionDB connection_db) {
        this.connection_db = connection_db;
    }
}
