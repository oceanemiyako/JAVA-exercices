import java.util.Scanner;

public class Exo16 {

    /*
    1. Un nombre premier est un nombre divisible par 1 et par soit-même
    uniquement
    2. 1 n'est pas un nombre premier
    3. Écrire un programme qui permet de savoir si un nombre est premier
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        boolean estPremier = true;

        if (nombre <= 1) {
            estPremier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nombre); i++) {
                if (nombre % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }

        if (estPremier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }
}
