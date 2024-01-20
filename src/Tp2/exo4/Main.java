package Tp2.exo4;

public class Main {
    public static void main(String[] args) {
        Ingenieur engineer = new Ingenieur("John", "Doe", "john@doe.com", "0123456789", 10000.0, "Java");
        Manager manager = new Manager("Jane", "Doe", "jane@doe", "0153458789", 20000.0, "Skill center");

        System.out.println(engineer.toString());
        System.out.println(manager.toString());

    }
}
