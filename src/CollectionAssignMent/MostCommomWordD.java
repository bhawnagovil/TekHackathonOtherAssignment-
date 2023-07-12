package CollectionAssignMent;

import java.util.HashMap;
import java.util.Map;

public class MostCommomWordD {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog the the";
        String[] words = str.split("\\s+");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        String mostCommon = null;
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                mostCommon = entry.getKey();
                count = entry.getValue();
            }
        }
        System.out.println("The most common word is \"" + mostCommon + "\" with a count of " + count);
    }
}
