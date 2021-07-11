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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import matjarokom.Control.com.ConnectionDB;

/**
 *
 * @author farid
 */
public class Unit {
    
    private int Id_Unit;
    private String Unit_Name;
    private String Description;
    
    private Statement stm;
    private PreparedStatement prst;
    private ResultSet res;
    private ConnectionDB connection_db = new ConnectionDB();
    
    
    public Unit(int Id_Unit, String Unit_Name, String Description) {
        this.Id_Unit = Id_Unit;
        this.Unit_Name = Unit_Name;
        this.Description = Description;
    }

    public Unit() {
    
    
    }
    
    

    public int getId_Unit() {
        return Id_Unit;
    }
    
    
    public String getDescription() {
        return Description;
    }

    public String getUnit_Name() {
        return Unit_Name;
    }
    
    
    
    public void setUnit_Name(String Unit_Name) {
        this.Unit_Name = Unit_Name;
    }

    public void setId_Unit(int Id_Unit) {
        this.Id_Unit = Id_Unit;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
    public void addUnit(){
        //declare QueryAdd Unit
        StringBuilder QueryBuild=new StringBuilder();
        QueryBuild.append("INSERT INTO Unit (Unit_Name,Description) VALUES ('");
        QueryBuild.append(getUnit_Name());
        QueryBuild.append("','").append(getDescription()).append("');");
        
        
        PreparedStatement prstm = null;
        try {
            System.out.println(QueryBuild.toString());
            
            prstm=connection_db.getConnect().prepareStatement(QueryBuild.toString());
            
            System.out.println("passed prepareStatement ");
            int x=prstm.executeUpdate();
            System.out.println("Execute Query ");
            
            if (x>0) JOptionPane.showMessageDialog(null, "Success Add Categorie");
            else JOptionPane.showMessageDialog(null, "Error in Add Categorie");
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        try {
            prstm.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
        }
    
    }
    
    /*************************Show Units In Table Units*******************/
    
    public void FillingAllUnit_InTable(JTable tableUnit){
        // SELECT ALL UNIT TO DISPLAY DATA
        String Query;
        Query = "SELECT * FROM Unit";
        DefaultTableModel dfTab=(DefaultTableModel) tableUnit.getModel();
        dfTab.setRowCount(0);
        
        try {
        
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            Object arg[]=new Object[5];
            
            while (res.next()) {    
            arg[0]=new ImageIcon(getClass().getResource("/imgs/Delete_Mini_h.png")); 
            arg[1]=new ImageIcon(getClass().getResource("/imgs/Edit_Mini_h.png"));  
            //arg[2]=new ImageIcon(getClass().getResource("/imgs/C_Add_Mini_h.png")); 
            arg[2]=res.getString(3);   
            arg[3]=res.getString(2);    
            arg[4]=res.getInt(1);  
            
            dfTab.addRow(arg);
            }
            tableUnit.setModel(dfTab);  // add model in my -table
            
            stm.close(); // Closed Connection && res
            res.close(); //
            
            connection_db.Deconnect(); //Deconnect Connection 
            
        } catch (SQLException e) {
                // Display Error Exception 
            
            e.printStackTrace();
        }
        
    }
    
    /**************Get N° Order Of Categorie List in Tabl
     * @return e**************/
    
    public int GetLast_Order_Categorie(){
    
        int Last_Order=0;
        String Query="SELECT count(Id_Unit) FROM Unit";
        try {
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            
            //(1==1)? Last_Order=res.getInt(1) : Last_Order=0;
            if (res.next()) Last_Order=res.getInt(1);
            
          stm.close();
          res.close();
          connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
      return Last_Order;
    }
/******************Delete Data Categorie
     * @param Id_Unit
     * @return  ****************************/
public int DeleteCategorie(int Id_Unit){
    
    String Query="DELETE  FROM  Unit WHERE Id_Unit = "+Id_Unit+" ;";
    
    try {
        prst=connection_db.getConnect().prepareStatement(Query);
        System.out.println("PASSE STEP PREPARESTATEMENT");
        int Stat_Del=prst.executeUpdate();
        System.out.println("test Execute update ");
        
        if (Stat_Del>0) 
            return Stat_Del;
//            JOptionPane.showMessageDialog(null, "Success Delete data");
        else JOptionPane.showMessageDialog(null, "Cannot Delete Data"); 
        
        prst.close();
        connection_db.Deconnect();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
    }
/********************************************************************/

    
    
    
    public static void main(String[] args) {
        
        //new Unit(1, "وحدة متعددة", "وحدة متعددة").addUnit();
        int N_Order=new Unit(1, "وحدة متعددة", "وحدة متعددة").GetLast_Order_Categorie();
        System.out.println("Last Order :"+N_Order);
        
        
        new Unit().DeleteCategorie(8);
        
    }
}
