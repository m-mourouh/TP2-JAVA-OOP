package Tp2.exo3;

public class Main {
    public static void main(String[] args) {
        // Création d'objets de différentes classes
        Vehicule vehicule = new Vehicule("Véhicule Générique", 5000.0);
        Voiture voiture = new Voiture("Toyota", 25000.0, "Camry", 2022);
        Moto moto = new Moto("Harley Davidson", 12000.0, "Sportster", 120);
        Avion avion = new Avion("Airbus A380", 300000000.0, "Air France", 1020);

        // Appel de la méthode emettreSon() pour chaque véhicule
        vehicule.emettreSon();
        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        // Affichage des informations pour chaque véhicule
        System.out.println("\nInformations du Véhicule Générique :");
        vehicule.afficherInformations();

        System.out.println("\nInformations de la Voiture :");
        voiture.afficherInformations();

        System.out.println("\nInformations de la Moto :");
        moto.afficherInformations();

        System.out.println("\nInformations de l'Avion :");
        avion.afficherInformations();
    }
}
