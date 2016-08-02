/**
 * Created by pierr on 05/07/2016.
 */
public class Main {
	public static void main(String[] args) {
        Animal l = new Chien("Gris bleu", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());

        System.out.println("--------------------------------------------");
        //Les méthodes d'un chien
        Chien c = new Chien("Gris bleuté", 20);
        c.boire();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());

        System.out.println("--------------------------------------------");
        //Les méthodes de l'interface
        c.faireCalin();
        c.faireLeBeau();
        c.faireLechouille();

        System.out.println("--------------------------------------------");
        //Utilisons le polymorphisme de notre interface
        Rintintin r = new Chien();
        r.faireLeBeau();
        r.faireCalin();
        r.faireLechouille();
    }
}
