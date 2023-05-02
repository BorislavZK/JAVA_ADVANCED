package TESTS;

import java.util.HashMap;
import java.util.Map;

public class MatrixMovement {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example matrix

        // Create a map to store the commands
        Map<String, int[]> commandMap = new HashMap<>();
        commandMap.put("up", new int[]{-1, 0});
        commandMap.put("down", new int[]{1, 0});
        commandMap.put("left", new int[]{0, -1});
        commandMap.put("right", new int[]{0, 1});

        int[] currentPosition = {0, 0}; // Start at top left corner of matrix

        // Move through the matrix with commands
        String[] commands = {"right", "down", "down", "left", "up", "right"}; // Example commands
        for (String command : commands) {
            int[] movement = commandMap.get(command);
            currentPosition[0] += movement[0];
            currentPosition[1] += movement[1];

            // Check if new position is within the bounds of the matrix
            if (currentPosition[0] < 0 || currentPosition[0] >= matrix.length ||
                    currentPosition[1] < 0 || currentPosition[1] >= matrix[0].length) {
                System.out.println("Invalid move: " + command);
                break;
            }

            // Print value at new position
            int value = matrix[currentPosition[0]][currentPosition[1]];
            System.out.println("Moved " + command + ", new position: [" +
                    currentPosition[0] + "][" + currentPosition[1] + "], value: " + value);
        }
    }
}

