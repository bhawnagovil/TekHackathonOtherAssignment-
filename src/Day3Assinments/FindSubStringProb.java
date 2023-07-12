package Day3Assinments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubStringProb {

        public void findSubString(String s){
         int i= 0; int j=0;
         for(i=0; i<s.length(); i++ ){
            for( j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j) );
            }
        }
    }
    public static void findSubstringWithoutRepetition(String str) {
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (hasUniqueCharacters(substring)) {
                    substrings.add(substring);
                }
            }
        }

        System.out.println("Substrings without repetition:");
        for (String substring : substrings) {
            System.out.println(substring);
        }

    }

    public static boolean hasUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (uniqueChars.contains(ch)) {
                return false;
            }
            uniqueChars.add(ch);
        }

        return true;
    }


    public static void main(String[] args) {
        FindSubStringProb find= new FindSubStringProb();
        String s= "Happy"; // repeating the substring
        // find.findSubString(s);
        find.findSubstringWithoutRepetition(s);
    }
}
