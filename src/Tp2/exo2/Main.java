package Tp2.exo2;

public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent(
                "John",
                "Doe",
                "john.doe@enset.com",
                "+1 858556845",
                25,
                45455245
        );

        Auteur auteur = new Auteur(
                "Mohamed",
                "Mourouh",
                "mmourouh@enset.com",
                "+212 785968536",
                24,
                899996589
        );

        Livre livre = new Livre(152655485, "Jungle Book", auteur);


        System.out.println("Adherent: " + adherent.toString());
        System.out.println("Livre: " + livre.toString());
    }
}
