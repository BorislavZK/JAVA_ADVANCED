package TESTS;

import java.util.Scanner;

public class MultiArrays_Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] ns = scan.nextLine().split("\\s+");
        int rollsCount = Integer.parseInt(ns[0]);
        int colsCount = Integer.parseInt(ns[1]);

        int[][] matrix = new int[rollsCount][colsCount];

        for (int i = 0; i < matrix.length; i++) {
            String[] parts = scan.nextLine().split("\\s+");

            for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = Integer.parseInt(parts[j]);

            }
        }

        System.out.println("PRINT");
        //PRINT

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


//        2 3
//        1 2 3
//        4 5 6
    }
}
