package Hackathon;

import java.util.Scanner;

//Write a method that will remove given character from the String?
public class MethodRemovingCharacterFromString16 {
    public static String removeParticularCharacterFromString(String s, char c){
        String strNew= s.replaceAll("c", "");// to remove particular character from string
        return strNew;
    }

    public static String removeParticularCharacterFromStringbyuserInput(String s, char c) {
        String strNewforuserinput = s.replaceAll(String.valueOf(c), ""); // to remove particular character from string
        return strNewforuserinput;
    }

    public static void main(String[] args) {
        String s1=  "abc ABC 123 abc";
        System.out.println("Current string is : "+ s1);
        System.out.println(removeParticularCharacterFromString(s1,'c'));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String givenstring = sc.nextLine();
        System.out.println("Enter the character you want to remove from the string");
        char c = sc.nextLine().charAt(0);
        System.out.println("removing the character from the string");
        System.out.println(removeParticularCharacterFromStringbyuserInput(givenstring, c));

    }
}
