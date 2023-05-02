package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_L_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][size];


        //FILL MATRIX WITH ARRAY

        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }

        //PRINT PRIMARY DIAGONAL

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();

        for (int row = matrix.length; row >= 0; row--) {
            for (int col = matrix.length; col >= 0; col--) {

                if (col == size - row - 1) {
                    System.out.print(matrix[row][col] + " ");

                }

            }

        }
    }
}
