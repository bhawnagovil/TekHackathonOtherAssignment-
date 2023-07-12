package Day3Assinments;

import java.util.Scanner;

public class FindCharacterAtGivenPosition {
    public static void findCharacterAtGivenLocation(String s, int position){
        try {
            if (position >= 0 && position < s.length()) {
                System.out.println(s.charAt(position));
            } else {
                System.out.println("Entered position is invalid, it should not be neither less than 0 and nor greater than the String size");
            }
        }
        catch(Exception e){
            System.out.println("Error in entered position please try again");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.next();
        System.out.println("Enter the position you want to check the character");
        int position = sc.nextInt();
        findCharacterAtGivenLocation(s,position);

    }

}
