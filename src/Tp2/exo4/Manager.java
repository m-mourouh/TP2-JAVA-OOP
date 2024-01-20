package Tp2.exo4;

public class Manager extends  Employe{
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, Double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return 1.2 * this.getSalaire();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", telephone='" + this.getTelephone() + '\'' +
                ", salaire=" + this.calculerSalaire() +
                ", service='" + service + '\'' +
                '}';
    }
}
