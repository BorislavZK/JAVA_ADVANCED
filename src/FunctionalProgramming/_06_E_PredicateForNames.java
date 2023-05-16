package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_E_PredicateForNames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] names = scan.nextLine().split("\\s+");

        Predicate<String> checkNamesLength = name -> name.length() <= n;

        Arrays.stream(names).filter(checkNamesLength).forEach(System.out::println);
    }
}
