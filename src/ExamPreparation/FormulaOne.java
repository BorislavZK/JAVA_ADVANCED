package ExamPreparation;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int commandsCount = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[size][size];
        fillMatrix(matrix, scan);

        int carRow = -1;
        int carCol = -1;

        //INITIALIZE CAR POSITION
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char currentChar = matrix[row][col];
                if (currentChar == 'P') {
                    carRow = row;
                    carCol = col;

                }
            }
        }

        char currentChar = ' ';

        boolean isWin = false;

        for (int i = 0; i < commandsCount; i++) {

            String direction = scan.nextLine();

            currentChar = matrix[carRow][carCol];

            switch (direction) {
                case "up":
                    if (currentChar != 'T') {
                        carRow--;
                        if (currentChar == 'B') {
                            carRow--;
                        }
                        if (carRow < 0) {
                            carRow = size - 1;
                        }
                    }
                    break;

                case "right":
                    if (currentChar != 'T') {
                        carCol++;
                        if (currentChar == 'B') {
                            carCol++;
                        }
                        if (carCol == size) {
                            carCol = 0;
                        }
                    }
                    break;

                case "down":
                    if (currentChar != 'T') {
                        carRow++;
                        if (currentChar == 'B') {
                            carRow++;
                        }
                        if (carRow == size) {
                            carRow = 0;
                        }
                    }
                    break;

                case "left":
                    if (currentChar != 'T') {
                        carCol--;
                        if (currentChar == 'B') {
                            carCol--;
                        }
                        if (carCol < 0) {
                            carCol = size - 1;
                        }
                    }
                    break;

            }


        }

        if (currentChar == 'F') {
            matrix[carRow][carCol] = 'P';
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
