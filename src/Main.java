import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args){
        double temperatureEntree = 0;
        double temperatureSortie = 0;
        char choix = ' ';
        char quitter = ' ';
        Scanner sc = new Scanner(System.in);

		System.out.println("CONVERTISSEUR DEGRES CELCIUS ET DEGRES FAHRENHEIT");
        System.out.println("-------------------------------------------------");

        do {


            do {
                System.out.println("Choisissez le mode de conversion :");
                System.out.println("1- Conversion Celsius - Fahrenheit");
                System.out.println("2- Conversion Fahrenheit - Celsius");
                choix = sc.nextLine().charAt(0);

            } while (choix != '1' && choix != '2');

            System.out.println("Température a convertir : ");
            temperatureEntree = sc.nextDouble();
            sc.nextLine();

            if (choix == 1) {
                temperatureSortie = ((9 / 5) * temperatureEntree) + 32;
                temperatureSortie = arrondi(temperatureSortie, 2);
                System.out.println(temperatureEntree + "°C correspond à : " + temperatureSortie + "°F");
            } else {
                temperatureSortie = ((temperatureEntree - 32) * 5) / 9;
                temperatureSortie = arrondi(temperatureSortie, 2);
                System.out.println(temperatureEntree + "°F correspond à : " + temperatureSortie + "°C");
            }

            do {
                System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
                quitter = sc.nextLine().charAt(0);
            } while (quitter != 'N' && quitter != 'O');



        } while (quitter != 'N');
	}

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
