package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class _06_L_FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);
        String oddOrEven = scan.nextLine();

        //TERNARY OPERATOR
        Predicate<Integer> filterCondition = oddOrEven.equals("odd") ? (x -> x % 2 != 0) : (x -> x % 2 == 0);

        IntStream.rangeClosed(lowerBound, upperBound)
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));

    }
}
