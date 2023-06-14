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
                if (matrix[i][j]== 'M') {
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
                    col++;
                    if (col == matrix.length) {
                        col = 0;
                    }
                    break;
                case "down":
                    row++;
                    if (row == matrix.length) {
                        row = 0;
                    }
                    break;
                case "left":
                    col--;
                    if (col < 0) {
                        col = matrix.length - 1;
                    }
                    break;

            }


            command = scan.nextLine();

        }

    }

    private static void fillMatrix (char[][] matrix, Scanner scan){
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().replace(" ", "").toCharArray();
        }
    }

    private static void moveUp(char[][] matrix) {
        if (row - 1 < 0){
            outOfMatrix = true;
            matrix[row][col] = '-';
            return;
        }
        matrix[row][col] = '-';
        row--;
        if (matrix[row][col] == 'B'){
            matrix[row][col] = '-';
            row--;
        }
        mooving(matrix);
    }

    private static void moveDown(char[][] matrix) {
        if (row + 1 > matrix.length - 1){
            outOfMatrix = true;
            matrix[row][col] = '-';
            return;
        }
        matrix[row][col] = '-';
        row++;
        if (matrix[row][col] == 'B'){
            matrix[row][col] = '-';
            row++;
        }
        mooving(matrix);
    }



    private static void mooving(char[][] matrix) {
        if (matrix[row][col] == 'c'){
            matrix[row][col] = 'M';
            cheese ++;
        }else {
            matrix[row][col] = 'M';
        }

    }
}
