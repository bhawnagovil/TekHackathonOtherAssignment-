package Hackathon;

import java.util.Scanner;

//Q4.Given an array of integers check the Palindrome of the series.
public class CheckPalindromeOfIntegerArray4 {
    public static boolean IfIntegerArrayMakePalindrome(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the integer array");
        int size = sc.nextInt();
        int[] givenarray = new int[size];
        for (int i = 0; i < size; i++) {
            givenarray[i] = sc.nextInt();
        }
       boolean isPalindrome = IfIntegerArrayMakePalindrome(givenarray) ;
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
        sc.close();

    }
}

