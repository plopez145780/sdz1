import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {

            Ville v = null;
            try {
                    v = new Ville("Re", 12000, "France");
            }
            //Gestion de plusieurs exceptions différentes
            catch (NombreHabitantException | NomVilleException e2){
                System.out.println(e2.getMessage());
            }
            finally{
                if(v == null)
                    v = new Ville();
            }
            System.out.println(v.decrisToi());

    }
}
