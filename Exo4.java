import java.util.Scanner;

public class Exo4 {
    /*
    1. Créer une variable jour de type entier
    2. Affecter une valeur à la variable jour
    3. Afficher le jour de la semaine en lettre en fonction du nombre
    passé
    4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message
d'erreur
     */
    public static void main(String[] args) {
        int jour;

        System.out.print("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        jour = sc.nextInt();

        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Erreur : Le nombre doit être compris entre 1 et 7.");
                break;
        }
    }
}
