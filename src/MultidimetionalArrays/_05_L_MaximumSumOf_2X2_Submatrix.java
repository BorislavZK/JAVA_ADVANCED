package MultidimetionalArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_L_MaximumSumOf_2X2_Submatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line[col];

            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;


        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                //System.out.print(matrix[row][col] + " ");

                int currentSum = matrix[row][col] +
                        matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];

                if (currentSum > maxSum){
                    maxSum = currentSum;

                    maxRow = row;
                    maxCol = col;

                }
            }
        }

        for (int row = maxRow; row < maxRow + 2 ; row++) {
            for (int col = maxCol; col < maxCol + 2; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }

        System.out.println(maxSum);

    }

}
