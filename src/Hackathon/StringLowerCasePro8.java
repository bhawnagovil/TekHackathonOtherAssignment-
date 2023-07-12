package Hackathon;

import java.util.Scanner;

/*Q9: How can we make String Uppercase to lower case?
      Ans: We can turn String to lowercase by applying to toLowercase() method on string.*/


public class StringLowerCasePro8 {
    public static void turnStringLowerCase(String str){
        String uppercase= str.toLowerCase();
        System.out.println(uppercase);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to convert Lowercase");
        String givenstring= sc.next();
        turnStringLowerCase(givenstring);
        sc.close();
    }
}

