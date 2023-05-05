package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_E_DiagonalDifference {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][size];

        // fill the matrix
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }

        int sumPrimary = 0;
        int sumSecondary = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                if (row == col) {
                    sumPrimary += matrix[row][col];
                }

                if (col == matrix.length - row - 1) {
                    sumSecondary += matrix[row][col];
                }
            }
        }

        int difference = Math.abs(sumPrimary - sumSecondary);

        System.out.println(difference);

    }
}
