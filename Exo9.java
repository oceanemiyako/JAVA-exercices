import java.util.Scanner;

public class Exo9 {
    /*
    1. Ecrire un programme qui permet de vérifier si un profil est valable pour une candidature
    2. Le profil contient trois critères :
    age : supérieur à 30 ans
    salaire demandé : maximum 40 000€
    années d'expériences : minimum 5 ans
    3. Afficher un message pour chaque condition non respectée

     */
    public static void main(String[] args) {
        int age;
        int salaireDemande;
        int anneesExperience;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'âge du candidat : ");
        age = scanner.nextInt();

        System.out.print("Entrez le salaire demandé : ");
        salaireDemande = scanner.nextInt();

        System.out.print("Entrez le nombre d'années d'expérience : ");
        anneesExperience = scanner.nextInt();

        boolean isValable = true;

        if (age <= 30) {
            System.out.println("Le profil n'est pas valable : l'âge doit être supérieur à 30 ans");
            isValable = false;
        }

        if (salaireDemande > 40000) {
            System.out.println("Le profil n'est pas valable : le salaire demandé ne doit pas dépasser 40 000€");
            isValable = false;
        }

        if (anneesExperience < 5) {
            System.out.println("Le profil n'est pas valable : le candidat doit avoir au moins 5 ans d'expérience");
            isValable = false;
        }

        if (isValable) {
            System.out.println("Le profil est valable");
        }
    }
}
