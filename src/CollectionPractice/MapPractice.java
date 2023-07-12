package CollectionPractice;

import java.util.HashMap;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        HashMap m= new HashMap();
        m.put(1, "Ram");
        m.put(2, "Shyam");
        System.out.println(m);
        Set s  =   m.entrySet();
        System.out.println(s);


    }


}
