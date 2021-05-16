package matjarokom.Model.com;


import java.awt.Color;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class produit_stock {
    
    private int ID_Prod;
    private String Designation;
    private double Prix_Unitaire;
    private int QtyEnStock;
    private int StockMin=5;
    
  //  private Categorie categorie;
    private int ID_Categorie;
    
    
//    private ConnectionDB cnx=new ConnectionDB();
    
    private ArrayList<String> listProduit=new ArrayList<>();
    
    public produit_stock(int ID_Prod,String Designation,double Prix_Unitaire,int QtyEnStock,int categorie){
    this.ID_Prod=ID_Prod;
    this.Designation=Designation;
    this.Prix_Unitaire=Prix_Unitaire;
    this.QtyEnStock=QtyEnStock;
    this.ID_Categorie=categorie;
        
    
    }
    public produit_stock(){}
    
    
    
    public void AddProduit(){
        PreparedStatement prstm =null;
        //ResultSet res=null;
        
        try {
            
           /* prstm=getCnx().getConnect().prepareStatement("insert into produit_stock (Designation,Prix_Unitaire,QtyEnStock,StockMin,ID_Categorie)"
                    + "VALUES (?,?,?,?,?)");*/
            
//                 prstm=getCnx().getConnect().prepareStatement("insert into produit_stock (Designation,"+""/*"Prix_Unitaire,"*/+"QtyEnStock,ID_Categorie)"
//                    + "VALUES (?,?,?)");
            prstm.setString(1, getDesignation());
            //prstm.setDouble(2, getPrix_Unitaire());
            prstm.setInt(2, getQtyEnStock());
           // prstm.setInt(4, 5);
            prstm.setInt(3, getID_Categorie());
            int x=prstm.executeUpdate();
            if (x>0) {
    //            JOptionPane.showMessageDialog(new ConfirmationFrm(null), "Insert Produit Designation "+getDesignation());
            }else {
                
            JOptionPane.showMessageDialog(null, prstm);
            
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in Function INSERT Data :"+e.getMessage());
        }
        
        try {
            prstm.close();
//            getCnx().Deconnect();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR IN CLOSED "+e.getMessage());
        }
        
    
    }
    
    
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
    
    
    /**
     * @return the ID_Prod
     */
    public int getID_Prod() {
        return ID_Prod;
    }

    /**
     * @param ID_Prod the ID_Prod to set
     */
    public void setID_Prod(int ID_Prod) {
        this.ID_Prod = ID_Prod;
    }

    /**
     * @return the Designation
     */
    public String getDesignation() {
        return Designation;
    }

    /**
     * @param Designation the Designation to set
     */
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    /**
     * @return the Prix_Unitaire
     */
    public double getPrix_Unitaire() {
        return Prix_Unitaire;
    }

    /**
     * @param Prix_Unitaire the Prix_Unitaire to set
     */
    public void setPrix_Unitaire(double Prix_Unitaire) {
        this.Prix_Unitaire = Prix_Unitaire;
    }

    /**
     * @return the QtyEnStock
     */
    public int getQtyEnStock() {
        return QtyEnStock;
    }

    /**
     * @param QtyEnStock the QtyEnStock to set
     */
    public void setQtyEnStock(int QtyEnStock) {
        this.QtyEnStock = QtyEnStock;
    }

    /**
     * @return the StockMin
     */
    public int getStockMin() {
        return StockMin;
    }

    /**
     * @param StockMin the StockMin to set
     */
    public void setStockMin(int StockMin) {
        this.StockMin = StockMin;
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
     * @return the cnx
     */
//    public ConnectionDB getCnx() {
//        return cnx;
//    }

    /**
     * @param cnx the cnx to set
     */
//    public void setCnx(ConnectionDB cnx) {
//        this.cnx = cnx;
//    }

    /**
     * @return the listProduit
     */
    public ArrayList<String> getListProduit() {
        return listProduit;
    }

    /**
     * @param listProduit the listProduit to set
     */
    public void setListProduit(ArrayList<String> listProduit) {
        this.listProduit = listProduit;
    }

    /**
     * @return the categorie
     */
//    public Categorie getCategorie() {
//        return categorie;
//    }

    /**
     * @param categorie the categorie to set
     */
//    public void setCategorie(Categorie categorie) {
//        this.categorie = categorie;
//    }
    
}
