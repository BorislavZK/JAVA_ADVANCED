package MultidimetionalArrays;

import java.util.Scanner;

public class _03_L_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        char[][] A = new char[m][n];
        char[][] B = new char[m][n];
        char[][] C = new char[m][n];

        // Reading the matrices A and B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.next().charAt(0);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.next().charAt(0);
            }
        }

        // Finding the intersecting elements and filling the matrix C
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == B[i][j]) {
                    C[i][j] = A[i][j];
                } else {
                    C[i][j] = '*';
                }
            }
        }

        // Printing the matrix C
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
