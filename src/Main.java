import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File f = null;
        try{
            // fis va lire le fichier
            // fos va écrire dans le nouveau !
            f = new File("IO/test.txt");
            fis = new FileInputStream(f);
            fos = new FileOutputStream(new File("IO/test2.txt"));

            byte[] buf = new byte[8];

            int n = 0;

            while((n = fis.read(buf)) >= 0){
                fos.write(buf);

                for (byte bit : buf){
                    System.out.print("\t" + bit + "(" + (char)bit + ")");
                }
                System.out.println("");

                buf = new byte[8];
            }
            System.out.println("Copie terminée !");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

            try{
                if(fos != null){
                    fos.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
