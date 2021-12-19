/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class Article {
    private int ID_Article;
    private String Designation;
    private float Prix;
    private String Categorie;
    private int Quantite;

    public int getID_Article() {
        return ID_Article;
    }

    public void setID_Article(int ID_Article) {
        this.ID_Article = ID_Article;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float Prix) {
        this.Prix = Prix;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String Categorie) {
        this.Categorie = Categorie;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }

}
