package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _08_L_WrongMeasurements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int matrixRow = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[matrixRow][];

        // fill matrix
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }

        int[] address = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rowAddress = address[0];
        int colAddress = address[1];

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                // above
                if (rowAddress > 0) {
                    if (matrix[row][col] == matrix[rowAddress - 1][colAddress]) {
                        sum += matrix[row][col];
                    }
                }

                // below
                if (rowAddress < matrix[0].length) {
                    if (matrix[row][col] == matrix[rowAddress + 1][colAddress]) {
                        sum += matrix[row][col];
                    }
                }

                // right
                if (colAddress < matrix[0].length) {
                    if (matrix[row][col] == matrix[rowAddress][colAddress + 1]) {
                        sum += matrix[row][col];
                    }
                }

                // left
                if (colAddress > 0) {
                    if (matrix[row][col] == matrix[rowAddress - 1][colAddress]) {
                        sum += matrix[row][col];
                    }
                }

            }

        }

        matrix[rowAddress][colAddress] = sum;


        // Print the fixed matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();

    }
}
