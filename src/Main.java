import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String str = new String("Bonjour");

        Class c = String.class;
        Class c2 = new String().getClass();

        System.out.println("La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());
        System.out.println("La superclasse de la classe " + Object.class.getName() + " est : " + String.class.getSuperclass());

        String str1 = new String();
        Class c3 = str1.getClass();
        //Class c3 = String.class; est équivalent

        Class[] faces = c3.getInterfaces();

        System.out.println("Il y a " + faces.length + " interfaces implémentées");
        for (Class face : faces) {
            System.out.println(face);
        }


        Class c4 = String.class;
        Method[] m = c4.getMethods();
        System.out.println("Il y a " + m.length + " méthodes dans cette classe");
        //On parcourt le tableau de méthodes
        for(int i = 0; i < m.length; i++)
            System.out.println(m[i]);




        Class c5 = new String().getClass();
        Method[] m2 = c.getMethods();

        System.out.println("Il y a " + m2.length + " méthodes dans cette classe");
        //On parcourt le tableau de méthodes
        for(int i = 0; i < m2.length; i++)
        {
            System.out.println(m2[i]);

            Class[] p = m2[i].getParameterTypes();
            for(int j = 0; j < p.length; j++)
                System.out.println(p[j].getName());

            System.out.println("----------------------------------\n");
        }




        Class c6 = String.class;
        Field[] f = c6.getDeclaredFields();
        System.out.println("Il y a " + f.length + " champs dans cette classe");
        for(int i = 0; i < f.length; i++)
            System.out.println(f[i].getName());



        Class c7 = new String().getClass();
        Constructor[] construc = c7.getConstructors();
        System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
        //On parcourt le tableau des constructeurs
        for(int i = 0; i < construc.length; i++){
            System.out.println(construc[i].getName());

            Class[] param = construc[i].getParameterTypes();
            for(int j = 0; j < param.length; j++)
                System.out.println(param[j]);

            System.out.println("-----------------------------\n");
        }



    }
}