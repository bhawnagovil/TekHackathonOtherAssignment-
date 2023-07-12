package CollectionAssignMent;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortedIntegerLInkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        // Take 5 integer inputs from the user and add them to the list
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("Unsorted List");
         for(Integer l: list){
             System.out.println(l);

         }
        System.out.println("sorting in the ascending order");
        {
            Collections.sort(list);
        }
        System.out.println("Sorted List");{
            for(Integer l1: list)
                System.out.println(l1);
        }


    }

}
