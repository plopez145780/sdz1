/**
 * Created by pierr on 02/08/2016.
 */
public class Chat extends Felin{
    public Chat(){

    }
    public Chat(String couleur, int poids){
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier() {
        System.out.println("Je miaule sur les toits !");
    }
}
