package CollectionAssignMent;

import java.util.HashSet;

public class UniqueWord1D {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        String[] words = str.split("\\s+");
        HashSet<String> set = new HashSet<String>();
        for (String word : words) {
            set.add(word);
        }
        System.out.println(set);
    }
    }

