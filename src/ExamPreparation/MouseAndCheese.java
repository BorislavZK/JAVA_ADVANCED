package ExamPreparation;

import java.util.Scanner;

public class MouseAndCheese {

    public static int row = 0;
    public static int col = 0;
    public static boolean outOfMatrix = false;
    public static int cheese = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        char[][] matrix = new char[n][n];

        fillMatrix(matrix, scan);

        boolean mouseFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'M') {
                    row = i;
                    col = j;
                    mouseFound = true;
                    break;
                }
            }
            if (mouseFound) {
                break;
            }
        }

        String command = scan.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "up":
                    moveUp(matrix);
                    break;
                case "right":
                    moveRight(matrix);
                    break;
                case "down":
                    moveDown(matrix);
                    break;
                case "left":
                    moveLeft(matrix);
                    break;
            }

            if (outOfMatrix) {
                System.out.println("Where is the mouse?");
                break;
            }
            command = scan.nextLine();
        }

        if (cheese < 5) {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",
                    5 - cheese);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheese);
        }


        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, Scanner scan) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().replace(" ", "").toCharArray();
        }
    }

    private static void moveUp(char[][] matrix) {
        if (row - 1 < 0) {
            outOfMatrix = true;
            matrix[row][col] = '-';
            return;
        }
        matrix[row][col] = '-';
        row--;
        if (matrix[row][col] == 'B') {
            matrix[row][col] = '-';
            row--;
        }
        mooving(matrix);
    }

    private static void moveDown(char[][] matrix) {
        if (row + 1 > matrix.length - 1) {
            outOfMatrix = true;
            matrix[row][col] = '-';
            return;
        }
        matrix[row][col] = '-';
        row++;
        if (matrix[row][col] == 'B') {
            matrix[row][col] = '-';
            row++;
        }
        mooving(matrix);
    }

    private static void moveRight(char[][] matrix) {
        if (col + 1 > matrix.length - 1) {
            outOfMatrix = true;
            matrix[row][col] = '-';
            return;
        }
        matrix[row][col] = '-';
        col++;
        if (matrix[row][col] == 'B') {
            matrix[row][col] = '-';
            col++;
        }
        mooving(matrix);
    }

    private static void moveLeft(char[][] matrix) {
        if (col - 1 < 0) {
            outOfMatrix = true;
            matrix[row][col] = '-';
            return;
        }
        matrix[row][col] = '-';
        col--;
        if (matrix[row][col] == 'B') {
            matrix[row][col] = '-';
            col--;
        }
        mooving(matrix);
    }

    private static void mooving(char[][] matrix) {
        if (matrix[row][col] == 'c') {
            matrix[row][col] = 'M';
            cheese++;
        } else {
            matrix[row][col] = 'M';
        }
    }
}
