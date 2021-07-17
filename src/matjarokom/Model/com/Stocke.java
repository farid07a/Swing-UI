/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.Model.com;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import matjarokom.Control.com.ConnectionDB;


/**
 *
 * @author farid
 */
public class Stocke {
    private int id_Stock;
    private String  Locale_Stocke;
    private String Desc_Locale;
    private Statement stm;
    private ResultSet res;
    ConnectionDB connection_db=new ConnectionDB();
    public Stocke() {
    }

    public Stocke(int id_Stock, String Locale_Stocke, String Desc_Locale) {
        this.id_Stock = id_Stock;
        this.Locale_Stocke = Locale_Stocke;
        this.Desc_Locale = Desc_Locale;
    }
    
    public void AddLocal(){ //add new record local
        String Query="INSERT INTO stocke(Locale_Stocke,Desc_Locale) VALUES ('"+Locale_Stocke+"','"+Desc_Locale+"')";//Add New Local added in Database
        PreparedStatement prepstm;
        try {
            prepstm=connection_db.getConnect().prepareStatement(Query);
            int x=prepstm.executeUpdate();
            if (x>0) {
                JOptionPane.showMessageDialog(null, "Add new Record success");
            }else JOptionPane.showMessageDialog(null, "Failed to add new Records local");
            
            prepstm.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    public void DeleteLocal(int idLocal){
    
     String Query="DELETE FROM Stocke WHERE Id_Stocke="+idLocal+" ";//Add New Local added in Database
        PreparedStatement prepstm;
        try {
            prepstm=connection_db.getConnect().prepareStatement(Query);
            int x=prepstm.executeUpdate();
            if (x>0) {
                JOptionPane.showMessageDialog(null, "Add new Record success");
            }else JOptionPane.showMessageDialog(null, "Failed to add new Records local");
            
            prepstm.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    
    public void updateLocal(int IdLocal){
        
           String Query="UPDATE Stocke SET Locale_Stocke='"+Desc_Locale+"', Desc_Locale='"+Desc_Locale+"' WHERE Id_Stocke="+id_Stock+"";//UPDATE  Local 
        PreparedStatement prepstm;
        try {
            prepstm=connection_db.getConnect().prepareStatement(Query);
            int x=prepstm.executeUpdate();
            if (x>0) {
                JOptionPane.showMessageDialog(null, "Update Record success");
            }else JOptionPane.showMessageDialog(null, "Failed to update Records local");
            
            prepstm.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    public DefaultTableModel GetDataLocalInDfModel(){ // return Df Model to Display in jtable
        DefaultTableModel df=new DefaultTableModel(null,new String[]{"تحديد المكان","المحل","الترتيب"});
        
        
    String Query="SELECT * FROM Stocke ";
        try {
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            Object[] arg = new Object[3];
            while (res.next()) {                
                
                arg[0]=res.getString("Desc_Locale");
                arg[1]=res.getString("Locale_Stocke");
                arg[2]=res.getInt(1);
                df.addRow(arg);
             }
            JOptionPane.showMessageDialog(null, "The Row Count"+df.getRowCount());
            
            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return df;
    }
    
    public  ArrayList<Stocke>  GetlistDataLocaleStock(){
        ArrayList listStockLocal;
        listStockLocal = new ArrayList<Stocke>();
        String Query="SELECT * FROM Stocke ";
        try {
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            Stocke stck;

            while (res.next()) {                
                
                stck=new Stocke(res.getInt(1), res.getString("Locale_Stocke"),res.getString("Desc_Locale"));
                listStockLocal.add(stck);
             
             }
            stck=null;
            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    return listStockLocal;
    }
    /**
     * @param NameLocal*
     * @return **********************************************************/
    
    public int GetIdStockLocal(String NameLocal){
    String Query="SELECT Id_Stocke FROM Stocke WHERE Locale_Stocke='"+NameLocal+"' ";
    
        try {
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            if (res.next()) {
             return res.getInt(1);
            }
            stm.close();
            res.close();
            connection_db.Deconnect();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return 0;
    }
    

    /**
     * @return the id_Stock
     */
    public int getId_Stock() {
        return id_Stock;
    }

    /**
     * @param id_Stock the id_Stock to set
     */
    public void setId_Stock(int id_Stock) {
        this.id_Stock = id_Stock;
    }

    /**
     * @return the Locale_Stocke
     */
    public String getLocale_Stocke() {
        return Locale_Stocke;
    }

    /**
     * @param Locale_Stocke the Locale_Stocke to set
     */
    public void setLocale_Stocke(String Locale_Stocke) {
        this.Locale_Stocke = Locale_Stocke;
    }

    /**
     * @return the Desc_Locale
     */
    public String getDesc_Locale() {
        return Desc_Locale;
    }

    /**
     * @param Desc_Locale the Desc_Locale to set
     */
    public void setDesc_Locale(String Desc_Locale) {
        this.Desc_Locale = Desc_Locale;
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
    public static void main(String[] args) {
        
        System.out.println(new Stocke().GetlistDataLocaleStock().size());
        
    }
   
}
