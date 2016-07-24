import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {
        String c1 = "COUCOU 1234";
        String c2 = c1.toLowerCase();
        System.out.println(c2);

        System.out.println(c2.toUpperCase());

        System.out.println(c1.length());

        String coucou = new String("coucou");
        String toutou = new String("toutou");
        System.out.println(coucou.equals(toutou));
        System.out.println(!coucou.equals(toutou));

        String str = "0123456789";
        System.out.println(str.charAt(2));

        String chaine = new String("la paix niche");
        String chaine2 = chaine.substring(3,13);
        System.out.println(chaine2);
        //Permet d'extraire "paix niche"

        String mot = new String("anticonstitutionnellement");
        System.out.println(mot.indexOf("ti"));

        double rand = Math.random();
        double sin = Math.sin(120);
        double cos = Math.cos(120);
        double tan = Math.tan(120);
        double abs = Math.abs(-125.02);
        double exp = Math.pow(2,2);

        String[] tableau_a_lire = {"azerty", "qwerty", "clavier", "souris"};
        lireTableau(tableau_a_lire);
        System.out.println(toString(tableau_a_lire));

    }

    public static double arrondi(double a, double b){
        return (double) ((int)(a*Math.pow(10,b)+0.5) / Math.pow(10,b));
    }

    public static void lireTableau(String[] tableau){
        for(String case_t : tableau){
            System.out.println(case_t);
        }
    }

    public static void lireTableau(int[] tableau){
        for(int case_t : tableau){
            System.out.println(case_t);
        }
    }

    public static void lireTableau(String[][] tableau){
        for(String[] case_t : tableau) {
            for (String case_t2 : case_t) {
                System.out.println(case_t2);
            }
        }
    }

    static String toString(String[] tab) {
        System.out.println("Méthode toString() !\n----------");
        String retour = "";
        for(String str : tab)
            retour += str + "\n";
        return retour;
    }


}
