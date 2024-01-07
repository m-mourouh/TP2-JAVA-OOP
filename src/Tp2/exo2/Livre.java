package Tp2.exo2;

public class Livre {
    private int isbn;
    private String titre;
    private Auteur auteur;

    public Livre(int isbn, String titre, Auteur auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur.toString();
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "isbn=" + isbn + ", titre=" + titre + ", auteur=" + auteur.toString() ;
    }
}
