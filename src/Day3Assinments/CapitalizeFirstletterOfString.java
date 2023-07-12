package Day3Assinments;

import java.util.Scanner;

public class CapitalizeFirstletterOfString {

    public void capitalizeEachLetterOfEveryWordOfString(String str){
             String [] str1= str.split(" ");
            if (str == null || str.isEmpty()) {
                System.out.println("invalid string");
            }

        for(int i=0; i< str1.length; i++){
            char c= str1[i].charAt(0);
            String s1= String.valueOf(c).toUpperCase();
            String sub= str1[i].substring(1);
            String result= s1 + sub + " ";
            System.out.print(result);
        }


    }

    public static void main(String[] args) {
        CapitalizeFirstletterOfString c= new CapitalizeFirstletterOfString();
        String givestring= "hello world, how are you?";
        c.capitalizeEachLetterOfEveryWordOfString(givestring);
    }

}
