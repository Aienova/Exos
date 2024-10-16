public class exo9 {


    /*  EXERCICE 9 (Version original): Créer un algorithme qui convertit n'importe qu'elle valeurs décimal (entier) en binaire */

    public static void main(String[] args) throws Exception {


        int decimal = 3;
        int left;
        String binary="";
        int div;


        System.out.println("******************EXO 9**************************");


        while(decimal>0){

            div = decimal/2;
            left = decimal - (div*2);
            binary = left + binary;
            decimal = div;

        }  

        System.out.println("valeur en binaire :"+binary);




    }

            /*  Résultat Attendu : 1 en décimal vaut 0001 en binaire */
}
