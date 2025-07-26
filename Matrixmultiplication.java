import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows in Matrix A: ");
        int rowA = scanner.nextInt();
        System.out.print("Enter number of columns in Matrix A: ");
        int columnA = scanner.nextInt();

        System.out.print("Enter number of rows in Matrix B: ");
        int rowB = scanner.nextInt();
        System.out.print("Enter number of columns in Matrix B: ");
        int columnB = scanner.nextInt();

        if (columnA != rowB) {
            System.out.println("Matrix multiplication not possible: columns of A must equal rows of B.");
            return;
        }

        int[][] A = new int[rowA][columnA];
        int[][] B = new int[rowB][columnB];
        int[][] C = new int[rowA][columnB];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < columnA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix C (Product of A and B):");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}