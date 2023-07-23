import java.util.Scanner;

public class Exo18 {
    /*
    1. La factorielle d'un nombre positif est le quotient cumulatif des
    nombres allant de 1 à ce nombre
    2. Exemple : la factorielle de 3 est 1 x 2 x 3 = 6
    3. Réaliser un programme qui affiche la factorielle d'un nombre
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre positif : ");
        int nombre = scanner.nextInt();

        if (nombre < 0) {
            System.out.println("Erreur : Le nombre doit être positif.");
        } else {
            long resultat = calculerFactorielle(nombre);
            afficherFactorielle(nombre, resultat);
        }
    }
    public static long calculerFactorielle(int nombre) {
        if (nombre == 0 || nombre == 1) {
            return 1;
        }
        return nombre * calculerFactorielle(nombre - 1);
    }
    public static void afficherFactorielle(int nombre, long resultat) {
        System.out.print("La factorielle de " + nombre + " est : ");
        for (int i = 1; i <= nombre; i++) {
            System.out.print(i);
            if (i < nombre) {
                System.out.print(" x ");
            }
        }
    }
}
