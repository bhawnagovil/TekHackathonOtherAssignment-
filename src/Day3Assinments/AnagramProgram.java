package Day3Assinments;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
    public boolean  ifAnagram(String firstString, String secondString) {
        firstString = firstString.replaceAll("\\s", "").toLowerCase();
        secondString = secondString.replaceAll("\\s", "").toLowerCase();
        boolean status = true;
        if (firstString.length() != secondString.length()) {
            status = false;
        } else {
            char[] firstone = firstString.toCharArray();
            char[] secondone = secondString.toCharArray();
            Arrays.sort(firstone);
            Arrays.sort(secondone);
            status = Arrays.equals(firstone, secondone);

        }
        return status;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = sc.next();
        System.out.println("Enter the second String");
        String secondString = sc.next();
        AnagramProgram pr= new AnagramProgram();
        boolean status= true;
        pr.ifAnagram(firstString, secondString);
        if (status) {
            System.out.println(" two strings are anagram of each other");

        } else {
            System.out.println(" two strings are not anagram of each other");
        }
    }
}
