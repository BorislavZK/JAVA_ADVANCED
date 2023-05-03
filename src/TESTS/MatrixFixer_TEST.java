package TESTS;

import java.util.Scanner;

public class MatrixFixer_TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read in the dimensions of the matrix
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Create the matrix and fill it with the input values
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Read in the mistaken value that needs to be fixed
        int mistakenValue = sc.nextInt();

        // Fix the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == mistakenValue) {
                    int sum = 0;
                    int count = 0;

                    // Check the element above
                    if (i > 0 && matrix[i-1][j] != mistakenValue) {
                        sum += matrix[i-1][j];
                        count++;
                    }

                    // Check the element below
                    if (i < rows-1 && matrix[i+1][j] != mistakenValue) {
                        sum += matrix[i+1][j];
                        count++;
                    }

                    // Check the element to the left
                    if (j > 0 && matrix[i][j-1] != mistakenValue) {
                        sum += matrix[i][j-1];
                        count++;
                    }

                    // Check the element to the right
                    if (j < cols-1 && matrix[i][j+1] != mistakenValue) {
                        sum += matrix[i][j+1];
                        count++;
                    }

                    // Replace the mistaken value with the average of the neighboring valid values
                    matrix[i][j] = (count > 0) ? sum / count : 0;
                }
            }
        }

        // Print the fixed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
