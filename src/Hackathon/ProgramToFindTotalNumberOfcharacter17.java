package Hackathon;

import java.util.Scanner;

// WJP to find total number of integers, uppercase and lowercase character in the give string
public class ProgramToFindTotalNumberOfcharacter17 {
    public static int countIntegers(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count;
    }

    public static int findTotalUpperacseCharacter( String str) {
        char[] chararray = str.toCharArray();
        int count = 0;
        for (char c : chararray) {
            if (Character.isUpperCase(c))
            {
                count++;
            }

        }
        return count;
    }
        public static int countLowercaseChars(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String givenstring= sc.next();
        int totalIntegers = countIntegers(givenstring);
        int totalUppercaseChars = findTotalUpperacseCharacter(givenstring);
        int totalLowercaseChars = countLowercaseChars(givenstring);

        System.out.println("Input: " + givenstring);
        System.out.println("Total Integers: " + totalIntegers);
        System.out.println("Total Uppercase Characters: " + totalUppercaseChars);
        System.out.println("Total Lowercase Characters: " + totalLowercaseChars);
        sc.close();
    }

    }


