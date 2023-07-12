package Day1JavaPackage;

import java.util.Scanner;

public class MaximumTwo {

        public int findMaxTwoNumber(int x, int y) {
            int max=0;
            for(int i=0;i<=1; i++) {

                if(y>x){
                    max=y;
                }
                else {
                    max=x;
                }

            }
            return max;

        }
        public int findMaxThreeNumber(int x, int y, int z) {

            int max=0;
            for(int i=0;i<=2; i++) {

                if((x>y)&& (x>z)){
                    max=x;

                }
                else if((y>z)&&(y>x)) {
                    max=y;
                }
                else {
                    max=z;

                }

            }
            return max;

        }
        public static void main(String[] args) {
            MaximumTwo numbers = new MaximumTwo();
            System.out.println(" Enter the first number");
            Scanner sc= new Scanner(System.in);
            int firstnumber= sc.nextInt();
            System.out.println(" Enter the second number");
            int secondnumber= sc.nextInt();
            System.out.println(" Enter the third number");
            int thirdnumber= sc.nextInt();
            int maxOfTwo= numbers.findMaxTwoNumber(firstnumber, secondnumber);
            System.out.println("Maximum of first two number is :" + maxOfTwo);
            int maxOFThree= numbers.findMaxThreeNumber(secondnumber, firstnumber, thirdnumber);
            System.out.println("Maximum of all three number is :" + maxOFThree);


        }

    }



