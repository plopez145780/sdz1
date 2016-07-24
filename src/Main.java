import java.util.Scanner;

/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {
        Ville v = new Ville();
        Ville v1 = new Ville("Marseille", 123456, "France");
        Ville v2 = new Ville("Rio", 56789, "Brésil");

        System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        /*
          Nous allons interchanger les Villes v1 et v2
          tout ça par l'intermédiaire d'un autre objet Ville.
        */
        Ville temp = new Ville();

        temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        /*
          Nous allons maintenant interchanger leurs noms
          cette fois par le biais de leurs mutateurs.
        */

        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");

        System.out.println(" v1 = " + v1.getNom() + " ville de  " + v1.getNombreHabitants() + " habituant se situant en " + v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        //-----------------------------

        Ville v00 = new Ville();
        Ville v01 = new Ville("Marseille", 1236, "France");
        Ville v02 = new Ville("Rio", 321654, "Brésil");

        System.out.println("\n\n"+v01.decrisToi());
        System.out.println(v00.decrisToi());
        System.out.println(v02.decrisToi()+"\n\n");
        System.out.println(v01.comparer(v02));
    }
}
