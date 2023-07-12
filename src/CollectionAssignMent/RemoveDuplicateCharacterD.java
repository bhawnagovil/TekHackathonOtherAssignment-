package CollectionAssignMent;
// Java program to print all the unique character in the given string
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacterD {

    public String RemoveDuplicatecaharacterfromGivenString(String str){
         String result = " ";
        Set<Character> set= new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char c= str.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
             result= sb.toString();


            }
          return result;
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        RemoveDuplicateCharacterD rd= new RemoveDuplicateCharacterD();
        String s= sc.next();
        System.out.println(rd.RemoveDuplicatecaharacterfromGivenString(s));
        sc.close();

    }
}
