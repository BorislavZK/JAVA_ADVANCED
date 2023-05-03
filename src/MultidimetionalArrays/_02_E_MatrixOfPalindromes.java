package MultidimetionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _02_E_MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];


        char startLetter = 'a';
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                //(a -> b -> c)(startLetter + 1)()
                String palindrome = "" + startLetter + (char)(startLetter + col) + startLetter;
                matrix[row][col] = palindrome;
            }
            startLetter = (char)(startLetter + 1);
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
