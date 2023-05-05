package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_L_MaximalSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        // fill the matrix
        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line[col];

            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;


        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                //System.out.print(matrix[row][col] + " ");

                int currentSum = matrix[row][col] + matrix[row + 1][col]
                        + matrix[row][col + 1] + matrix[row + 1][col + 1]
                        + matrix[row + 2][col] + matrix[row][col + 2] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRow = row;
                    maxCol = col;

                }
            }
        }


        System.out.println("Sum = " + maxSum);

        for (int row = maxRow; row < maxRow + 3; row++) {
            for (int col = maxCol; col < maxCol + 3; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }



    }

}
