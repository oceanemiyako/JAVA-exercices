import java.util.Scanner;

public class Exo19 {
    /*
    1. Un nombre fort est un nombre dont la somme de la factorielle des
    chiffres qui le constitue est égale àce nombre
    2. Par exemple : 145 = 1! + 4! + 5! soit 145 = 1 + 24 + 120
    3. Écrire un programme qui permet de savoir si un nombre est fort
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.print("Entrez un nombre : ");
        nombre = scanner.nextInt();

        if (estNombreFort(nombre)) {
            System.out.println(nombre + " est un nombre fort.");
        } else {
            System.out.println(nombre + " n'est pas un nombre fort.");
        }

    }
    public static int calculerFactorielle(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculerFactorielle(n - 1);
        }
    }
    public static boolean estNombreFort(int nombre) {
        int original = nombre;
        int sommeFactorielles = 0;

        while (nombre > 0) {
            int chiffre = nombre % 10;
            sommeFactorielles += calculerFactorielle(chiffre);
            nombre /= 10;
        }
        return sommeFactorielles == original;
    }
    }

