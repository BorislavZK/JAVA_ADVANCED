package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _03_L_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        // V1
        Consumer<List<Integer>> printMin = list -> {
            int minElement = Collections.min(list);
            System.out.println(minElement);
        };


        printMin.accept(numbers);


    }
}
