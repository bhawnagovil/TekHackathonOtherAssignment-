package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

//Write a program for binary search. And 5 i/p has to take from user as binary elements.
public class BinarySearchProgram25 {

    public static int performBinarySearch(int[]array,int targetsearch){
        int li=0; int hi=array.length-1;  int mi= li+hi/2;
        while(li<=hi){
            mi= (li+hi)/2;
            if(array[mi]==targetsearch){
                return mi;
            }
            else if(array[mi]<targetsearch){
                li=mi+1;
            }
            else if(array[mi]>targetsearch){
                hi= mi-1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] binaryArray = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 binary elements:");
        for (int i = 0; i < 5; i++) {
            binaryArray[i] = sc.nextInt();
        }
        Arrays.sort(binaryArray); // Sort the array in ascending order

        System.out.print("Enter the binary element to search: ");
        int searchElement = sc.nextInt();
       int index= performBinarySearch(binaryArray,searchElement);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();


    }
}
