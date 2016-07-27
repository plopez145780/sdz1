import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {
        Ville[] tableau = new Ville[6];

        String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
        int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

        for(int i = 0; i < 6; i++){
            if (i <3){
                Ville V = new Ville(tab[i], tab2[i], "france");
                tableau[i] = V;
            }
            else{
                Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
                tableau[i] = C;
            }
        }

        for(Object obj : tableau){
            System.out.println(obj.toString()+"\n");
        }
    }
}
