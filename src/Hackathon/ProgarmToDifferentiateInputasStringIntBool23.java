package Hackathon;
// WJP to differentiate input as string, int or bool
import java.util.Scanner;

public class ProgarmToDifferentiateInputasStringIntBool23 {

    public static boolean isBoolean(String input) {
        input = input.toLowerCase();
        return input.equals("true") || input.equals("false");
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an input: ");
        String input = sc.nextLine();

        if (isBoolean(input)) {
            System.out.println("Input is a boolean.");
        } else if (isInteger(input)) {
            System.out.println("Input is an integer.");
        } else {
            System.out.println("Input is a string.");
        }

        sc.close();
    }
}
