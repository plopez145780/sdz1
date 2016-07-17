import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("Saisir 1 caractère");
        Scanner sc = new Scanner(System.in);
        char saisie = sc.nextLine().charAt(0);
        boolean absent = true;
        for (char caractere:tableauCaractere) {
            if(caractere == saisie){
                System.out.println("le caractère : " + saisie + " est dans le tableau");
                absent = false;
                break;
            }
        }

        if(absent){
            System.out.println("le caractère : " + saisie + " n'est pas dans le tableau");
        }



    }
}
