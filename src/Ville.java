/**
 * Created by pierr on 24/07/2016.
 */
public class Ville {
    //Variables d'instance / attributs
    private String nomVille;
    private int nbreHabitants;
    private String nomPays;

    //controlleurs
    public Ville(){
        System.out.println("Création de la ville");
        nomVille = "Inconnu";
        nomPays = "Inconnue";
        nbreHabitants = 0;
    }

    public Ville(String pNom, int pNbre, String pPays){
        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
    }

    //getter(asseceurs) / setter(mutateurs)

    public String getNomVille() {
        return nomVille;
    }

    public int getNbreHabitants() {
        return nbreHabitants;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public void setNbreHabitants(int nbreHabitants) {
        this.nbreHabitants = nbreHabitants;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
}
