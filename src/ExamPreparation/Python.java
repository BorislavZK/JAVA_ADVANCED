package ExamPreparation;

import java.util.Scanner;

public class Python {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        String[] commands = scan.nextLine().split(", ");
        int pythonLength = 1;
        char[][] matrix = new char[size][size];
        fillMatrix(matrix, scan);
        int pythonRow = 0;
        int pythonCol = 0;
        int foodCount = 0;

        //snake start position.
        for (int r = 0; r < matrix[0].length; r++) {
            for (int c = 0; c < matrix[1].length; c++) {
                char position = matrix[r][c];
                if (position == 's') {
                    pythonRow = r;
                    pythonCol = c;
                } else if (position == 'f') {
                    foodCount++;
                }
            }
        }
        int commandIndexes = commands.length;
        int index = 0;

        while (index < commandIndexes) {
            String currentCommand = commands[index];

            switch (currentCommand) {
                //left", "right", "up", "down
                case "left":
                    if (pythonCol - 1 < 0) {
                        pythonCol = matrix.length - 1;
                    } else {
                        pythonCol -= 1;
                    }

                    break;
                case "right":
                    if (pythonCol + 1 > matrix[0].length - 1) {
                        pythonCol = 0;
                    } else {
                        pythonCol += 1;
                    }
                    break;

                case "up":
                    if (pythonRow - 1 < 0) { //!
                        pythonRow = matrix.length - 1;
                    } else {
                        pythonRow -= 1;
                    }
                    break;

                case "down":
                    if (pythonRow + 1 > matrix[0].length - 1) {
                        pythonRow = 0;
                    } else {
                        pythonRow += 1;
                    }
                    break;
            }

            char currentChar = matrix[pythonRow][pythonCol];
            if (currentChar == 'f') {
                foodCount--;
                pythonLength += 1;
            } else if (currentChar == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }
            index++;
        }

        if (pythonLength - 1 < foodCount) {
            System.out.println("You lose! There is still " + foodCount + " food to be eaten.");
        }else {
            System.out.println("You win! Final python length is "+ pythonLength);
        }

    }

    private static void fillMatrix(char[][] matrix, Scanner scan) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().replaceAll(" ", "").toCharArray();
        }
    }
}
