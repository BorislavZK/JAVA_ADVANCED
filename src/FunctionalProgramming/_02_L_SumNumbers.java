package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _02_L_SumNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Function<String, Integer> parse = s -> Integer.parseInt(s);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", "))
                .map(element -> parse.apply(element)).collect(Collectors.toList());


        int sum = numbers.stream().mapToInt(a->a).sum();

        System.out.printf("Count = %d\n", numbers.size());
        System.out.printf("Sum = %d", sum);


    }
}
