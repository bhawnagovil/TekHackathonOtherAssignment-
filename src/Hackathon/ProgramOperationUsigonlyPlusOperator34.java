package Hackathon;

import java.util.Scanner;

public class ProgramOperationUsigonlyPlusOperator34 {

    public static int multiply(int a, int b) {
        int product = 0;
        for (int i = 0; i < b; i++) {
            product += a;
        }
        return product;
    }

    public static int subtract(int a, int b) {
        return a + negate(b);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int quotient = 0;
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        while (absA >= absB) {
            absA = subtract(absA, absB);
            quotient++;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            quotient = negate(quotient);
        }
        return quotient;
    }

    public static int negate(int num) {
        return -num;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int product = multiply(a, b);
        int difference = subtract(a, b);
        int quotient = divide(a, b);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        sc.close();
    }

}

