package Day1JavaPackage;

import java.util.Scanner;
    public class FactorialNumber {


        public int findFactorial(int number) {


            int i, fact=1;
            for(i=1; i<=number; i++) {
                fact= fact*i;

            }

            return fact;

        }

        public static void main(String[] args) {
            FactorialNumber obj=new FactorialNumber();
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number to find the factorial of :");
            int n= sc.nextInt();
            int factorial= obj.findFactorial(n);
            System.out.println(factorial);





        }

    }


