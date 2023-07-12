package Hackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//WJP to display number of occurrence of all character
public class DisplayNumberOfOccurrencesOfAllCharacter19 {
    public static Map<Character, Integer> findNumberOfOccurrencesOfAllCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chararray = str.toCharArray();
        for (Character ch : chararray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String givenstring = sc.nextLine();
        Map<Character,Integer> map= findNumberOfOccurrencesOfAllCharacter(givenstring);
        for (Character c : map.keySet()) {
            System.out.println(c + "  is " + map.get(c) + " times");
        }
        sc.close();

    }

}
