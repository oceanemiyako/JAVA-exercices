public class Exo12 {
    /*
    1. Créer un programme permettant d'afficher les tables de
    multiplications de 1 à 10
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Table de multiplication de " + i + " :");
            for (int j = 1; j <= 10; j++) {
                int resultat = i * j;
                System.out.println(i + " x " + j + " = " + resultat);
            }
            System.out.println(" ");
        }
    }
}
