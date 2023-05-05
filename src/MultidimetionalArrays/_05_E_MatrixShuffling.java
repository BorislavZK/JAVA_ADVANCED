package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05_E_MatrixShuffling {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[size[0]][size[1]];

        // fill the matrix
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }


        //swap row1 col1 row2c col2

        String input = scan.nextLine();

        while (!input.equals("END")) {

            String[] validating = input.split("\\s+");

            if (validating.length == 5 && validating[0].equals("swap")) {
                int row1 = Integer.parseInt(validating[1]);
                int col1 = Integer.parseInt(validating[2]);
                int row2 = Integer.parseInt(validating[3]);
                int col2 = Integer.parseInt(validating[4]);

                if (row1 >= 0 && row1 < matrix.length && col1 >= 0 && col1 < matrix[0].length && row2 >= 0
                        && row2 < matrix.length && col2 >= 0 && col2 < matrix[0].length) {
                    int num1 = matrix[row1][col1];
                    int num2 = matrix[row2][col2];
                    matrix[row1][col1] = num2;
                    matrix[row2][col2] = num1;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }

                } else {
                    System.out.println("Invalid input!");
                    input = scan.nextLine();
                    continue;
                }

            } else {
                System.out.println("Invalid input!");
                input = scan.nextLine();
                continue;
            }

            input = scan.nextLine();

        }

        scan.close();
    }
}
