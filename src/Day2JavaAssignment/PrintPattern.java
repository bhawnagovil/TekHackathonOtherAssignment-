package Day2JavaAssignment;

import java.util.Scanner;

/*
 4.Print fallowing patterns

a. If n=4 then   o/p= 6 9 12 15
b. if n=5 then   o/p= 1,4,7,10,13
c. If n=6 then   o/p= 0,4,8,12,16
 */
public class PrintPattern {
    public void createPattern(int n){


        if (n == 4) {
            int num = 6;
            for (int i = 0; i < n; i++) {
                System.out.print(num + " ");
                num += 3;
            }
        } else if (n == 5) {
            int num = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(num + " ");
                num += 3;
            }
        } else if (n == 6) {
            int num = 0;
            for (int i = 0; i < n; i++) {
                System.out.print(num + " ");
                num += 4;
            }
        } else {
            System.out.println("Invalid value of n.");
        }


        }

    public static void main(String[] args) {
        PrintPattern pat= new PrintPattern();
        System.out.println("Choose the one number from three value to get Pattern: 4, 5, 6");
        Scanner sc= new Scanner(System.in);
        int choseNumber=  sc.nextInt();
        System.out.println("Pattern of the give number is : ");
        pat.createPattern(choseNumber);

    }
    }


