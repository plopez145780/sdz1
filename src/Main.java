import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        CharArrayWriter caw = new CharArrayWriter();
        CharArrayReader car = null;

        try{
            caw.write("Coucou les zéros");
            System.out.println(caw);
            caw.close();

            car = new CharArrayReader(caw.toCharArray());
            int i;
            String str = "";

            while((i = car.read()) != -1){
                str += (char)i;
            }
            System.out.println(str);
        }
        catch(IOException e){
            e.printStackTrace();
        }




        StringWriter sw = new StringWriter();
        StringReader sr;

        try {
            sw.write("Coucou les Zéros");
            //Appel à la méthode toString de notre objet de manière tacite
            System.out.println(sw);

            //caw.close() n'a aucun effet sur le flux
            //Seul caw.reset() peut tout effacer
            sw.close();

            //On passe un tableau de caractères à l'objet qui va lire le tampon
            sr = new StringReader(sw.toString());
            int i ;
            //On remet tous les caractères lus dans un String
            String str = "";
            while(( i = sr.read()) != -1)
                str += (char) i;

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
