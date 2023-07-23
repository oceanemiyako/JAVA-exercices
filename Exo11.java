import java.util.Scanner;

public class Exo11 {
    /*
    1. Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
    2. Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties à
    afficher
    */
    public static void main(String[] args) {
        int nbChapitres;
        int nbSousParties;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de chapitres : ");
        nbChapitres = scanner.nextInt();

        System.out.print("Entrez le nombre de sous-parties : ");
        nbSousParties = scanner.nextInt();

        afficherChapitresEtSousParties(nbChapitres, nbSousParties);

    }
    public static void afficherChapitresEtSousParties(int nbChapitres, int nbSousParties) {
        for (int chapitre = 1; chapitre <= nbChapitres; chapitre++) {
            System.out.println("Chapitre " + chapitre);
            for (int sousPartie = 1; sousPartie <= nbSousParties; sousPartie++) {
                System.out.println("  Sous-partie " + sousPartie);
            }
        }
    }
}
