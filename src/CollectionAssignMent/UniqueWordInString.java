package CollectionAssignMent;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// java program to find all the unique word in the given string
public class UniqueWordInString {

    public void findUniquewordIntheGivenString(String str){
        HashSet<String> s= new HashSet<String>();
        String[] newstr= str.split("\\s+" );
        for(String s1: newstr){
            s.add(s1);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        UniqueWordInString uw= new UniqueWordInString();
        Scanner sc= new Scanner(System.in);
        String givenstr= sc.next();
        uw.findUniquewordIntheGivenString(givenstr);
        sc.close();
    }

}
