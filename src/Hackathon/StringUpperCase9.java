package Hackathon;

import java.util.Scanner;
/*Q8: How can we make String lowercase to Upper case?
Ans: We can turn Strimg to lowercase by applying to toUppercase() method on string.*/
public class StringUpperCase9 {

    public static void turnStringUpperCase(String str){
        String uppercase= str.toUpperCase();
        System.out.println(uppercase);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to convert in UPPERCASE");
        String givenstring= sc.next();
        turnStringUpperCase(givenstring);
        sc.close();
    }
}
