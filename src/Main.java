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
    }
}
