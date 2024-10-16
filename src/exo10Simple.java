


public class exo10Simple {

        /*  EXERCICE 10 (Version original) : Créer un algorithme qui convertit n'importe qu'elle valeurs binaires en Hexadécimal */

        public static void main(String[] args) throws Exception {

         int bit0=1;
         int bit1=1;
         int bit2=1;
         int bit3=1;

         int bit4=1;
         int bit5=1;
         int bit6=1;
         int bit7=1;

         int decimal;

         decimal = bit0*1;
         decimal = bit1*2+decimal;
         decimal = bit2*4+decimal;
         decimal = bit3*8+decimal;
         decimal = bit4*16+decimal;
         decimal = bit5*32+decimal;
         decimal = bit6*64+decimal;
         decimal = bit7*128+decimal;
  
          String str = Integer.toHexString(decimal);
   
      System.out.println();
      System.out.println(decimal +" (binaire) vaut " + str + " en hexadecimal");
  
      //int length = String.valueOf(nb).length();
      //System.out.println(length);
        }

                    /*  Résultat Attendu : 1010 en binaire vaut A en Hexa */

}
