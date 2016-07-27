/**
 * Created by pierr on 24/07/2016.
 */
public class Ville {
    //variables de classe
    public static int nbreInstances = 0;
    private static int nbreInstancesBis = 0;

    //Variables d'instance / attributs
    private String nomVille;
    private int nbreHabitants;
    private String nomPays;
    private char categorie;

    //controlleurs
    public Ville(){
        System.out.println("Création de la ville");
        nomVille = "Inconnu";
        nomPays = "Inconnue";
        nbreHabitants = 0;
        this.setCategorie();
        nbreInstances++;
        nbreInstancesBis++;
    }

    public Ville(String pNom, int pNbre, String pPays){
        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
        this.setCategorie();
    }

    //getter(asseceurs) / setter(mutateurs)

    public String getNom() {
        return nomVille;
    }

    public int getNombreHabitants() {
        return nbreHabitants;
    }

    public String getNomPays() {
        return nomPays;
    }
    public char getCategorie(){
        return categorie;
    }

    public static int getNbreInstancesBis() {
        return nbreInstancesBis;
    }

    public void setNom(String pNom) {
        this.nomVille = pNom;
    }

    public void setNombreHabitants(int nbre) {
        this.nbreHabitants = nbre;
        this.setCategorie();
    }

    public void setNomPays(String pPays) {
        this.nomPays = pPays;
    }


    //Méthodes d'instance
    private void setCategorie(){
        int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int i = 0;
        while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
            i++;
        this.categorie = categories[i];
    }

    public String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    }

    public String comparer(Ville v1){
        String str = new String();

        if (v1.getNombreHabitants() > this.nbreHabitants)
            str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
        else
            str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();
        return str;
    }
}
