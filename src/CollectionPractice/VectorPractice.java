package CollectionPractice;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add(1);
        v.add(2);
        v.add("Deepak");
        v.add(15.3);
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }




}
