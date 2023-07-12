package Hackathon;

import java.util.*;

//Question-Given a string print the unique words of the string.
public class UniqueWordsOfString15 {
    public static void printUniqueWords(String str){
        String[] wordsarray= str.split(" ");
        List<String> converarraycollection = Arrays.asList(wordsarray);
        Set<String> set= new HashSet<>(converarraycollection);
        System.out.println(set);
    }

    public static void main(String[] args) {
        String givenstring= "Hello Hello There";
        printUniqueWords(givenstring);

    }
}
