public class exo6 {



    /*  EXERCICE 6 : Créer un convertisseur de secondes au format Heures : Minutes : secondes */

    public static void main(String[] args) throws Exception {

        int totalsecondes = 59;
        int minutes ;
        int hours ;
        int secondes ;

        hours = totalsecondes/3600;

        minutes = totalsecondes/60 - (hours * 60);

        secondes = (totalsecondes%60);

        System.out.println(hours +" heures, "+minutes+" minutes, "+secondes+" secondes, ");



    }

    /*  Résultat Attendu : 60 secondes vaut : 0 heure : 1 minute : 0 seconde */


}
