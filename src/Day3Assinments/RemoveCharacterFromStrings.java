package Day3Assinments;

import java.util.Scanner;

//String objects are immutable, which means that they can’t be changed after they’re created.
// All of the String class methods described in this article return a new String object
// and do not change the original object. The type of string you use depends on the requirements of your program.
public class RemoveCharacterFromStrings {


    public String removeParticularCharacterFromString(String s, char c){
        String strNew= s.replace("c", "");// to remove particular character from string
        return strNew;
    }
    public String  removeSpacesFromString(String s){
        String newstr= s.replace(" ","");// To remove spaces from string
        return newstr;
    }
    public String removeSubstringFromJava(String s, String s2){
        String newStr= s.replaceFirst(s2, "");//  to replace the character or substring with an empty string
        return newStr;
    }
    public String removeAllLowercase(String str){
        String strNew= str.replaceAll("[a-z]", "");
        return strNew;

    }
    public String removeLastCharacterFromString(String str){
        String strNew= str.substring(0, str.length()-1);// specifies the range of the string frm given index to last index we gave removing the last character
        return strNew;
    }


    public static void main(String[] args) {
        RemoveCharacterFromStrings obj= new RemoveCharacterFromStrings();
        String s1=  "abc ABC 123 abc";
        System.out.println("Current string is : "+ s1);
        System.out.println(obj.removeParticularCharacterFromString(s1,'c'));
        System.out.println(obj.removeLastCharacterFromString(s1));
        System.out.println(obj.removeSubstringFromJava(s1,"abc"));
        System.out.println(obj.removeSpacesFromString(s1));
        System.out.println(obj.removeAllLowercase(s1));



    }

}
