import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {
        Ville ville = new Ville();

        System.out.println(ville.nomVille);
        ville.nomVille = "la tête a toto";
        System.out.println(ville.nomVille);

        Ville ville2 = new Ville("Marseille", 123456, "France");

        ville2.nomPays = "la tête a tutu";
        System.out.println(ville2.nomPays);

    }
}
