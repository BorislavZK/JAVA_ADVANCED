package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _03_L_CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Predicate<String> ifCapitalLetter = e -> Character.isUpperCase(e.charAt(0));
        Consumer<String> print = element -> System.out.println(element);

        List<String> wordsWithCapitalLetter = Arrays.stream(scan.nextLine().split(" "))
                .filter(w -> ifCapitalLetter.test(w))
                .collect(Collectors.toList());


        System.out.println(wordsWithCapitalLetter.size());
        wordsWithCapitalLetter.stream().forEach(print);


    }
}
