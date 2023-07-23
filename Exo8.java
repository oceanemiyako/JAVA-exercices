import java.util.Scanner;
/*
1. Définir une variable température
2. Affecter une valeur à la variable temperature
3. Selon la température, affiche l'état de l'eau :
SOLIDE : température inférieure à 0°C
LIQUIDE : température entre 0 et 100°C
GAZEUX : température supérieure à 100°C
 */

public class Exo8 {
    public static void main(String[] args) {
        double temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la température : ");
        temperature = scanner.nextDouble();

        if (temperature < 0) {
            System.out.println("L'état de l'eau est solide" + " " + temperature + "°c");

        } else if (temperature >= 0 && temperature <= 100) {
            System.out.println("L'état de l'eau est liquide" + " " + temperature + "°c");

        } else {
            System.out.println("L'état de l'eau est gazeux"+ " " + temperature + "°c");
        }
    }
}
