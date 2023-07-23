import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        int annee;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'année : ");
        annee = scanner.nextInt();

        if (isAnneeBissextile(annee)) {
            System.out.println( annee + " est une année bissextile.");
        } else {
            System.out.println( annee + " n'est pas une année bissextile.");
        }

    }
    public static boolean isAnneeBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
}
