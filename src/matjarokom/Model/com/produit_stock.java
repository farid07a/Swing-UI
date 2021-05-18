package matjarokom.Model.com;


import java.awt.Color;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class produit_stock {
    
    private int ID_Prod;
    
    private String Designation;
    private String Reference_Pro;
    private int ID_Categorie;
    private int Qty_En_Stock;
    private Date Date_Expiration;
    private double Prix_Vente;
    private double Prix_Achat;
    
    private int Min_Stock=5;
    private int Id_Unit;
    private int Id_Stocke;
    private int Position_Produit;
    private boolean Check_Produit;
    private String Remarque_Produit;
    
    
    
  //  private Categorie categorie;
    
    
    
//    private ConnectionDB cnx=new ConnectionDB();
    
    private ArrayList<String> listProduit=new ArrayList<>();

    public produit_stock(int ID_Prod, String Designation, String Reference_Pro, int ID_Categorie, int Qty_En_Stock, Date Date_Expiration, double Prix_Vente, double Prix_Achat, int Id_Unit, int Id_Stocke, int Position_Produit, boolean Check_Produit, String Remarque_Produit) {
        this.ID_Prod = ID_Prod;
        this.Designation = Designation;
        this.Reference_Pro = Reference_Pro;
        this.ID_Categorie = ID_Categorie;
        this.Qty_En_Stock = Qty_En_Stock;
        this.Date_Expiration = Date_Expiration;
        this.Prix_Vente = Prix_Vente;
        this.Prix_Achat = Prix_Achat;
        this.Id_Unit = Id_Unit;
        this.Id_Stocke = Id_Stocke;
        this.Position_Produit = Position_Produit;
        this.Check_Produit = Check_Produit;
        this.Remarque_Produit = Remarque_Produit;
    }

    private produit_stock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
    
//    public void AddProduit(){
//        PreparedStatement prstm =null;
//        //ResultSet res=null;
//        
//        try {
//            
//           /* prstm=getCnx().getConnect().prepareStatement("insert into produit_stock (Designation,Prix_Unitaire,QtyEnStock,StockMin,ID_Categorie)"
//                    + "VALUES (?,?,?,?,?)");*/
//            
////                 prstm=getCnx().getConnect().prepareStatement("insert into produit_stock (Designation,"+""/*"Prix_Unitaire,"*/+"QtyEnStock,ID_Categorie)"
////                    + "VALUES (?,?,?)");
//            prstm.setString(1, getDesignation());
//            //prstm.setDouble(2, getPrix_Unitaire());
//            prstm.setInt(2, getQtyEnStock());
//           // prstm.setInt(4, 5);
//            prstm.setInt(3, getID_Categorie());
//            int x=prstm.executeUpdate();
//            if (x>0) {
//    //            JOptionPane.showMessageDialog(new ConfirmationFrm(null), "Insert Produit Designation "+getDesignation());
//            }else {
//                
//            JOptionPane.showMessageDialog(null, prstm);
//            
//            }
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error in Function INSERT Data :"+e.getMessage());
//        }
//        
//        try {
//            prstm.close();
////            getCnx().Deconnect();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ERROR IN CLOSED "+e.getMessage());
//        }
//        
//    
//    }
    
    
    public int Exist(){
    
        return 0;
    }
    
    public void GetAllProduct(){
        
        
        Statement stm=null;
        ResultSet res=null;
        
        System.out.println("aUTOCOMPLETjTEXTfIELD.GetNameUser() ");
        try { 
//            stm=getCnx().getConnect().createStatement();
            res=stm.executeQuery("SELECT  * FROM  produit_stock");
              
            while (res.next()) {                
                
                getListProduit().add(res.getString("Designation"));
                
            }
            
              
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in  Function "+e.getMessage());
            
        }
        try {
            stm.close();
        res.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error in closed "+e.getMessage());
        }
    
    //return listProduit;
    } 
    
    public int autocomplete(JTextField jTextField1,String txt){
    
    String complete="";  //txt ba
    int start=txt.length();  //2
    int last=txt.length();  //2
    int a;
    int etat=0;
    for (a = 0; a< listProduit.size(); a++) {
        if (listProduit.get(a).toString().startsWith(txt)) {
            complete=listProduit.get(a).toString();   //complete =bouchon
            last=complete.length();                     //6
           jTextField1.setForeground(Color.green);
            etat=1;
            break;
           
        }
       
        
        else{
        
        jTextField1.setForeground(Color.red);
        }
        
        
    }
    if (last>start) {
        //JOptionPane.showMessageDialog(null, " jTextField1.setText(complete)"+complete);
        //jTextField1.setForeground(Color.green);
            etat=1;
        jTextField1.setText(complete);
         // JOptionPane.showMessageDialog(null, " jTextField1.setCaretPosition(last)"+last);
       jTextField1.setCaretPosition(last);
       // JOptionPane.showMessageDialog(null, " jTextField1.moveCaretPosition(start) "+start);
        jTextField1.moveCaretPosition(start);
       
    }
    
     return etat;
    
}
    
    public void GetID_Product(String Designation){
    Statement stm=null;
    ResultSet res=null;
    
        try {
//            stm=getCnx().getConnect().createStatement();
            res=stm.executeQuery("SELECT ID_Prod FROM produit_stock WHERE Designation= '"+Designation+"'");
            
           if( res.next()){
            
            ID_Prod=res.getInt(1);
           
           }
            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "EEROR GetID_Product :"+e.getMessage());
        }
        
        try {
            stm.close();
            res.close();
      //      cnx.Deconnect();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR IN CLOSED "+e.getMessage());
        }
     
   
    }
    
    public void AddQtyExisting(int Qty,int NumPrd){
        PreparedStatement prs=null;
        String SQlReq="UPDATE produit_stock SET QtyEnStock=QtyEnStock+"+Qty+" where ID_Prod="+NumPrd+"";
   try {    
        //    prs=cnx.getConnect().prepareStatement(SQlReq);    
           int xx= prs.executeUpdate();
            if (xx>0) {
                JOptionPane.showMessageDialog(null, "The Value is updated");
            }else {
            JOptionPane.showMessageDialog(null, "Error in update Value");
            }
          //  cnx.Deconnect();
            prs.close();
                  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in Method AddQtyExisting"+e.getMessage());
        }
    }
    
