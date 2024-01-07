package Tp2.exo3;

public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // == Getters and Setters ==
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // == Methods ==
    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations(){
        System.out.println("Nom : " + nom + "Prix :" + prix + "euros");
    }
}
