package Hackathon;

import java.util.Scanner;

public class AscendingOrderSelectionSortA {

    public static void selectionSort(int[]array){
        for(int i=0; i<array.length-1; i++ ){
            int minindex=i;
            for(int j=0; j<array.length; j++){
                if(array[minindex]>array[j]){
                    minindex= j;
                }
                int temp = array[minindex];
                array[minindex] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Array after sorting the element");
        for(int i: array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the integer array");
        int size = sc.nextInt();
        int [] givenarray = new int [size];
        for (int i = 0; i < size; i++) {
            givenarray[i] = sc.nextInt();
        }
        selectionSort(givenarray);
        sc.close();


    }


}
