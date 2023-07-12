package Hackathon;

import java.util.Scanner;
//WJP to convert string to int
//WJP to convert int to string
public class ProCovertStringToInt2122 {
    public static void convertStringToInt(String str){
         Integer i= Integer.valueOf(str);
        System.out.println("Converted String to Integer  :" + i);
    }
    public static void convertIntToString(int i){
        String s= String.valueOf(i);
        System.out.println("Converted Integer to String  :" + s);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String givenString= sc.next();
        convertStringToInt(givenString);
        System.out.println("Enter the Integer to covert in string");
        int giveinteger= sc.nextInt();
        convertIntToString(giveinteger);
        sc.close();


    }
}
