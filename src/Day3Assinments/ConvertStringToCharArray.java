package Day3Assinments;

import java.util.Scanner;

public class ConvertStringToCharArray {

    public void convertingStringTOcharArray(String s){

         char[] c= new char[s.length()];// // Creating array of string length
         for(int i=0; i<s.length(); i++){
             c[i]= s.charAt(i);
             for(char chr: c){
                 System.out.println(chr);
             }
         }

    }

    public static void main(String[] args) {
        ConvertStringToCharArray ca= new ConvertStringToCharArray();
        System.out.println("Enter the string to convert in char array");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        ca.convertingStringTOcharArray(s);


    }
}
