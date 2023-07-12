package Day1JavaPackage;

import java.util.Scanner;

            public class SwapNumbers {

                public void swapNumberswithouttemp(int x, int y) {

                    x= x+y;
                    y= x-y;
                    x= x-y;

                    System.out.println("After Swapping");
                    System.out.println("Value of x is :" + x);
                    System.out.println("Value of y is :" + y);

                }
                public void swapNumberswithtemp(int x, int y) {

                    int temp;
                    temp=x;
                    x= y;
                    y= temp;

                    System.out.println("After Swapping");
                    System.out.println("Value of x is :" + x);
                    System.out.println("Value of y is :" + y);
                }


                public static void main(String[] args) {
                    SwapNumbers numbers= new SwapNumbers();
                    System.out.println(" Enter the first number");
                    Scanner sc= new Scanner(System.in);
                    int firstnumber= sc.nextInt();
                    System.out.println(" Enter the second number");
                    int secondnumber= sc.nextInt();
                    System.out.println("Before Swapping");
                    System.out.println("Value of x is :" + firstnumber);
                    System.out.println("Value of y is :" + secondnumber);
                    System.out.println("Swapping the numbers without taking temp Variable");
                    numbers.swapNumberswithouttemp(firstnumber, secondnumber);
                    System.out.println("Swapping the number taking temp variable");
                    numbers.swapNumberswithtemp(firstnumber, secondnumber);




                }

            }








