package Hackathon;
//Q28. WJP to find factorial of a number using recursion
import java.util.Scanner;

public class FactorialUsingRecursion28 {
    public static int findFactorial(int n){
    if(n==0){
      return 1;
        }
    else{
        return n* findFactorial(n-1);
    }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial");
        int givenumber= sc.nextInt();
        System.out.println(findFactorial(givenumber));


    }

}
