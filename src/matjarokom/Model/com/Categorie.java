package matjarokom.Model.com;


import matjarokom.Control.com.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */
public class Categorie {
    private ConnectionDB connectiondb=new ConnectionDB();
    private Statement stm;
    private ResultSet res;
    private int ID_Categorie;
    private String Name_Ctg;
    private String Description_Ctg;
    private int TypePrd;
    private ArrayList<Categorie> ListCategorie=new ArrayList<>();
    
    public Categorie(int ID_Categorie,String Name_Ctg,String Description_Ctg,int TypePrd){
    this.ID_Categorie=ID_Categorie;
    this.Name_Ctg=Name_Ctg;
    this.Description_Ctg=Description_Ctg;
    this.TypePrd=TypePrd;
        
    }
    
    public Categorie(){
    
    
    }
   
    public void GetListOfCategories(){
    
        String Query="SELECT *  FROM Categorie";
        try {
            setStm(getConnectiondb().getConnect().createStatement());
            setRes(getStm().executeQuery(Query));
            Categorie catg;
            while (getRes().next()) {                
                catg=new Categorie(getRes().getInt(1), getRes().getString(2), getRes().getString(3), 0);
                getListCategorie().add(catg);
            }
            
            getStm().close();
            getRes().close();
            getConnectiondb().Deconnect();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
          
    }
    
    
    
    
   /*******Function Filling Combobox************************************************/ 
    
/*    
    public void FillListCategorie(JComboBox com,int type){

        String sqlRequette="SELECT Name_Ctg FROM categorie WHERE TypeCtg="+type+"";
        try {
            stm=cnx.getConnect().createStatement();
            res=stm.executeQuery(sqlRequette);
            while (res.next()) {                
                com.addItem(res.getString(1));
                
            //    System.out.println("Categorie.GetListCategorie()"+res.getString(1));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error i GetListCategorie"+e.getMessage());
        }
        try {
        stm.close();
        res.close();
        cnx.Deconnect();
        } catch (Exception e) {
        }
    }
    */
    
 /*****************************Close Function Filling Combobox******************************************/ 
    
    
    
    
/********************************Function FillTableCategorie******************************************/

    
    /*public void FillTabCategorie(JTable Tab,int Type){

        String sqlRequette="SELECT  * FROM categorie WHERE TypeCtg="+Type+"";
        DefaultTableModel modTab;
       
        modTab=(DefaultTableModel) Tab.getModel();
       // Object arg[]=new Object[3];
        modTab.setRowCount(0);
        try {
            stm=cnx.getConnect().createStatement();
            res=stm.executeQuery(sqlRequette);
            while (res.next()) {                
                
           Object  arg[]={res.getInt(1),res.getString(2),res.getString(3)};   
         
                modTab.addRow(arg);
          
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error i GetListCategorie"+e.getMessage());
        }
       try {
        stm.close();
        res.close();
        cnx.Deconnect();
            
        } catch (Exception e) {
        }
    
    }*/

/******************************Close Function Fillin
     * @param name    
     * @return ***********************/    
    
    
    
    
    public int  GetIdCategorie(String name){

        String sqlRequette="SELECT ID_Categorie FROM Categorie where Name_Categorie='"+name+"'";
        int NumCatg=0;
        
        
        try {
            setStm(getConnectiondb().getConnect().createStatement());
            setRes(getStm().executeQuery(sqlRequette));
            while (getRes().next()) {                
                NumCatg=getRes().getInt(1);
                
            }
            System.out.println("The id categorie is: "+NumCatg);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Exception when get id Categorie "+e.getMessage());
        }
        
        
        try {
            getStm().close();
            getRes().close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error when cloing statement and connection :"+e.getMessage());
        }
           getConnectiondb().Deconnect();
        
        
    return NumCatg;
        
    }
    
    public String GetNameCategorieById(int id){
    
        Iterator<Categorie> itr=getListCategorie().iterator(); // get ArrayList.To Iterator()
    Categorie next;
    
    while (itr.hasNext()) {
            next = itr.next();
            
            if (next.getID_Categorie()==id) return next.getName_Ctg();
            
            //Catg_produit.addItem(next.getName_Ctg());
        }
   // next=null;
    //itr=null;
    
    return "";
    
    }
    
    
    
/**********************Close Function GetIdCategorie***********************************/    
    
    /*******      use in legacy code
    public int GetLastCategorie(){
        String Query="SELECT MAX(ID_Categorie) FROM categorie ";
        int LasNubCat = 0;
        try {
            stm=cnx.getConnect().createStatement();
            res=stm.executeQuery(Query);
            res.next();
            LasNubCat=res.getInt(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in sql Query "+e.getMessage());
        }
        try {
            res.close();
            stm.close();
            cnx.Deconnect();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in closing "+e.getMessage());
        }
        
        
    return LasNubCat;
    }
    
    ****/
    
    
    /*             use in legacy code
    public void AddNewCategorie(){
        PreparedStatement prestm=null;
        String Query="INSERT INTO categorie(Name_Ctg,Description_Ctg,TypeCtg)VALUES (?,?,?)";
        try {
            prestm=cnx.getConnect().prepareCall(Query);
            prestm.setString(1, getName_Ctg());
            prestm.setString(2, getDescription_Ctg());
            prestm.setInt(3, this.TypePrd);
            
            int x=prestm.executeUpdate();
            if (x>0) {
                JOptionPane.showMessageDialog(null, "The new Categorie is addeeeeeeeeeed");
            }else{
            JOptionPane.showMessageDialog(null, "Erro in Insert Data ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro in Insert with Sql"+e.getMessage());
        }
    
        try {
            prestm.close();
            cnx.getConnect().close();
        } catch (Exception e) {
        }
    }
    
    */
    
    
    /*         use in legacy code
    public void SuppCategorie(int NumCatg){
    
        PreparedStatement prestm=null;
        String QueryDel="DELETE FROM categorie WHERE ID_Categorie="+NumCatg+"";
        try {
            prestm=cnx.getConnect().prepareStatement(QueryDel);
            prestm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Le categorie est supprimeés");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error in Delete Categorie :"+e.getMessage());
         
        }
        
    
    }
    
     public void UpdateCategorieInDB(int val){
     PreparedStatement prstm=null;
        
        try {
           // prstm=getObj_cnx().getConnect().prepareStatement("UPDATE  fournisseur SET Nom_Forn =?, Prenom_Forn=?, Tel_Forn =?,Address_Forn=?,Num_Compte_Forn =?,Registre_Forn=? WHERE ID_fourn="+val+"");
             prstm=cnx.getConnect().prepareStatement("UPDATE  categorie SET Name_Ctg =?, Description_Ctg=? WHERE ID_Categorie="+val+"");
            //prstm.setInt(1, this.ID_Fournisseur);
            prstm.setString(1, this.Name_Ctg);
             prstm.setString(2, this.Description_Ctg);
             
            prstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "The Data is updated");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error in update Row"+e.getMessage());
        
        }
        try {
            prstm.close();
            cnx.Deconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
  /*
    public static void main(String[] args) {
        // new Categorie(0, "", "").FillListCategorie(null);
        //System.out.println("test last Number"+new Categorie(0, "petit Bouteille", "petit Bouteille").AddNewCategorie());
        new Categorie(0, "petit Bouteille", "petit Bouteille",0).AddNewCategorie();
    }

    /**
     * @return the ID_Categorie
     */
    public int getID_Categorie() {
        return ID_Categorie;
    }

    /**
     * @param ID_Categorie the ID_Categorie to set
     */
    public void setID_Categorie(int ID_Categorie) {
        this.ID_Categorie = ID_Categorie;
    }

    /**
     * @return the Name_Ctg
     */
    public String getName_Ctg() {
        return Name_Ctg;
    }

    /**
     * @param Name_Ctg the Name_Ctg to set
     */
    public void setName_Ctg(String Name_Ctg) {
        this.Name_Ctg = Name_Ctg;
    }

    /**
     * @return the Description_Ctg
     */
    public String getDescription_Ctg() {
        return Description_Ctg;
    }

    /**
     * @param Description_Ctg the Description_Ctg to set
     */
    public void setDescription_Ctg(String Description_Ctg) {
        this.Description_Ctg = Description_Ctg;
    }

    /**
     * @return the connectiondb
     */
    public ConnectionDB getConnectiondb() {
        return connectiondb;
    }

    /**
     * @param connectiondb the connectiondb to set
     */
    public void setConnectiondb(ConnectionDB connectiondb) {
        this.connectiondb = connectiondb;
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

    /**
     * @return the TypePrd
     */
    public int getTypePrd() {
        return TypePrd;
    }

    /**
     * @param TypePrd the TypePrd to set
     */
    public void setTypePrd(int TypePrd) {
        this.TypePrd = TypePrd;
    }

    /**
     * @return the ListCategorie
     */
    public ArrayList<Categorie> getListCategorie() {
        return ListCategorie;
    }

    /**
     * @param ListCategorie the ListCategorie to set
     */
    public void setListCategorie(ArrayList<Categorie> ListCategorie) {
        this.ListCategorie = ListCategorie;
    }
}
