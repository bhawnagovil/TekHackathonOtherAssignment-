package Hackathon;
// 	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
import java.util.Scanner;

public class BooleanCheckPoint1 {

    public static void ifTwoBooleanTrue(boolean b1, boolean b2, boolean b3){
     if(b1&&b2){
         System.out.println("two inputs are true");
     } else if(b2&&b3) {
         System.out.println("Two inputs are true");
     }
     else if(b1&&b3){
         System.out.println( " two inputs are true");
     }
     else{
         System.out.println("Two inputs are not true");
     }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first boolean value True or False");
        boolean a= sc.nextBoolean();
        System.out.println("Enter the second boolean value True or False");
        boolean b= sc.nextBoolean();
        System.out.println("Enter the third boolean value True or False");
        boolean c= sc.nextBoolean();
        sc.close();
        ifTwoBooleanTrue(a,b,c);





    }

}
