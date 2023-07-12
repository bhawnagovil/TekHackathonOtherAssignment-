package Day3Assinments;

import java.util.Scanner;

public class FindIndexOfGivenCharcater {
    public void findchAtgivenLoaction(char ch){
        String s= " ";
        int index= s.indexOf(ch);

    }
    public static void main(String[] args) {
         String s= "Hapur";
        System.out.println("finding index of the characters");
        int index= s.indexOf('H');
        System.out.println(index);
        System.out.println(s.charAt(3));// finding the character at the given location
        String s2= s.substring( 1, 3);
        System.out.println(s2);// getting a substring from string
        System.out.println(s.contains(s2));// finding if the particular substring is present in the given string or not


    }
}
