import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by pierr on 11/08/2016.
 */
public class Test {
    public static void main(String[] args){
        List l = new LinkedList();
        l.add(12);
        l.add("toto !");
        l.add(12.20f);

        for(int i = 0 ; i < l.size() ; i++) {
            System.out.println("Element a l'index " + i + " = " + l.get(i));
        }

        System.out.println("\n\tParcours avec un itérateur");
        System.out.println("------------------------------");
        ListIterator li = l.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("\n--------- Array List ----------\n");
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Une chaine de caracteres");
        al.add(12.20f);
        al.add('d');

        for(int i = 0 ; i < al.size() ; i++){
            System.out.println("donnée a l'index " + i + " = " + al.get(i));
        }

        System.out.println("\n--------- HashTable ----------\n");
        Hashtable ht = new Hashtable();
        ht.put(1, "printemps");
        ht.put(10, "été");
        ht.put(12, "automne");
        ht.put(45, "hiver");
        Enumeration e = ht.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println("\n--------- HashSet ----------\n");
        HashSet hs = new HashSet();
        hs.add("toto");
        hs.add(12);
        hs.add('d');

        Iterator it = hs.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("\nParcours avec un tableau d'objet");
        System.out.println("-----------------------------------");

        Object[] obj = hs.toArray();
        for (Object o : obj)
            System.out.println(o);
    }
}
