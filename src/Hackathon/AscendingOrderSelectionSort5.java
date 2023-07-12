package Hackathon;
//WJP to perform ascending order Selection  sort

import java.util.*;

public class AscendingOrderSelectionSort5 {

public static void performAscendingOrderSelection(Integer[]array){
    List<Integer> converarraycollection = Arrays.asList(array);
    Collections.sort(converarraycollection);
    System.out.println("Sorted array elements are :");
    System.out.println(" here is the sorted array");
    for(Integer var : converarraycollection)
        System.out.println(var);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the integer array");
        int size = sc.nextInt();
        Integer[] givenarray = new Integer [size];
        for (int i = 0; i < size; i++) {
            givenarray[i] = sc.nextInt();
        }
        performAscendingOrderSelection(givenarray);
        sc.close();

    }
}
