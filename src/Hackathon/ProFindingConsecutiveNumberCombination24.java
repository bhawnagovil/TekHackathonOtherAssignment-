package Hackathon;

import java.util.Scanner;

//Write a program which inputs a positive natural number N and prints the possible consecutive
// number combinations, which when added give N.INPUT:  N = 9 OUTPUT:  4 + 5 ,2 + 3+ 4
public class ProFindingConsecutiveNumberCombination24 {
    public static void findConsecutiveNumberCombination(int n) {
        for (int i = 1; i <= n / 2; i++) {
            int x = i;
            int sum = 0;
            String s = "";

            while (sum < n) {
                sum =sum+ x;
                s =s+ x + "+";
                x++;
            }

            if (sum == n)
                System.out.println(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        findConsecutiveNumberCombination(n);
        sc.close();
    }
}
