import java.util.Scanner;

public class Exo7 {
    /*
    1. Créer une variable caractere
    2. Affecter une valeur à la variable caractere
    3. Afficher un message en fonction du type du caractère (lettre,
    nombre, ou caractère spécial)
     */
    public static void main(String[] args) {
        char caractere;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un caractère : ");
        caractere = scanner.next().charAt(0);

        if (Character.isLetter(caractere)) {
            System.out.println("Le caractère saisi est une lettre");
        } else if (Character.isDigit(caractere)) {
            System.out.println("Le caractère saisi est un nombre");
        } else {
            System.out.println("Le caractère saisi est un caractère spécial");
        }
    }
}
