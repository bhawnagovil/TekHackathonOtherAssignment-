package Day2Practice;
import java.util.Scanner;
public class NByNMatrix {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the matrix (n): ");
            int n = scanner.nextInt();

            int[][] matrix = new int[n][n];

            System.out.println("Enter the elements of the matrix:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nMatrix:");

            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }

