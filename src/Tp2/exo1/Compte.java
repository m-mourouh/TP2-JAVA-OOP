package Tp2.exo1;

public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes;

    public Compte(){
        this.numero = "";
        this.solde = 0;
        nbComptes++;
    }


    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    void deposer(double montant){
        if(montant > 0){
            this.solde += montant;
        }else {
            System.out.println("Impossible d'effectuer cette opération");
            System.out.println("Veuiller saisir un montant supérieur à 0");
        }
    }

    void retirer(double montant){
        if(this.solde - montant >= 0){
            this.solde -= montant;
        }else {
            System.out.println("Votre solde est insuffisant");
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + numero);
        System.out.println("Solde actuel : " + solde);
    }

    public static void afficherNbComptes() {
        System.out.println("Nombre total de comptes créés : " + nbComptes);
    }

}
