import com.sdz.comportement.*;
/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
    public static void main(String[] args){
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

        for(int i = 0; i < tPers.length; i++){
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();
        }

        System.out.println("*****************************************");
        System.out.println("*****************************************");
        Personnage pers = new Guerrier();
        pers.soigner();
        pers.setSoin(new Operation());
        pers.soigner();
    }
}
