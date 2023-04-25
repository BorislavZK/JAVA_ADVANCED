package TESTS;

import java.util.Scanner;

public class MultiArrays_Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] ns = scan.nextLine().split("\\s+");
        int rollsCount = Integer.parseInt(ns[0]);
        int colsCount = Integer.parseInt(ns[1]);

        int[][] multiArray = new int[rollsCount][colsCount];


        for (int i = 0; i < rollsCount; i++) {
            for (int j = 0; j < colsCount; j++) {
                multiArray[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        //PRINT
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[0].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
