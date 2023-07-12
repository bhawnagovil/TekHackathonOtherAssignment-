package Hackathon;
//WJP to display duplicate character in string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProgramToDisplayDuplicateCharacter18 {
    public static void findDuplicateCharacterInString(String str){
        Map<Character, Integer> map= new HashMap<>();
        char[] chararray= str.toCharArray();
        for(Character ch: chararray){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        Set<Character> set= map.keySet();
        for(Character c: set){
            if (map.get(c) > 1) {
                System.out.println(c + "  is " + map.get(c) + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.println("Duplicate characters in the string are");
        findDuplicateCharacterInString(input);
        scanner.close();


    }


}
