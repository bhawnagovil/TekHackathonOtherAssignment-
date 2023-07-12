package Hackathon;
//Question-	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray3 {

    public static void sortingArrayPro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want to have");
        int size = sc.nextInt();
        int[] arrayInteger = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the numbers of the array");
            arrayInteger[i] = sc.nextInt();
        }
        Arrays.sort(arrayInteger);
        System.out.println("array after sorting");
        for(int i = 0; i < size; i++){
            System.out.println(arrayInteger[i]);
        }
        System.out.println("The string representation of array is:");
        System.out.println(Arrays.toString(arrayInteger));
        sc.close();

    }

    public static void main(String[] args) {
        sortingArrayPro();

    }
}
