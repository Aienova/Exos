public class exo5 {
    public static void main(String[] args) throws Exception {

        /*Déclaration des variables Prix et réduction */

        double price = 150.23;

        int reduction = 20;

        double result = price - (price * reduction / 100); /* Calcule du résultat */
        result =Math.round(result*100.0) / 100.0; /* Arrondie du résultat après la virgule */
        System.out.println("*--------------------Reduction en cours----------------------------*/");
        System.out.println("réduction de "+reduction+"% pour le prix de "+price+"euros vaut "+result+"€");
        System.out.println("*--------------------Reduction du terminé----------------------------*/");
    }
}
