package Day3Assinments;

import java.util.Scanner;

public class ComparingString {
    public static void compareStringWithignoringCase(String s1, String s2) {
        boolean eic = s1.equalsIgnoreCase(s2);
        if (eic) {
            System.out.println("Both strings are same");
        } else {
            System.out.println("Both atrings are different");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String firstString= sc.next();
        System.out.print("Enter Second string: ");
        String secondString= sc.next();
        compareStringWithignoringCase(firstString,secondString);
    }
}
