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
    private byte typ_unit;
    private Statement stm;
    private PreparedStatement prst;
    private ResultSet res;
    private ConnectionDB connection_db = new ConnectionDB();

    public Unit(int Id_Unit, String Unit_Name, String Description,byte typ_unit) {
        this.Id_Unit = Id_Unit;
        this.Unit_Name = Unit_Name;
        this.Description = Description;
        this.typ_unit=typ_unit;
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

    public void addUnit() {
        //declare QueryAdd Unit
        StringBuilder QueryBuild = new StringBuilder();
        QueryBuild.append("INSERT INTO Unit (Unit_Name,Description,Type_Unit) VALUES ('");
        QueryBuild.append(getUnit_Name());
        QueryBuild.append("','").append(getDescription()).append("',").append(getTyp_unit()).append(" );");

        PreparedStatement prstm = null;
        try {
            System.out.println(QueryBuild.toString());

            prstm = connection_db.getConnect().prepareStatement(QueryBuild.toString());

            System.out.println("passed prepareStatement ");
            int x = prstm.executeUpdate();
            System.out.println("Execute Query ");

            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Success Add Categorie");
            } else {
                JOptionPane.showMessageDialog(null, "Error in Add Categorie");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            prstm.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
        }

    }

    /**
     * ************************Update Unit In table**********************
     */
    public void UpdateUnit() {
        String Query;

        Query = "UPDATE Unit SET Unit_Name='" + Unit_Name + "', Description='" + Description + "' ,Type_Unit= "+typ_unit + " WHERE Id_Unit=" + Id_Unit + "";
        try {
            this.prst = connection_db.getConnect().prepareStatement(Query);
            int x = prst.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Success Update...");
            } else {
                JOptionPane.showMessageDialog(null, "cannot Update...");
            }

            prst.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * ***********************Show Units In Table Unit
     *
     * @param tableUnits******************
     */
    public void FillingAllUnit_InTable(JTable tableUnit) {
        // SELECT ALL UNIT TO DISPLAY DATA
        String Query;
        Query = "SELECT * FROM Unit";
        DefaultTableModel dfTab = (DefaultTableModel) tableUnit.getModel();
        dfTab.setRowCount(0);

        try {

            stm = connection_db.getConnect().createStatement();
            res = stm.executeQuery(Query);
            Object arg[] = new Object[5];

            while (res.next()) {
                arg[0] = new ImageIcon(getClass().getResource("/imgs/Delete_Mini_h.png"));
                arg[1] = new ImageIcon(getClass().getResource("/imgs/Edit_Mini_h.png"));
                //arg[2]=new ImageIcon(getClass().getResource("/imgs/C_Add_Mini_h.png")); 
                arg[2] = res.getString(3);
                arg[3] = res.getString(2);
                arg[4] = res.getInt(1);

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

    /**
     * ************Get N° Order Of Categorie List in Tabl
     *
     * @return e*************
     */
    public int GetLast_Order_Categorie() {

        int Last_Order = 0;
        String Query = "SELECT MAX(Id_Unit) FROM Unit";
        try {
            stm = connection_db.getConnect().createStatement();
            res = stm.executeQuery(Query);

            //(1==1)? Last_Order=res.getInt(1) : Last_Order=0;
            if (res.next()) {
                Last_Order = res.getInt(1);
            }

            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Last_Order;
    }

    /**
     * @param Unit_Name************************************************************
     */
    public int GetIdUnit(String Unit_Name) {
        String QueryIdUnit = "SELECT Id_Unit FROM Unit WHERE Unit_Name='" + Unit_Name + "' ";
        try {
            stm = connection_db.getConnect().createStatement();
            res = stm.executeQuery(QueryIdUnit);

            if (res.next()) {
                Id_Unit = res.getInt(1);
            }

            // }else return 1;
            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
        }

        return Id_Unit;
    }

    //
    public String GetUnitName(int Id_Unit) {
        String QueryNmUnit = "SELECT Unit_Name  FROM Unit WHERE Id_Unit=" + Id_Unit + " ";
        String UnitNm = null;
        try {
            stm = connection_db.getConnect().createStatement();
            res = stm.executeQuery(QueryNmUnit);

            if (res.next()) {
                UnitNm = res.getString(1);
            }
            // }else return 1;
            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
        }

        return UnitNm;
    }
/**
     * @param Id_Unit*
     * @return ******************************************************************/
    
    public byte GetTypeUnite(int Id_Unit){
        String QueryNmUnit = "SELECT Type_Unit  FROM Unit WHERE Id_Unit=" + Id_Unit + " ";
        byte Type_Unit = 0;
        try {
            stm = connection_db.getConnect().createStatement();
            res = stm.executeQuery(QueryNmUnit);

            if (res.next()) {
                Type_Unit = res.getByte(1);
                System.out.println("Type Unit code got :"+Type_Unit);
            }
            // }else return 1;
            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
        }

        return Type_Unit;
    
    
    }
    
/*********************************************************************/    
    /**
     * ****************Delete Data Categorie
     *
     * @param Id_Unit
     * @return  ***************************
     */
    public int DeleteCategorie(int Id_Unit) {

        String Query = "DELETE  FROM  Unit WHERE Id_Unit = " + Id_Unit + " ;";

        try {
            prst = connection_db.getConnect().prepareStatement(Query);
            System.out.println("PASSE STEP PREPARESTATEMENT");
            int Stat_Del = prst.executeUpdate();
            System.out.println("test Execute update ");

            if (Stat_Del > 0) {
                return Stat_Del;
            } //            JOptionPane.showMessageDialog(null, "Success Delete data");
            else {
                JOptionPane.showMessageDialog(null, "Cannot Delete Data");
            }

            prst.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * @return *****************************************************************
     */
    public ArrayList<Unit> GetlistDataUnits() {
        ArrayList<Unit> listDataUnits;
        listDataUnits = new ArrayList<>();
        String Query = "SELECT * FROM Unit ";
        try {
            stm = connection_db.getConnect().createStatement();
            res = stm.executeQuery(Query);
            Unit unitObj;
            while (res.next()) {
                unitObj = new Unit(res.getInt(1), res.getString("Unit_Name"), res.getString("Description"),res.getByte("typ_unit"));
                listDataUnits.add(unitObj);

            }
            unitObj = null;
            stm.close();
            res.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listDataUnits;
    }

    /**
     * *******************
     * @param args
     */
    public static void main(String[] args) {

        //new Unit(1, "وحدة متعددة", "وحدة متعددة").addUnit();
        int N_Order = new Unit(1, "وحدة متعددة", "وحدة متعددة",(byte)0).GetLast_Order_Categorie();
        System.out.println("Last Order :" + N_Order);

        //new Unit().DeleteCategorie(8);

    }

    /**
     * @return the typ_unit
     */
    public byte getTyp_unit() {
        return typ_unit;
    }

    /**
     * @param typ_unit the typ_unit to set
     */
    public void setTyp_unit(byte typ_unit) {
        this.typ_unit = typ_unit;
    }
}
