package Tp2.exo1;

public class Main {
    public static void main(String[] args) {
        Compte compte1 = new Compte();
        compte1.setNumero("123456");
        compte1.deposer(1000);
        compte1.afficherCompteInfo();

        compte1.retirer(500);
        compte1.afficherCompteInfo();

        Compte.afficherNbComptes();
    }
}
