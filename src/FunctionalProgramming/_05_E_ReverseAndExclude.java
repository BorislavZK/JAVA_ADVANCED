package FunctionalProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _05_E_ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scan.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> checkDivision = number -> number % n == 0;


        //премахни елементите, за които checkDivision връща резултат true
        numbers.removeIf(checkDivision);


        numbers.forEach(number -> System.out.print(number + " "));

    }
}
