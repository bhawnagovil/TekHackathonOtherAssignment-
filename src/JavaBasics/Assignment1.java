package JavaBasics;

import java.util.Scanner;

public class Assignment1 {



        int first_number;
        int second_number;

        public void differentOperation(){
            int a, b, c, d;
            a= -5+(8*6);
            b= (55+9)%9;
            c= 20+ (-3)*(5/8);
            d=  5+ (15/3)*(2)-(8%3);
            System.out.println("after performing different operation a, b, c, d are "+ a +" , " +b + " ,"+ c+  " ,"+ d);
        }
        public int sum(int x, int y) {
            this.first_number = x;
            this.second_number = y;
            int add = first_number + second_number;
            return add;
        }

        public int diffTwoNumber(int x, int y) {
            this.first_number = x;
            this.second_number = y;
            int difference = x - y;
            return difference;
        }

        public double divideNumber(int x, int y) {
            this.first_number = x;
            this.second_number = y;
            //double num1= x;
            //double num2= y;
            double divide = (double)(x)/(double)(y);
            return divide;
        }

        public int multiply(int x, int y) {
            this.first_number = x;
            this.second_number = y;
            int multiple = x * y;
            return multiple;
        }
        public void  findCircleAreaPerimeter(int r){
            double pie= Math.PI;
            double area= r*r*pie;
            double perimeter= 2* pie* r;
            System.out.println("\n area of the circle is : "+ area);
            System.out.println("\n perimeter of the circle is: " + perimeter);

        }
        public void FindLargestNumberInGivenThreeNumber(){
            int a= 20, b=40, c=30;
            if(a>b && a>c){
                System.out.println( a + " is the largest number");}
            else if(b>a && b>c){
                System.out.println(b + " is the largest number");
            }
            else{
                System.out.println(c + " is the largest number");
            }

        }
        public void SwitchFindEvenOrNot() {
            int n;
            System.out.println("Enter any number");
            Scanner number = new Scanner(System.in);
            n = number.nextInt();
            switch (n % 2) {
                case 0:
                    System.out.println(n + " " + "is a even number");
                    break;
                case 1:
                    System.out.println(n + " " + "is a odd number");
                    break;
            }

        }
        public void SwapTwoNumbers(int m, int n){
            int temp=0;
            temp= m;
            m= n;
            n= temp;
            System.out.println( " m and n numbers after swiping are " + m + " " + n);
        }
        public void ComputeFormula(){
            double number=  4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
            System.out.println("number after computing with formula is :"+ number);
        }



        public static void main(String[] args) {
            Assignment1 obj = new Assignment1();
             obj.differentOperation();
             System.out.println(obj.divideNumber(15, 3));
            System.out.println(obj.diffTwoNumber(15,7));
             System.out.println(obj.multiply(4,6));
             System.out.println(obj.sum(8,9));
             obj.findCircleAreaPerimeter(6);
            obj.FindLargestNumberInGivenThreeNumber();
            obj.SwitchFindEvenOrNot();
            obj.SwapTwoNumbers(5, 6);
            obj.ComputeFormula();
        }
    }


