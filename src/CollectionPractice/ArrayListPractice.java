package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*ArrayListPractice a1 = new ArrayListPractice();
       // int[] a = {1, 2, 3, 4, 5};
        ArrayList A = new ArrayList();
        ArrayList A1 = new ArrayList();
        A1.add(100);
        A1.add(200);
        A1.add("Haa");

       // System.out.println(A1);
        /*ArrayList A3 = new ArrayList();
        A3.add(100);
        A3.add(200);
        A3.add(300);
        System.out.println(A3.get(2));
        //System.out.println(A1.removeAll(A3));
        System.out.println(A1);
        A3.set(1, 300);*/
        //System.out.println(A3);*/
        ArrayList<Integer>arl= new ArrayList<>();
        arl.add(1);
        arl.add(2);
        arl.add(3);
        arl.add(4);
        arl.add(5);
        arl.add(6);
     Iterator<Integer> it =   arl.iterator();
     while(it.hasNext()){
         System.out.println(it.next());
     }



       /* System.out.println(A1);//[100, 200, Haa, [100, 200]]
        System.out.println("??????????????????????????????????");
        Iterator itr= A1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }*/
    }
}
