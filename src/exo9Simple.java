public class exo9Simple {


    /*  EXERCICE 9 (Version original): Créer un algorithme qui convertit n'importe qu'elle valeurs décimal (entier) en binaire */

    public static void main(String[] args) throws Exception {


        int base = 256;
        int quotient = base/2;
        int R0 = base % 2;
        
        // Faire toujours attention à l'ordre dans lequel, le programme reprend les valeurs 
        // quand on veut réutiliser une variable, ne pas mettre "int" devant 

        int R1 = quotient % 2;
        quotient = quotient/2;
        
        int R2 = quotient % 2;
        quotient = quotient/2;
        
        int R3 = quotient % 2;
        quotient = quotient/2;
        
        int R4 = quotient % 2;
        quotient = quotient/2;

        int R5 = quotient % 2;
        quotient = quotient/2;
        
        int R6= quotient % 2;
        quotient = quotient/2;
        
        int R7 = quotient % 2;
        quotient = quotient/2;
        

    System.out.println(base + " vaut en binaire " + R7 + R6 + R5 + R4 + R3 + R2 + R1 + R0);



    }

            /*  Résultat Attendu : 1 en décimal vaut 0001 en binaire */
}
