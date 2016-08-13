import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String nom = Paire.class.getName();
        try{
            Class cl = Class.forName(nom);
            Object o = cl.newInstance();

            Class[] types = new Class[]{String.class, String.class};
            Constructor ct = cl.getConstructor(types);

            Object o2 = ct.newInstance(new String[]{"valeur 1", "valeur 2"});

            Method m = cl.getMethod("toString", null);

            System.out.println("----------------------------------------");
            System.out.println("Méthode " + m.getName() + " sur o2: " +m.invoke(o2, null));
            System.out.println("Méthode " + m.getName() + " sur o: " +m.invoke(o, null));


        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}