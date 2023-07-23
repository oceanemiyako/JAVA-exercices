import java.util.Scanner;

public class Exo14 {
    /*
    1. Déclarer une variable nombre
    2. À l'aide de boucles, afficher les suites de nombres qui permettent
    d'arriver au nombre inscrit précédemment
     */
    public static void main(String[] args) {

    int nombre;
     nombre = 45;

        for (int i = 1; i <= nombre; i++) {
            int sum = i;
            System.out.print(i);
            for (int j = i + 1; j <= nombre; j++) {
                if (sum + j <= nombre) {
                    sum += j;
                    System.out.print(" + " + j);
                }
            }
            if (sum == nombre) {
                System.out.println(" = " + sum);
            }
        }
        }
    }