/**********************************************************************************/
    
    public void ConsumQty(int Qty,int NumPrd){
     PreparedStatement prs=null;
        String SQlReq="UPDATE produit_stock SET QtyEnStock=QtyEnStock-"+Qty+" where ID_Prod="+NumPrd+"";
          try {    
        //    prs=cnx.getConnect().prepareStatement(SQlReq);    
           int xx= prs.executeUpdate();
            if (xx>0) {
                JOptionPane.showMessageDialog(null, "The Value is updated");
            }else {
            JOptionPane.showMessageDialog(null, "Error in update Value");
            }
        //    cnx.Deconnect();
            prs.close();
                  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in Method AddQtyExisting"+e.getMessage());
        }
        
    }
    
    
    public String GetCategorieProduct(int NumPrd){
        Statement stm=null;
        ResultSet res=null;
        
        String catg="";
        String Requette="SELECT categorie.Name_Ctg FROM categorie,produit_stock "
                + "WHERE produit_stock.ID_Prod="+NumPrd+" AND produit_stock.ID_Categorie=categorie.ID_Categorie";
        try {
        //    stm=cnx.getConnect().createStatement();
            res=stm.executeQuery(Requette);
            
            if (res.next()) {
                
                catg=res.getString(1);
            }
            System.out.println("produit_stock.GetCategorieProduct()"+catg);
          
        } catch (SQLException e) {
            System.out.println("ERROR  produit_stock.GetCategorieProduct()"+e.getMessage());
        }
        
        try {
            stm.close();
            res.close();
        //    cnx.Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return catg;
    }
    
    public int GetLastProduct(){
    Statement stm=null;
    ResultSet res=null;
    int lastNumPrd=0;
    String requette="SELECT MAX(ID_Prod)FROM produit_stock";
    
        try {
        //    stm=cnx.getConnect().createStatement();
            res=stm.executeQuery(requette);
            if (res.next()) {
                lastNumPrd=res.getInt(1);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in GetLastProduct"+e.getMessage());
        }
        
        try {
            stm.close();
            res.close();
        //    cnx.Deconnect();
        } catch (SQLException e) {
        }
        
    return lastNumPrd;
    }
    
     String Filename=null;
     byte [] ImageProduct=null;
    public void InsertImage(){
        JFileChooser chooserfile=new JFileChooser();
        chooserfile.showOpenDialog(null);
        File filImg=chooserfile.getSelectedFile();
        
        Filename=filImg.getAbsolutePath();
    
        ImageIcon imgIcon=new ImageIcon(Filename);
    }
    
    
    public static void main(String[] args) {
      produit_stock pr=  new produit_stock();
                //pr.GetAllProductInTable(null);
                pr.ConsumQty(10, 1);
                //pr.GetID_Product("bouteille");
        //System.out.println("produit_stock.main()"+pr.getID_Prod()); 
        
        //pr.AddQtyExisting(5);
       // pr.GetCategorieProduct(1);
        
        //System.out.println("The last is :::::::::"+pr.GetLastProduct());
    }

    public  void GetAllProductInTable(JTable tab){
    
        Statement stm=null;
        ResultSet res=null;
        DefaultTableModel df=new DefaultTableModel();
         String Requette="SELECT produit_stock.ID_Prod,   produit_stock.Designation,    produit_stock.QtyEnStock,  categorie.Name_Ctg "
                 + " FROM categorie,produit_stock "
                + "WHERE   produit_stock.ID_Categorie=categorie.ID_Categorie";
         
         df=(DefaultTableModel) tab.getModel();
         df.setRowCount(0);
        try {
            
        //    stm=cnx.getConnect().createStatement();
            res=stm.executeQuery(Requette);
           // JOptionPane.showMessageDialog(null, "EXECUT QUERY IS Crrct");
            
            while (res.next()) {                
                
                System.out.println("ID Prd:"+res.getInt(1));
                System.out.println("ID Des:"+res.getString(2));
                System.out.println("ID Qty:"+res.getInt(3));
                System.out.println("ID Catg:"+res.getString(4));
                Object arg[]={res.getInt(1),res.getString(2),res.getInt(3),res.getString(4)};
                df.addRow(arg);
            }
            
            tab.setModel(df);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in sql"+e.getMessage());
        }
        try {
            stm.close();
            res.close();
        //    cnx.Deconnect();
        } catch (Exception e) {
        }
        
        
        
    }
    
   
    public ArrayList<String> getListProduit() {
        return listProduit;
    }

    /**
     * @param listProduit the listProduit to set
     */
    public void setListProduit(ArrayList<String> listProduit) {
        this.listProduit = listProduit;
    }


    
}
