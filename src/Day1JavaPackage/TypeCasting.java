package Day1JavaPackage;



import java.util.Scanner;

    /*convert  float to double
          double to float
          int to long
          long to int*/
    public class TypeCasting {

        private void changingFloattoDouble() {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the float number to change it to double");
            float f= sc.nextFloat();
            double d= f;
            System.out.println("Widening casting is done automatically when passing a smaller size type to a larger size");
            System.out.println("changing float to double  :" +d);
        }
        private void changingDoubletoFloat() {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Double number to change it to float");
            double d2= sc.nextDouble();
            System.out.println("Narrowing casting must be done manually by placing the type in parentheses in front of the value:");
            float f2= (float)d2;
            System.out.println("changing double to float  :" +f2);

        }
        private void changingIntToLong() {
            System.out.println("Enter the number to change it to long");
            Scanner sc= new Scanner(System.in);
            int i= sc.nextInt();
            long l= i;
            System.out.println("changing int to long  :" + l);


        }
        private void changingLongToInt() {
            System.out.println("Enter the long number to change it to int");
            Scanner sc= new Scanner(System.in);
            long l1 = sc.nextLong();
            int i2= (int)l1;
            System.out.println("changing long to int  :" + i2);
        }

        public static void main(String[] args) {
            TypeCasting casting= new TypeCasting();
            casting.changingDoubletoFloat();
            casting.changingFloattoDouble();
            casting.changingIntToLong();
            casting.changingLongToInt();

        }














    }





