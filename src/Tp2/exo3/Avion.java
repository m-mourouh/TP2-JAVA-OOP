package Tp2.exo3;

public class Avion extends  Vehicule{
    private String compagnie;
    private int vitesseMax;

    public Avion(String nom, double prix, String compagnie, int vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant. ");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie : " + compagnie + " Vitesse maximale : " + vitesseMax + " km/h");
    }
}
