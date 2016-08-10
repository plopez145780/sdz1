/**
 * Description :
 * Date : 09/08/2016
 *
 * @author pierr
 * @version 1.0
 */
public class Main {
    public static void main(String args[]){
        for(Langage lang : Langage.values()){
            if(Langage.JAVA.equals(lang))
                System.out.println("J'aime le : " + lang);
            else
                System.out.println(lang);
        }
    }
}
