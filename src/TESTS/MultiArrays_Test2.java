package TESTS;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays_Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int r = 3;
        int c = 3;

        int[][] matrix = new int[r][c];

        int number = 0;

        for (int rows = 0; rows < r; rows++) {
            for (int cols = 0; cols < c; cols++) {

                matrix[rows][cols] = number++;
            }

        }


        //FILL MATRIX WITH ARRAY

        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }

        System.out.println("bobi");

    }
}
