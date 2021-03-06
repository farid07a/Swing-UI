/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
*
The Model in the MVC design pattern acts as a data layer for the application.
It represents the business logic for application and also the state of application.
The model object fetch and store the model state in the database.
Using the model layer, rules are applied to the data that represents the concepts of application.
*
 */
package matjarokom.Model.com;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import matjarokom.Control.com.ConnectionDB;

/**
 *
 * @author farid
 */
public class Fournisseur {

    private int ID_Fournisseur;
    private String Nom_Fournisseur;
    private String Prenom_Fournisseur;
    private String Adress;
    private String Tel_email;
    private String Nif;
    //private String N_Assurance;
    private float Debit;
    private float Credit;
    private String N_Enterprise;
    private String N_Compte;
    private String N_Registre;
    private String Remarque;
    private String WebSite;
    private String Facebook;
    private String Youtube;

    private ConnectionDB cnx = new ConnectionDB();
    private PreparedStatement prstm;
    private Statement stm;
    private ResultSet res;

    // test view 
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

    public Fournisseur() {
    }

    public Fournisseur(int ID_Fournisseur, String Nom_Fournisseur, String Prenom_Fournisseur, String Adress, String Tel_email, String Nif, float Debit, float Credit, String N_Enterprise, String N_Compte, String N_Registre, String Website, String Remarque, String Facebook, String Youtube) {
        this.ID_Fournisseur = ID_Fournisseur;
        this.Nom_Fournisseur = Nom_Fournisseur;
        this.Prenom_Fournisseur = Prenom_Fournisseur;
        this.Adress = Adress;
        this.Tel_email = Tel_email;
        this.Nif = Nif;
        this.Debit = Debit;
        this.Credit = Credit;
        this.N_Enterprise = N_Enterprise;
        this.N_Compte = N_Compte;
        this.N_Registre = N_Registre;
        this.WebSite = Website;
        this.Remarque = Remarque;
        this.Facebook = Facebook;
        this.Youtube = Youtube;
    }

    /**
     * @return the Nom_Fournisseur
     */
    public String getNom_Fournisseur() {
        return Nom_Fournisseur;
    }

    /**
     * @param Nom_Fournisseur the Nom_Fournisseur to set
     */
    public void setNom_Fournisseur(String Nom_Fournisseur) {
        this.Nom_Fournisseur = Nom_Fournisseur;
    }

    /**
     * @return the Prenom_Fournisseur
     */
    public String getPrenom_Fournisseur() {
        return Prenom_Fournisseur;
    }

