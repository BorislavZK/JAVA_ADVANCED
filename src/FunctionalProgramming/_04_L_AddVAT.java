package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _04_L_AddVAT {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Function<String, Double> parse = s -> Double.parseDouble(s);
        UnaryOperator<Double> addVat = d -> d * 1.2;
        Consumer<Double> print = num -> System.out.printf("%.2f\n", num);


        System.out.println("Prices with VAT:");
        Arrays.stream(scan.nextLine().split(", "))
                .map(w -> parse.apply(w))
                .map(v -> addVat.apply(v))
                .forEach(priceWithVAT -> print.accept(priceWithVAT));


    }
}
