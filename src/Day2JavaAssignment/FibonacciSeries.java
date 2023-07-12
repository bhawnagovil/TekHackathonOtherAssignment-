package Day2JavaAssignment;

import java.util.Scanner;

public class FibonacciSeries {


        private void printfibonacciSeries(int n) {
            int n1=0, n2=1, n3=0;int i=1;
            if(n<=0) {
                System.out.println("number is invalid");
            }
            else {
                System.out.print(n1 + " "+ n2+ ",");
                while(i<n){
                    n3= n1+n2;
                    System.out.print( +n3 + ", ");
                    n1=n2;
                    n2=n3;
                    i++;

                }
            }


        }
        public static void main(String[] args) {

            FibonacciSeries series= new FibonacciSeries();
            System.out.println("Enter the number for the Fabinocci series");
            Scanner sc= new Scanner(System.in);
            int number = sc.nextInt();
            series.printfibonacciSeries(number);
        }

    }



