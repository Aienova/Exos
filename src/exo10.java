


public class exo10 {

        /*  EXERCICE 10 (Version original) : Créer un algorithme qui convertit n'importe qu'elle valeurs binaires en Hexadécimal */

        public static void main(String[] args) throws Exception {


          String binary = "1111";
          int length = binary.length();
          String bit;
          int bitnumber;
          double decimal = 0;
          double totalbit = length;
          int result;


          while (length>0) { 

            bit = binary.substring(length-1,length);

            bitnumber = Integer.parseInt(bit);

            double puissance = (Math.pow(2,totalbit - length ));

            decimal = decimal + (bitnumber*puissance);

            length--;


          }

          result =(int)decimal;

          System.out.println("La valeur décimal:"+decimal);

          

          
          System.out.println("La valeur en Hexa:"+Integer.toHexString(result));




        }

                    /*  Résultat Attendu : 1010 en binaire vaut A en Hexa */

}
