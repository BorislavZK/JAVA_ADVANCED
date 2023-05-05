package MultidimetionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_E_StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int angleRotation = Integer.parseInt(command.split("[()]+")[1]) % 360;
        List<String> list = new ArrayList<>();
        String input = scan.nextLine();

        int maxStringLength = 0; //cols
        int wordsCount = 0; //rows
        while (!input.equals("END")) {
            if (input.length() > maxStringLength) {
                maxStringLength = input.length();
            }
            wordsCount++;
            list.add(input);
            input = scan.nextLine();
        }
        char[][] matrix = new char[wordsCount][maxStringLength];

        //FILL WITH ' '
        for (int i = 0; i < wordsCount; i++) {
            for (int j = 0; j < maxStringLength; j++) {
                matrix[i][j] = ' ';
            }
        }
        //FILL THE MATRIX
        for (int i = 0; i < list.size(); i++) {
            char[] currentWord = list.get(i).toCharArray();
            for (int j = 0; j < currentWord.length; j++) {
                matrix[i][j] = currentWord[j];

            }
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        rotate(angleRotation, rows, cols, matrix);
    }

    private static void rotate(int angleRotation, int rows, int cols, char[][] matrix) {
        if (angleRotation == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);

                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }


}
