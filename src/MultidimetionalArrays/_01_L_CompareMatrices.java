package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_L_CompareMatrices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] sizeF = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int firstMatrixRows = sizeF[0];
        int firstMatrixCols = sizeF[1];

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        for (int fRows = 0; fRows < firstMatrix.length; fRows++) {
            int[] inputFirst = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            firstMatrix[fRows] = inputFirst;

        }

        int[] sizeS = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int secondMatrixRows = sizeS[0];
        int secondMatrixCols = sizeS[1];

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        for (int sRows = 0; sRows < secondMatrixRows; sRows++) {
            int[] inputSecond = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            secondMatrix[sRows] = inputSecond;
        }
        if (matrixAreEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
    private static boolean matrixAreEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
