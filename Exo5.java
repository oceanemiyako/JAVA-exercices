import java.util.Scanner;

public class Exo5 {
    /*
    1. Créer une variable mois de type entier
    2. Affecter une valeur à la variable mois
    3. Afficher le nombre de jours du mois
    4. Si le nombre est inférieur à 1 et supérieur à 12, afficher un
message d'erreur
     */
    public static void main(String[] args) {
    int mois;
        System.out.print("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        mois = sc.nextInt();

        int nombreJours = getNombreJoursMois(mois);
        if (nombreJours > 0) {
            System.out.println("Le mois " + mois + " a " + nombreJours + " jours.");
        } else {
            System.out.println("Error : Le numéro du mois doit être compris entre 1 et 12 inclus.");
        }

    }
    public static int getNombreJoursMois(int mois) {
        switch (mois) {
            case 1:  // Janvier
            case 3:  // Mars
            case 5:  // Mai
            case 7:  // Juillet
            case 8:  // Août
            case 10: // Octobre
            case 12: // Décembre
                return 31;
            case 4:  // Avril
            case 6:  // Juin
            case 9:  // Septembre
            case 11: // Novembre
                return 30;
            case 2:  // Février
                return 28; // ou 29 si année bissextile
            default:
                return -1; // Retourne -1 pour indiquer une erreur si le mois n'est pas valide
        }
    }
}
