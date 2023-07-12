package CollectionAssignMent;
//Store 5 integer values in the linkedlist and remove duplicates if exists

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListElementwithoutredundancy {
public void removingDuplicateElementFromlinkedList(){
    LinkedList<Integer> list= new LinkedList();
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<5; i++){
        Integer i1 = sc.nextInt();
        list.add(i1);
    }
    HashSet<Integer>hs= new HashSet<>(list);
    list.clear();
    list.addAll(hs);
    System.out.println("Printing all the element of list after removing the duplicate value");
    for(Integer i: hs){
        System.out.println(i);
    }
}

    public static void main(String[] args) {
        LinkedListElementwithoutredundancy ls= new LinkedListElementwithoutredundancy();
        ls.removingDuplicateElementFromlinkedList();
    }
}
