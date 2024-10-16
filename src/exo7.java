public class exo7 {


    /*  EXERCICE 7 : Convertir des jours au format année | mois | jours , note on ne prendra pas en compte les années bixestiles */

    public static void main(String[] args) throws Exception {

        int totaldays = 855;
        int mounth ;
        int years ;
        int days ;

        years = totaldays/360;

        mounth = (totaldays/30 - (years * 12));

        days = (totaldays % 360)%30; 

        System.out.println(years +" ans, "+ mounth +" mois et "+days+" jour ");


    }

    
    /*  Résultat Attendu : 365 jour vaut : 1 année , 0 mois et 0 jour */

}
