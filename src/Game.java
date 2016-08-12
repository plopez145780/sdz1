import java.io.Serializable;

public class Game implements Serializable{
    private String nom;
    private String style;
    private double prix;
    private transient Notice notice;

    public Game(String nom, String style, double prix){
        this.nom = nom;
        this.style = style;
        this.prix = prix;
        this.notice = new Notice();
    }

    public String toString(){
        return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu : " + this.prix + this.notice + "\n";
    }
}