    /**
     * @param Prenom_Fournisseur the Prenom_Fournisseur to set
     */
    public void setPrenom_Fournisseur(String Prenom_Fournisseur) {
        this.Prenom_Fournisseur = Prenom_Fournisseur;
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

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public void setYoutube(String Youtube) {
        this.Youtube = Youtube;
    }

    public String getFacebook() {
        return Facebook;
    }

    public String getYoutube() {
        return Youtube;
    }

    /**
     * @return the Tel_email
     */
    public String getTel_email() {
        return Tel_email;
    }

    /**
     * @param Tel_email the Tel_email to set
     */
    public void setTel_email(String Tel_email) {
        this.Tel_email = Tel_email;
    }

    /**
     * @return the Nif
     */
    public String getNif() {
        return Nif;
    }

    /**
     * @param Nif the Nif to set
     */
    public void setNif(String Nif) {
        this.Nif = Nif;
    }

    /**
     * @return the Debit
     */
    public float getDebit() {
        return Debit;
    }

    /**
     * @param Debit the Debit to set
     */
    public void setDebit(float Debit) {
        this.Debit = Debit;
    }

    /**
     * @return the Credit
     */
    public float getCredit() {
        return Credit;
    }

    /**
     * @param Credit the Credit to set
     */
    public void setCredit(float Credit) {
        this.Credit = Credit;
    }

    /**
     * @return the N_Enterprise
     */
    public String getN_Enterprise() {
        return N_Enterprise;
    }

    /**
     * @param N_Enterprise the N_Enterprise to set
     */
    public void setN_Enterprise(String N_Enterprise) {
        this.N_Enterprise = N_Enterprise;
    }

    /**
     * @return the N_Compte
     */
    public String getN_Compte() {
        return N_Compte;
    }

    /**
     * @param N_Compte the N_Compte to set
     */
    public void setN_Compte(String N_Compte) {
        this.N_Compte = N_Compte;
    }

    /**
     * @return the N_Registre
     */
    public String getN_Registre() {
        return N_Registre;
    }

    /**
     * @param N_Registre the N_Registre to set
     */
    public void setN_Registre(String N_Registre) {
        this.N_Registre = N_Registre;
    }

    public void Add_Fournissour() {
        String Query = "INSERT INTO Fournisseur (Nom_Fournisseur,Prenom_Fournisseur,Adress,Tel_email,Nif,Debit,Credit,N_Enterprise,N_Compte,N_Registre,Website,Remarque,Facebook,Youtube)"
                + "  VALUES('" + Nom_Fournisseur + "','" + Prenom_Fournisseur + "','" + Adress + "','" + Tel_email + "','" + Nif + "',"
                + Debit + "," + Credit + ",'" + N_Enterprise + "','" + N_Compte + "','" + N_Registre + "', '" + WebSite + "','" + Remarque + "',"
                + "'" + Facebook + "','" + Youtube + "')";
        try {
            setPrstm(getCnx().getConnect().prepareStatement(Query));
            int x = getPrstm().executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Succes Add in Fournisseur");
            } else //obj= new javax.swing.JOptionPane();
            {
                JOptionPane.showMessageDialog(null, "Error Add in Fournisseur");
            }
            getPrstm().close();
            getCnx().Deconnect();

        } catch (SQLException e) {
            System.out.println("Error in sqlQuery" + e.getMessage());

        }

    }

