package Hackathon;
// Question2- 	write a program to find factorial (Non Recursive)
import java.util.Scanner;

public class FactorialProgramNonRecursive2 {
    public static int findFactorialOfGivenNumber(int n){
        int factorial= 1;
     for(int i=1; i<=n; i++){
         factorial= i*factorial;
     }
     return factorial;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of which you want to find the factorial");
        int fact= sc.nextInt();
        System.out.println("Factorial of the given number is :");
        System.out.println(findFactorialOfGivenNumber(fact));
        sc.close();

    }
}
