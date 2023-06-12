package ExamPreparation;
import java.util.Scanner;

public class FormulaOne_GIT {
    public static int row = 0;
    public static int col = 0;
    public static boolean finishReached = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[][] matrix = new String[n][n];
        int commandsCnt = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            matrix[i] = scan.nextLine().split("");
        }

        boolean playerFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("P")) {
                    row = i;
                    col = j;
                    playerFound = true;
                    break;
                }
            }
            if (playerFound) {
                break;
            }
        }


        while (commandsCnt-- > 0) {
            if (finishReached) {
                break;
            }
            String command = scan.nextLine();

            switch (command) {
                case "up":
                    moveUp(matrix);
                    break;
                case "down":
                    moveDown(matrix);
                    break;
                case "right":
                    moveRight(matrix);
                    break;
                case "left":
                    moveLeft(matrix);
                    break;
            }
        }

        if (finishReached) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void moveLeft(String[][] matrix) {
        if (col - 1 < 0) {
            matrix[row][col] = ".";
            col = matrix[0].length - 1;
            if (matrix[row][col].equals("B")) {
                col--;
            } else if (matrix[row][col].equals("T")) {
                col = 0;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row][col - 1].equals("B")) {
            matrix[row][col] = ".";

            col -= 2;
            if (col < 0) {
                col = matrix[0].length - 1;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row][col - 1].equals("T")) {

        } else {
            matrix[row][col] = ".";
            col -= 1;
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        }
    }

    private static void moveRight(String[][] matrix) {
        if (col + 1 >= matrix[0].length) {
            matrix[row][col] = ".";
            col = 0;
            if (matrix[row][col].equals("B")) {
                col++;
            } else if (matrix[row][col].equals("T")) {
                col = matrix[0].length - 1;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row][col + 1].equals("B")) {
            matrix[row][col] = ".";

            col += 2;
            if (col >= matrix[0].length) {
                col = 0;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row][col + 1].equals("T")) {

        } else {
            matrix[row][col] = ".";
            col += 1;
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        }
    }

    private static void moveUp(String[][] matrix) {
        if (row - 1 < 0) {
            matrix[row][col] = ".";
            row = matrix.length - 1;
            if (matrix[row][col].equals("B")) {
                row--;
            } else if (matrix[row][col].equals("T")) {
                row = 0;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row - 1][col].equals("B")) {
            matrix[row][col] = ".";

            row -= 2;
            if (row < 0) {
                row = matrix.length - 1;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row - 1][col].equals("T")) {

        } else {
            matrix[row][col] = ".";
            row -= 1;
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }

            matrix[row][col] = "P";
        }
    }

    private static void moveDown(String[][] matrix) {
        if (row + 1 >= matrix.length) {
            matrix[row][col] = ".";
            row = 0;
            if (matrix[row][col].equals("B")) {
                row += 1;
            } else if (matrix[row][col].equals("T")) {
                row = matrix.length - 1;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row + 1][col].equals("B")) {
            matrix[row][col] = ".";
            row += 2;
            if (row >= matrix.length) {
                row = 0;
            }
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        } else if (matrix[row + 1][col].equals("T")) {

        } else {
            matrix[row][col] = ".";
            row += 1;
            if (matrix[row][col].equals("F")) {
                finishReached = true;
            }
            matrix[row][col] = "P";
        }
    }
}