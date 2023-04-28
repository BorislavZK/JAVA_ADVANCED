package MultidimetionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chessboard = new char[8][8];

        // Read in the chessboard
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = scanner.next().charAt(0);
            }
        }

        // Find the position of the valid queen
        int row = -1, col = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessboard[i][j] == 'q') {
                    boolean isValid = true;
                    // Check if the queen is attacked horizontally or vertically
                    for (int k = 0; k < 8; k++) {
                        if (chessboard[i][k] == 'q' && k != j) {
                            isValid = false;
                            break;
                        }
                        if (chessboard[k][j] == 'q' && k != i) {
                            isValid = false;
                            break;
                        }
                    }
                    // Check if the queen is attacked diagonally
                    for (int k = 1; k < 8; k++) {
                        if (i-k >= 0 && j-k >= 0 && chessboard[i-k][j-k] == 'q') {
                            isValid = false;
                            break;
                        }
                        if (i+k < 8 && j+k < 8 && chessboard[i+k][j+k] == 'q') {
                            isValid = false;
                            break;
                        }
                        if (i-k >= 0 && j+k < 8 && chessboard[i-k][j+k] == 'q') {
                            isValid = false;
                            break;
                        }
                        if (i+k < 8 && j-k >= 0 && chessboard[i+k][j-k] == 'q') {
                            isValid = false;
                            break;
                        }
                    }
                    // If the queen is valid, store its position and break out of the loop
                    if (isValid) {
                        row = i;
                        col = j;
                        break;
                    }
                }
            }
            if (row != -1 && col != -1) {
                break;
            }
        }

        // Print the position of the valid queen
        if (row == -1 || col == -1) {
            System.out.println("No valid queen found");
        } else {
            System.out.println((row+1) + " " + (col+1));
        }
    }
}
