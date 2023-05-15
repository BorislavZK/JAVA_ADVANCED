package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class _03_L_CustomMinFunction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        Arrays.stream(numbers).min()


    }
}
