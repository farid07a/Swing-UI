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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import matjarokom.Control.com.ConnectionDB;


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
    private String Position_Produit;
    private boolean Check_Produit;
    private String Remarque_Produit;
    private String Filename=null;
     
     
    private byte [] ImageProduct=null;
    ConnectionDB connection_db=new ConnectionDB();
    PreparedStatement prepStm;
    Statement stm;
    ResultSet res;
    
  //  private Categorie categorie;
    
    
    
//    private ConnectionDB cnx=new ConnectionDB();
    
    private ArrayList<String> listProduit=new ArrayList<>();

    public produit_stock(int ID_Prod, String Designation, String Reference_Pro, int ID_Categorie, int Qty_En_Stock,
            Date Date_Expiration, double Prix_Vente, double Prix_Achat,int Min_Stock ,int Id_Unit, int Id_Stocke,
            String Position_Produit, boolean Check_Produit, String Remarque_Produit) {
        this.ID_Prod = ID_Prod;
        this.Designation = Designation;
        this.Reference_Pro = Reference_Pro;
        this.ID_Categorie = ID_Categorie;
        this.Qty_En_Stock = Qty_En_Stock;
        this.Date_Expiration = Date_Expiration;
        this.Prix_Vente = Prix_Vente;
        this.Prix_Achat = Prix_Achat;
        this.Min_Stock=Min_Stock;
        this.Id_Unit = Id_Unit;
        this.Id_Stocke = Id_Stocke;
        this.Position_Produit = Position_Produit;
        this.Check_Produit = Check_Produit;
        this.Remarque_Produit = Remarque_Produit;
    }

    public produit_stock() {
       
    }
    
   
    
    
    
    public void AddProduit(){
        //PreparedStatement prstm =null;
        //ResultSet res=null;
        
        String Query="INSERT INTO Produit (Designation,Reference_Pro,ID_Categorie,Qty_En_Stock,Date_Expiration,Prix_Vente,"
                + " Prix_Achat,Min_Stock,Id_Unit,Id_Stocke,Position_Produit,Check_Produit,Remarque_Produit) VALUES ("
                + " '"+Designation+"','"+Reference_Pro+"',"+ID_Categorie+","+Qty_En_Stock+",#"+Date_Expiration+"#,"+Prix_Vente+
                ","+Prix_Achat+","+Min_Stock+","+Id_Unit+","+Id_Stocke+",'"+Position_Produit+"','"+Remarque_Produit+"' )";
                
         String Query2="INSERT INTO Produit (Designation,Reference_Pro,ID_Categorie,Qty_En_Stock,Date_Expiration,Prix_Vente,"
                + " Prix_Achat,Min_Stock,Id_Unit,Id_Stocke,Position_Produit,Check_Produit,Remarque_Produit,image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
         try {
            prepStm=connection_db.getConnect().prepareStatement(Query);
            int x=prepStm.executeUpdate();  
            
            prepStm.setString(1, Designation);
            prepStm.setString(2, Reference_Pro);
            prepStm.setInt(3, ID_Categorie);
            prepStm.setInt(4, Qty_En_Stock);
            prepStm.setDate(5, new java.sql.Date(Date_Expiration.getTime()));
            prepStm.setDouble(6, Prix_Vente);
            prepStm.setDouble(7, Prix_Achat);
            prepStm.setInt(8, Min_Stock);
            prepStm.setInt(9, Id_Unit);
            prepStm.setInt(10, Id_Stocke);
            prepStm.setString(11, Position_Produit);
            prepStm.setBoolean(12, Check_Produit);
            prepStm.setString(13, Remarque_Produit);
           // prepStm.setBinaryStream(14, ImageProduct., x);
            
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
            if (x>0) {
    //            JOptionPane.showMessageDialog(new ConfirmationFrm(null), "Insert Produit Designation "+getDesignation());
            JOptionPane.showMessageDialog(null, "Success add product");
            }else {
                
            JOptionPane.showMessageDialog(null, "Cannot added product");
            
            }
            prepStm.close();
            connection_db.Deconnect();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in Function add product :"+e.getMessage());
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
    for (a = 0; a< getListProduit().size(); a++) {
        if (getListProduit().get(a).toString().startsWith(txt)) {
            complete=getListProduit().get(a).toString();   //complete =bouchon
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
            
                setID_Prod(res.getInt(1));
           
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
    
     
    public ImageIcon InsertImage(){
        UIManager.put("FileChooser.cancelButtonText","الغاء");
        JFileChooser chooserfile=new JFileChooser();
        chooserfile.setApproveButtonText("حفظ");
      //  chooserfile.showDialog(this,"اختر صورة المنتج");
        
        
        
        chooserfile.showOpenDialog(null);
        File filImg=chooserfile.getSelectedFile();
        
        
        setFilename(filImg.getAbsolutePath());
    
        
        
        ImageIcon imgIcon=new ImageIcon(getFilename());
        
        return imgIcon;
    }
    
    
    public static void main(String[] args) {
     
          System.out.println(new Categorie().GetIdCategorie("مشروبات"));  

// produit_stock pr=  new produit_stock();
                //pr.GetAllProductInTable(null);
         //       pr.ConsumQty(10, 1);
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
     * @return the Reference_Pro
     */
    public String getReference_Pro() {
        return Reference_Pro;
    }

    /**
     * @param Reference_Pro the Reference_Pro to set
     */
    public void setReference_Pro(String Reference_Pro) {
        this.Reference_Pro = Reference_Pro;
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
     * @return the Qty_En_Stock
     */
    public int getQty_En_Stock() {
        return Qty_En_Stock;
    }

    /**
     * @param Qty_En_Stock the Qty_En_Stock to set
     */
    public void setQty_En_Stock(int Qty_En_Stock) {
        this.Qty_En_Stock = Qty_En_Stock;
    }

    /**
     * @return the Date_Expiration
     */
    public Date getDate_Expiration() {
        return Date_Expiration;
    }

    /**
     * @param Date_Expiration the Date_Expiration to set
     */
    public void setDate_Expiration(Date Date_Expiration) {
        this.Date_Expiration = Date_Expiration;
    }

    /**
     * @return the Prix_Vente
     */
    public double getPrix_Vente() {
        return Prix_Vente;
    }

    /**
     * @param Prix_Vente the Prix_Vente to set
     */
    public void setPrix_Vente(double Prix_Vente) {
        this.Prix_Vente = Prix_Vente;
    }

    /**
     * @return the Prix_Achat
     */
    public double getPrix_Achat() {
        return Prix_Achat;
    }

    /**
     * @param Prix_Achat the Prix_Achat to set
     */
    public void setPrix_Achat(double Prix_Achat) {
        this.Prix_Achat = Prix_Achat;
    }

    /**
     * @return the Min_Stock
     */
    public int getMin_Stock() {
        return Min_Stock;
    }

    /**
     * @param Min_Stock the Min_Stock to set
     */
    public void setMin_Stock(int Min_Stock) {
        this.Min_Stock = Min_Stock;
    }

    /**
     * @return the Id_Unit
     */
    public int getId_Unit() {
        return Id_Unit;
    }

    /**
     * @param Id_Unit the Id_Unit to set
     */
    public void setId_Unit(int Id_Unit) {
        this.Id_Unit = Id_Unit;
    }

    /**
     * @return the Id_Stocke
     */
    public int getId_Stocke() {
        return Id_Stocke;
    }

    /**
     * @param Id_Stocke the Id_Stocke to set
     */
    public void setId_Stocke(int Id_Stocke) {
        this.Id_Stocke = Id_Stocke;
    }

    /**
     * @return the Position_Produit
     */
    public String getPosition_Produit() {
        return Position_Produit;
    }

    /**
     * @param Position_Produit the Position_Produit to set
     */
    public void setPosition_Produit(String Position_Produit) {
        this.Position_Produit = Position_Produit;
    }

    /**
     * @return the Check_Produit
     */
    public boolean isCheck_Produit() {
        return Check_Produit;
    }

    /**
     * @param Check_Produit the Check_Produit to set
     */
    public void setCheck_Produit(boolean Check_Produit) {
        this.Check_Produit = Check_Produit;
    }

    /**
     * @return the Remarque_Produit
     */
    public String getRemarque_Produit() {
        return Remarque_Produit;
    }

    /**
     * @param Remarque_Produit the Remarque_Produit to set
     */
    public void setRemarque_Produit(String Remarque_Produit) {
        this.Remarque_Produit = Remarque_Produit;
    }

    /**
     * @return the Filename
     */
    public String getFilename() {
        return Filename;
    }

    /**
     * @param Filename the Filename to set
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * @return the ImageProduct
     */
    public byte[] getImageProduct() {
        return ImageProduct;
    }

    /**
     * @param ImageProduct the ImageProduct to set
     */
    public void setImageProduct(byte[] ImageProduct) {
        this.ImageProduct = ImageProduct;
    }


    
}
