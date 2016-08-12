import java.io.File;

/**
 * Created by pierr on 11/08/2016.
 */
public class Main {
    public static void main(String[] args){

        File f = new File("IO/test.txt");

        System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Est-ce qu'il existe ? " + f.exists());
        System.out.println("Est-ce un répertoire ? " + f.isDirectory());
        System.out.println("Est-ce un fichier ? " + f.isFile());

        System.out.println("Affichage des lecteurs a la racine du PC : ");
        for(File file : f.listRoots()){
            System.out.println(file.getAbsolutePath());
            try{
                int i = 1;
                for (File nom : file.listFiles()){
                    System.out.println("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));

                    if((i%4) == 0){
                        System.out.print("\n");
                    }
                    i++;
                }
                System.out.println("\n");
            }
            catch(NullPointerException e){

            }
        }
    }
}
