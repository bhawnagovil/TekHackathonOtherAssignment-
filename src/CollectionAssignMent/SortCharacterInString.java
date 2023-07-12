package CollectionAssignMent;

import java.util.TreeSet;

// java program to sort the characters in the string
public class SortCharacterInString {
    public void SortCharacterInString(String str) {
        TreeSet<Character> ts = new TreeSet<Character>();
        char[] c = str.toCharArray();
        for (char c1 : c) {
            ts.add(c1);
        }
        System.out.println(ts);
    }


    public static void main(String[] args) {
        SortCharacterInString sr= new SortCharacterInString();
        sr.SortCharacterInString("Hary");
    }

}
