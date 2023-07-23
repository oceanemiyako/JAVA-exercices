import java.util.Random;
import java.util.Scanner;

public class Exo17 {
/*
1. Générer un nombre aléatoire entre 1 et 100
2. Faire saisir un nombre à l'utilisateur
3. Si le chiffre saisi est plus grand, écrire : Le nombre est plus petit
4. Si le chiffre saisi est plus petit, écrire : Le nombre est plus grand
5. Si le chiffre saisi est égal au chiffre aléatoire, écrire : Vous avez gagné en X
tentatives
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreAleatoire = random.nextInt(100) + 1;
        int tentative = 0;
        int nombreSaisi;

        System.out.println("Devinez le nombre entre 1 et 100.");

        do {
            System.out.print("Saisir un nombre : ");
            nombreSaisi = scanner.nextInt();
            tentative++;

            if (nombreSaisi > nombreAleatoire) {
                System.out.println("Le nombre est plus petit.");
            } else if (nombreSaisi < nombreAleatoire) {
                System.out.println("Le nombre est plus grand.");
            } else {
                System.out.println("Vous avez gagné en " + tentative + " tentative(s) !");
            }

        } while (nombreSaisi != nombreAleatoire);

    }
}