    public void UpdateFournisseur(int id) {
        //Nom_Fournisseur,Prenom_Fournisseur,Adress,Tel_email,Nif,Debit,Credit,N_Enterprise,N_Compte,N_Registre
        String Query = "UPDATE Fournisseur SET Nom_Fournisseur='" + this.Nom_Fournisseur + "', Prenom_Fournisseur='" + this.Prenom_Fournisseur + "', "
                + " Adress='" + this.Adress + "', Tel_email='" + this.Tel_email + "', Nif='" + this.Nif + "', Debit=" + this.Debit + " ,Credit=" + this.Credit + ", "
                + " N_Enterprise='" + this.N_Enterprise + "', N_Compte='" + this.N_Compte + "', N_Registre='" + this.N_Registre + "' ,Website='" + this.WebSite + "' ,"
                + " Remarque='" + this.Remarque + "', Facebook='" + this.Facebook + "', Youtube='" + this.Youtube + "' "
                + " WHERE ID_Fournisseur=" + id + " ";
        try {
            setPrstm(getCnx().getConnect().prepareStatement(Query));

            if (getPrstm().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Success Update");
            } else {
                JOptionPane.showMessageDialog(null, "Error update");
            }

            getPrstm().close();
            getCnx().Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList GetListFournisseur() { // Get List Of Fournisseur
//            Statement stm;
//            ResultSet res;
        String Query = "SELECT * FROM Fournisseur";
        ArrayList<Fournisseur> listFournisseur;
        listFournisseur = new ArrayList<>();
        Fournisseur FournisseurObj;

        try {

            stm = cnx.getConnect().createStatement();
            res = stm.executeQuery(Query);
            while (res.next()) {
                //Nom_Fournisseur,Prenom_Fournisseur,Adress,Tel_email,Nif,Debit,Credit,N_Enterprise,N_Compte,N_Registre
                FournisseurObj = new Fournisseur(res.getInt("ID_Fournisseur"), res.getString("Nom_Fournisseur"), res.getString("Prenom_Fournisseur"),
                        res.getString("Adress"), res.getString("Tel_email"), res.getString("Nif"), res.getFloat("Debit"), res.getFloat("Credit"),
                        res.getString("N_Enterprise"), res.getString("N_Compte"), res.getString("N_Registre"), res.getString("Website"), res.getString("Remarque"),
                        res.getString("Facebook"), res.getString("Youtube"));
                listFournisseur.add(FournisseurObj);
            }
            stm.close();
            res.close();
            cnx.Deconnect();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error getList Fournisseur" + e.getMessage());
        }

        return listFournisseur;
    }

    /**
     * This Function Get specific Data to display in table in fournisseurView
     *
     * @return array of membre
     */
    public Object[] GetArrayDataFournissourToView() {
        Object[] data = {this.getN_Enterprise(), this.getPrenom_Fournisseur(), this.getNom_Fournisseur(), this.getID_Fournisseur()};
        return data;
    }

    public void GetInformationFromDBByID(int id_frn) {
        String Query = "SELECT * FROM Fournisseur WHERE ID_Fournisseur=" + id_frn;
        Fournisseur frns = null;
        try {
            setStm(getCnx().getConnect().createStatement());
            setRes(getStm().executeQuery(Query));
            if (getRes().next()) {
                /* new Fournisseur(res.getInt("ID_Fournisseur"), res.getString("Nom_Fournisseur"), res.getString("Prenom_Fournisseur"),
                    res.getString("Adress"), res.getString("Tel_email"), res.getString("Nif"), res.getFloat("Debit"), res.getFloat("Credit"),
                    res.getString("N_Enterprise"), res.getString("N_Compte"), res.getString("N_Registre"));
                 */

                this.ID_Fournisseur = res.getInt("ID_Fournisseur");
                this.Nom_Fournisseur = res.getString("Nom_Fournisseur");
                this.Prenom_Fournisseur = res.getString("Prenom_Fournisseur");
                this.Adress = res.getString("Adress");
                this.Tel_email = res.getString("Tel_email");
                this.Nif = res.getString("Nif");
                this.Debit = res.getFloat("Debit");
                this.Credit = res.getFloat("Credit");
                this.N_Enterprise = res.getString("N_Enterprise");
                this.N_Compte = res.getString("N_Compte");
                this.N_Registre = res.getString("N_Registre");
                this.WebSite = res.getString("Website");
                this.Remarque = res.getString("Remarque");
                this.Facebook = res.getString("Facebook");
                this.Youtube = res.getString("Youtube");

            }
            getStm().close();
            getRes().close();
            getCnx().Deconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int maxIdFournisseur() {
        String Query = "SELECT MAX(ID_Fournisseur) FROM Fournisseur";
        int max = -1;
        try {
            setStm(getCnx().getConnect().createStatement());
            setRes(getStm().executeQuery(Query));
            if (getRes().next()) {
                max = getRes().getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return max;
    }

    public static void main(String[] args) {
//        new Fournisseur(0, "Farid", "Khebbache", "Rue 50", "067120574", "555480022", "4785692", 0.0f, 0.0f, "DevOps", "1785426").Add_Fournissour();

        System.out.println(new Fournisseur().maxIdFournisseur());
    }

    /**
     * @return the Remarque
     */
    public String getRemarque() {
        return Remarque;
    }

    /**
     * @param Remarque the Remarque to set
     */
    public void setRemarque(String Remarque) {
        this.Remarque = Remarque;
    }

    /**
     * @return the cnx
     */
    public ConnectionDB getCnx() {
        return cnx;
    }

    /**
     * @param cnx the cnx to set
     */
    public void setCnx(ConnectionDB cnx) {
        this.cnx = cnx;
    }

    /**
     * @return the prstm
     */
    public PreparedStatement getPrstm() {
        return prstm;
    }

    /**
     * @param prstm the prstm to set
     */
    public void setPrstm(PreparedStatement prstm) {
        this.prstm = prstm;
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
     * @return the WebSite
     */
    public String getWebSite() {
        return WebSite;
    }

    /**
     * @param WebSite the WebSite to set
     */
    public void setWebSite(String WebSite) {
        this.WebSite = WebSite;
    }

}
