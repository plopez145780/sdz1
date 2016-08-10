/**
 * Description :
 * Date : 09/08/2016
 *
 * @author pierr
 * @version 1.0
 */
public class AvantEnumeration {
    public static final int PARAM1 = 1;
    public static final int PARAM2 = 2;

    public void fait(int param){
        if(param == PARAM1){
            System.out.println("Fait à la façon 1");
        }
        else if(param == PARAM2){
            System.out.println("Fait à la façon 2");
        }
    }

    public static void main(String[] args){
        AvantEnumeration ae = new AvantEnumeration();
        ae.fait(AvantEnumeration.PARAM1);
        ae.fait(AvantEnumeration.PARAM2);
        ae.fait(4);

    }
}
