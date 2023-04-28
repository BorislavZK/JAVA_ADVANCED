package MultidimetionalArrays;

import java.util.Scanner;

public class _02_L_PositionsOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the matrix dimensions from the console
        int numRows = input.nextInt();
        int numCols = input.nextInt();

        // Create the matrix and read the values from the console
        int[][] matrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Read the number to search for from the console
        int searchNum = input.nextInt();

        // Search the matrix for the number and print the positions
        boolean found = false;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == searchNum) {
                    System.out.println(i + " " + j);
                    found = true;
                }
            }
        }

        // Print "not found" if the number was not found in the matrix
        if (!found) {
            System.out.println("not found");
        }
    }
}