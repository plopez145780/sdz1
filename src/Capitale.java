/**
 * Created by pierr on 27/07/2016.
 */
public class Capitale extends Ville {

    //Atribut / variable d'instance
    private String monument;

    //constructeur par défaut
    public Capitale(){
        //mot clé appelant le constructeur de la classe mère
        super();
        monument = "aucun";
    }

    //méthodes de classe
    public String decrisToi(){
        String str = super.decrisToi() + "\n \t ==>" + this.monument + "en est un monument";
        System.out.println("Invocation de super.decrisToi()");
        return str;
    }
}
