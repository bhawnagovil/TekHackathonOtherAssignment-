package CollectionAssignMent;
// java program to find the highest frequency character in the string
import java.util.HashMap;
import java.util.Scanner;

public class HighhestFrequencyCharacterD {
    public HashMap<Character, Integer>findHighestFrequencyCharacter(String str){
        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0; i<str.length(); i++ ){
            char ch= str.charAt(i);
            if(hm.containsKey(ch)) {
                int oldfrequency= hm.get(ch);
                int newFrequency= oldfrequency+1;
                hm.put(ch, newFrequency);
            }else{
                hm.put(ch,1);

            }

             }
          return hm;
            }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        HighhestFrequencyCharacterD hf= new HighhestFrequencyCharacterD();
        System.out.println(hf.findHighestFrequencyCharacter(str));


    }

}
