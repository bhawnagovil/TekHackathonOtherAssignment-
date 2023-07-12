package Day3Assinments;

import java.util.Scanner;

public class CheckWheterherSubStringPresent {
    static boolean  isSubstringPresent;
    public static boolean  ifsubStringpresentInGivenString(String s, String substring){
        s= s.toLowerCase();
        substring= substring.toLowerCase();
         isSubstringPresent= s.contains(substring);
        return isSubstringPresent;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.next();
        System.out.println("Enter the substring to check");
        String substring= sc.next();
        ifsubStringpresentInGivenString(s, substring);
        if (isSubstringPresent) {
            System.out.println("The substring '" + substring + "' is present in the string.");
        } else {
            System.out.println("The substring '" + substring + "' is not present in the string.");
        }
        sc.close();



    }
}
