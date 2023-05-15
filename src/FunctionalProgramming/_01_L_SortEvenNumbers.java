package FunctionalProgramming;

import java.util.Arrays;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_L_SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());


        numbers.removeIf(num -> num % 2 != 0);

        printWithSeparators(numbers);
        System.out.println();

        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());

        printWithSeparators(sorted);
    }

    //comma delimiter method
    private static void printWithSeparators(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1){
                System.out.print(", ");
            }
        }



    }
}
