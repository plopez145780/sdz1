import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args){
		String prenom = new String();
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O'){
			System.out.println("Donnez voter prénom :");
			prenom = sc.nextLine();
			System.out.println("Bonjour" + prenom + ", comment vas tu ?");
			System.out.println("Voulez vous réessayer ? (O/N)");
			reponse = sc.nextLine().charAt(0);
		}
		System.out.println("Au revoir");
	}
}
