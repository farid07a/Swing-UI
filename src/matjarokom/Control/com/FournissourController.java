/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 The controller layer gets the user requests from the view layer and processes them,
 * with the necessary validations. It acts as an interface between Model and View. 
 * The requests are then sent to model for data processing. Once they are processed,
 * the data is sent back to the controller and then displayed on the view.
 */
package matjarokom.Control.com;

import matjarokom.Model.com.Fournisseur;
import matjarokom.ui.view.FournissourView;

/**
 *
 * @author farid
 */
public class FournissourController {
    
    private Fournisseur fournisseurModel;
    private FournissourView fournisseurGui;

    public FournissourController(Fournisseur fournisseurModel, FournissourView fournisseurGui) {
        this.fournisseurModel = fournisseurModel;
        this.fournisseurGui = fournisseurGui;
    }
    
    public void SetID_Fournisseur(int ID_Fournisseur){
    fournisseurModel.setID_Fournisseur(ID_Fournisseur);
    }
    public void setNom_Fournisseur(String Name){
    fournisseurModel.setNom_Fournisseur(Name);
    }
    
    public void setPrenom_Fournisseur(String Prenom){
    fournisseurModel.setPrenom_Fournisseur(Prenom);
    }
    
    public void SetAdress(String Adress)
    {
    fournisseurModel.setAdress(Adress);
    }
    public void SetTel_email(String Tel_email){
    fournisseurModel.setTel_email(Tel_email);
    }
    public void SetNif(String Nif){
    fournisseurModel.setNif(Nif);
    }
   
    public void SetDebit(float Debit){
    fournisseurModel.setDebit(Debit);
    }
    public void SetCredit(float Credit){
    fournisseurModel.setCredit(Credit);
    }
    
    
    public int GetID_Fournisseur(){
    return fournisseurModel.getID_Fournisseur();
    }
    
    public String GetNom_Fournisseur(){
    return fournisseurModel.getNom_Fournisseur();
    }
    public String GetPrenom_Fournisseur(){
    return fournisseurModel.getNom_Fournisseur();
    }
    
    public String GetAdress(){
    return fournisseurModel.getAdress();
    }
    public String GetTel_email(){
    return fournisseurModel.getTel_email();
    }
    
    public String GetNif(){
    return fournisseurModel.getNif();
    }
    
    
    
    public float GetDebit(){
    return fournisseurModel.getDebit();
    }
    public float GetCredit(){
    return fournisseurModel.getCredit();
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
    
    
}
