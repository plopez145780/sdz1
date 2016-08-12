import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try{
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File("game.txt"))));

            oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
            oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
            oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
            oos.close();

            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File("game.txt"))));

            try{
                System.out.println("Affichage des jeux :");
                System.out.println("*************************\n");
                System.out.println(((Game)ois.readObject()).toString());
                System.out.println(((Game)ois.readObject()).toString());
                System.out.println(((Game)ois.readObject()).toString());
            }
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            ois.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

            try{
                if(oos != null){
                    oos.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
