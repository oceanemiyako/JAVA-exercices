import java.util.Scanner;

public class Exo15 {

    /*
    1. Créer une variable stockant le nombre de notes à saisir
    2. Afficher la note la plus haute
    3. Afficher la note la plus basse
    4. Afficher la moyenne des notes
    5. /!\ la note doit être comprise entre 0 et 20
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreNotes;

        System.out.print("Saisir note ");
        nombreNotes = scanner.nextInt();


        while (nombreNotes <= 0) {
            System.out.println("Le nombre de notes doit être positif !");
            System.out.print("Combien de notes voulez-vous saisir ? ");
            nombreNotes = scanner.nextInt();
        }

        int note;
        int sommeNotes = 0;
        int noteMin = 20;
        int noteMax = 0;

        for (int i = 1; i <= nombreNotes; i++) {
            do {
                System.out.print("Saisissez la note " + i + " (entre 0 et 20) : ");
                note = scanner.nextInt();
            } while (note < 0 || note > 20);

            sommeNotes += note;
            if (note < noteMin) {
                noteMin = note;
            }
            if (note > noteMax) {
                noteMax = note;
            }
        }

        double moyenne = (double) sommeNotes / nombreNotes;

        System.out.println("La note la plus basse est : " + noteMin);
        System.out.println("La note la plus haute est : " + noteMax);
        System.out.println("La moyenne des notes est : " + moyenne);
    }
}
