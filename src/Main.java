import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        System.out.println("Chemin absolu du fichier : " + path.toAbsolutePath());
        System.out.println("Est-ce qu'il existe ? " + Files.exists(path));
        System.out.println("Nom du fichier : " + path.getFileName());
        System.out.println("Est-ce un répertoire ? " + Files.isDirectory(path));

        //On récupère maintenant la liste des répertoires dans une collection typée
        //Via l'objet FileSystem qui représente le système de fichier de l'OS hébergeant la JVM
        Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

        //Maintenant, il ne nous reste plus qu'à parcourir
        for(Path chemin : roots) {
            System.out.println(chemin);
            //Pour lister un répertoire, il faut utiliser l'objet DirectoryStream
            //L'objet Files permet de créer ce type d'objet afin de pouvoir l'utiliser
            try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin, "*.txt")){
                int i = 0;
                for (Path nom : listing){
                    System.out.println("\t\t" + ((Files.isDirectory(nom)) ? nom + "/" : nom));
                    i++;
                    if(i%4 == 4)
                        System.out.println("\n");
                }
            } catch (IOException e){
                e.printStackTrace();
            }

            Path source = Paths.get("test.txt");
            Path cible = Paths.get("test2.txt");
            try {
                Files.copy(source, cible, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) { e.printStackTrace();	}



            source = Paths.get("test2.txt");
            cible = Paths.get("test3.txt");
            try {
                Files.move(source, cible, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) { e.printStackTrace();  }


        }
    }
}