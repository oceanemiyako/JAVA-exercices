public class Exo13 {
    /*
    1. L'accroissement de la population de Tourcoing est de 0.89%
    2. En 2015 la ville comptait 96809 habitants
    3. Combien d'années faut-il pour atteindre 120 000 habitants ?
    4. Combien d'habitants y aura-t-il cette année-là ?
    5. Écrire un programme permettant de résoudre ce problème
     */
    public static void main(String[] args) {

        double tauxAccroissement = 0.89 / 100;
        int populationInitiale = 96809;
        int populationCible = 120000;
        int annee = 2015;


        int nombreAnnees = 0;
        int populationActuelle = populationInitiale;
        while (populationActuelle < populationCible) {
            populationActuelle += (int) (populationActuelle * tauxAccroissement);
            nombreAnnees++;
        }

        int populationFuture = populationInitiale;
        for (int i = 1; i <= nombreAnnees; i++) {
            populationFuture += (int) (populationFuture * tauxAccroissement);
        }


        System.out.println("Il faudra " + nombreAnnees + " années pour atteindre une population de " + populationCible + " habitants.");
        System.out.println("En " + (annee + nombreAnnees) + ", la population estimée sera de " + populationFuture + " habitants.");

    }
}
