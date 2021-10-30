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
import java.util.Iterator;
import javax.swing.JOptionPane;
import matjarokom.Control.com.ConnectionDB;
import matjarokom.ui.view.FormAddProduct;
import matjarokom.ui.view.FormAddStock;
import matjarokom.ui.view.Notification;
import matjarokom.ui.view.notification_;


/**
 *
 * @author farid
 */
public class Stocke {
    private int id_Stock;
    private String Locale_Stocke;
    private String Adress;
    private String NameManager;
    private String Tel;
    private String Desc_Locale;
    
    notification_ notif;
    FormAddStock formAddstock;
    
    private Statement stm;
    private ResultSet res;
    ConnectionDB connection_db=new ConnectionDB();
    public Stocke() {
    }
    
    
    public Stocke(int id_Stock, String Locale_Stocke,String Adress,String NameManager,String Tel ,String Desc_Locale) {
        this.id_Stock = id_Stock;
        this.Locale_Stocke = Locale_Stocke;
        this.Adress=Adress;
        this.NameManager=NameManager;
        this.Tel=Tel;
        this.Desc_Locale = Desc_Locale;
    }
    
    
    public void setFormAddLocal(FormAddStock frm){ // for passing notification msg in center of formaddStock
    formAddstock=frm;
    }
    
    
    
    
    public void AddLocal(){ //add new record local
        String Query="INSERT INTO stocke(Locale_Stocke,Adress,NameManager,Tel,Desc_Locale) VALUES "
                + "('"+Locale_Stocke+"','"+ getAdress() + "','"+getNameManager()+"','"+getTel()+"' ,'"+Desc_Locale+"')";//Add New Local added in Database
        PreparedStatement prepstm;
        try {
            prepstm=connection_db.getConnect().prepareStatement(Query);
            int x=prepstm.executeUpdate();
            if (x>0) {
                //JOptionPane.showMessageDialog(null, "Add new Record success");
                notif=new notification_(formAddstock, true); // for view comfirm msg in center window add stock
                notif.setLocationRelativeTo(formAddstock);
                notif.setVisible(true);
                
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
        
           String Query="UPDATE Stocke SET Locale_Stocke='"+Desc_Locale+"', Adress='"+getAdress()+"', NameManager='"+getNameManager()+"', Tel='"+getTel()+"', Desc_Locale='"+Desc_Locale+"'"
                   + " WHERE Id_Stocke="+id_Stock+"";//UPDATE  Local 
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
    
//    public DefaultTableModel GetDataLocalInDfModel(){ // return Df Model to Display in jtable
//        DefaultTableModel df=new DefaultTableModel(null,new String[]{"تحديد المكان","المحل","الترتيب"});
//        
//        
//    String Query="SELECT * FROM Stocke ";
//        try {
//            stm=connection_db.getConnect().createStatement();
//            res=stm.executeQuery(Query);
//            Object[] arg = new Object[3];
//            while (res.next()) {                
//                
//                arg[0]=res.getString("Desc_Locale");
//                arg[1]=res.getString("Locale_Stocke");
//                arg[2]=res.getInt(1);
//                df.addRow(arg);
//             }
//            JOptionPane.showMessageDialog(null, "The Row Count"+df.getRowCount());
//            
//            stm.close();
//            res.close();
//            connection_db.Deconnect();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    return df;
//    }
    
    public  ArrayList<Stocke>  GetlistDataLocaleStock(){
        ArrayList<Stocke> listStockLocal;
        listStockLocal = new ArrayList<>();
        String Query="SELECT * FROM Stocke ";
        try {
            stm=connection_db.getConnect().createStatement();
            res=stm.executeQuery(Query);
            Stocke stck;

            while (res.next()) {                
                
                stck=new Stocke(res.getInt("Id_Stocke"), res.getString("Locale_Stocke"),
                        res.getString("Adress"),res.getString("NameManager"),res.getString("Tel"),
                        res.getString("Desc_Locale"));
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
    
    public String GetLocalStockById(int id){
    
     Iterator<Stocke> itr=GetlistDataLocaleStock().iterator();
        Stocke next;
        while (itr.hasNext()) {
            next = itr.next();
            if (next.getId_Stock()==id) return next.getLocale_Stocke();
        }
        
        return "";
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

    /**
     * @return the Adress
     */
    public String getAdress() {
        return Adress;
    }

    /**
     * @param Adress the Adress to set
     */
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    /**
     * @return the NameManager
     */
    public String getNameManager() {
        return NameManager;
    }

    /**
     * @param NameManager the NameManager to set
     */
    public void setNameManager(String NameManager) {
        this.NameManager = NameManager;
    }

    /**
     * @return the Tel
     */
    public String getTel() {
        return Tel;
    }

    /**
     * @param Tel the Tel to set
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }
   
}
