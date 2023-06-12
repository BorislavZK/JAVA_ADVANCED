package ExamPreparation;

import java.util.Scanner;

public class FormulaOne_TEST {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int commandsCount = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[size][size];
        fillMatrix(matrix, scan);

        int row = 0;
        int col = 0;

        //INITIALIZE CAR POSITION
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char currentChar = matrix[i][j];
                if (currentChar == 'P') {
                   row = i;
                   col = j;
                   break;
                }
            }
        }

        char car = matrix[col][row];
        boolean isWin = false;

        for (int i = 0; i < commandsCount; i++) {

            String direction = scan.nextLine();

            switch (direction) {
                case "up":
                    if (row - 1 < 0){
                        matrix[row][col] = '.';
                        row = matrix.length - 1;
                        if (matrix[row][col] == 'B'){
                            row--;
                        }else if (matrix[row][col] == 'T'){
                            row = 0;
                        }
                    }

                    if (car != 'T') {
                        row--;
                        if (car == 'B') {
                            row--;
                        }
                        if (row < 0) {
                            row = size - 1;
                        }

                    }
                    break;

                case "right":
                    if (car != 'T') {
                        col++;
                        if (car == 'B') {
                            col++;
                        }
                        if (col == size) {
                            col = 0;
                        }
                    }
                    break;

                case "down":
                    if (car != 'T') {
                        row++;
                        if (car == 'B') {
                            row++;
                        }
                        if (row == size) {
                            row = 0;
                        }

                    }
                    break;

                case "left":
                    if (car != 'T') {
                        col--;
                        if (car == 'B') {
                            col--;
                        }
                        if (col < 0) {
                            col = size - 1;
                        }
                    }
                    break;
            }

            matrix[row][col] = 'P';

        }

        if (car == 'F') {
            matrix[row][col] = 'P';
            System.out.println("Well done, the player won first place!");
            printMatrix(matrix);
        } else {
            System.out.println("Oh no, the player got lost on the track!");
            printMatrix(matrix);
        }
    }

    private static void fillMatrix(char[][] matrix, Scanner scan) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().replace(" ", "").toCharArray();
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); //свали курсора на следващия ред
        }
    }
}
