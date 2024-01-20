package Tp2.exo4;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, Double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return this.getSalaire() * 1.15 ;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                "nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", telephone='" + this.getTelephone() + '\'' +
                ", salaire=" + this.calculerSalaire() +
                ", specialite='" + specialite + '\'' +
                '}';
    }


}
