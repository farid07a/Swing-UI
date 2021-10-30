/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.Model.com;
import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author farid
 */
public class Arrivage extends HelperClass{
 
    private int ID_Arrivage ;
    private int Num_Arrivage;
    private Date Date_Arrivage;
    
    private float TotalePrix;
    private int ID_Fournisseur;

    /**
     *
     * @param ID_Arrivage
     * @param Num_Arrivage
     * @param Date_Arrivage
     * @param TotalePrix
     * @param ID_Fournisseur
     */
    
    
    public Arrivage(int ID_Arrivage, int Num_Arrivage, Date Date_Arrivage, float TotalePrix, int ID_Fournisseur) {
        this.ID_Arrivage = ID_Arrivage;
        this.Num_Arrivage = Num_Arrivage;
        this.Date_Arrivage = Date_Arrivage;
        this.TotalePrix = TotalePrix;
        this.ID_Fournisseur = ID_Fournisseur;
    
    }

    public Arrivage() {
    }

    
    public int GetidArrivagByNum(int NumArrivage){   // get NumFac for supplier no identifier 
    
        String Query="SELECT ID_Arrivage FROM Arrivage WHERE Num_Arrivage="+NumArrivage;
        int id_Arrivage=1;
        try {
            
            RunStatementExpression(Query); // for run query
            
            if (res.next()) {
                id_Arrivage=res.getInt(1);
            }
            
            CloseAllOpenConnection(); // for closing the connections
            
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    return id_Arrivage;
    }
    
    
    
    
    
    /**
     * @return the ID_Arrivage
     */
    public int getID_Arrivage() {
        return ID_Arrivage;
    }

    /**
     * @param ID_Arrivage the ID_Arrivage to set
     */
    public void setID_Arrivage(int ID_Arrivage) {
        this.ID_Arrivage = ID_Arrivage;
    }

    /**
     * @return the Num_Arrivage
     */
    public int getNum_Arrivage() {
        return Num_Arrivage;
    }

    /**
     * @param Num_Arrivage the Num_Arrivage to set
     */
    public void setNum_Arrivage(int Num_Arrivage) {
        this.Num_Arrivage = Num_Arrivage;
    }

    /**
     * @return the Date_Arrivage
     */
    public Date getDate_Arrivage() {
        return Date_Arrivage;
    }

    /**
     * @param Date_Arrivage the Date_Arrivage to set
     */
    public void setDate_Arrivage(Date Date_Arrivage) {
        this.Date_Arrivage = Date_Arrivage;
    }

    /**
     * @return the TotalePrix
     */
    public float getTotalePrix() {
        return TotalePrix;
    }

    /**
     * @param TotalePrix the TotalePrix to set
     */
    public void setTotalePrix(float TotalePrix) {
        this.TotalePrix = TotalePrix;
    }

    /**
     * @return the ID_Fournisseur
     */
    public int getID_Fournisseur() {
        return ID_Fournisseur;
    }

    /**
     * @param ID_Fournisseur the ID_Fournisseur to set
     */
    public void setID_Fournisseur(int ID_Fournisseur) {
        this.ID_Fournisseur = ID_Fournisseur;
    }
    
    public static void main(String[] args) {
        
        System.out.println(" num arrivage :"+new Arrivage().GetidArrivagByNum(0));
        
    }
    
    
}
