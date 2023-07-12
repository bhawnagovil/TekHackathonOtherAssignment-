package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(100);
        hs. add("Sohan");
        hs.add("Tree");
        hs.add(101.3);
       Iterator itr= hs.iterator();
        System.out.println(hs.contains(100));
        System.out.println(hs);

       while(itr.hasNext()){
           System.out.println(itr.next());
       }


    }

}
