package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _04_E_AppliedArithmetics {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scan.nextLine();

        Function<List<Integer>, List<Integer>> addCommand = list -> list.stream().map(num -> num += 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiplyCommand = list -> list.stream().map(num -> num *= 2).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtractCommand = list -> list.stream().map(num -> num -= 1).collect(Collectors.toList());

        Consumer<List<Integer>> printCommand = list -> list.forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")){

            switch (command){

                case "add":
                    break;

                case "multiply":
                    break;

                case "subtract":
                    break;

                case "print":
                    break;
            }
        }




    }
}
