package MultidimetionalArrays;

import java.util.Scanner;

public class _01_E_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sizeAndPattern = scan.nextLine().split(", ");
        int size = Integer.parseInt(sizeAndPattern[0]);
        String pattern = sizeAndPattern[1];

        int[][] matrix = new int[size][size];

        int num = 1;

        if (pattern.equals("A")) {
            //fill pattern A
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = num++;
                }
            }

        }else if (pattern.equals("B")){
            //fill pattern B
            for (int col = 0; col < matrix.length; col++) {

                if (col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = num++;
                    }
                } else {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = num++;
                    }
                }
            }
        }

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
