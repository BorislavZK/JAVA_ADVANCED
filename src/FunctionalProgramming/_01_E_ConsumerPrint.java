package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_E_ConsumerPrint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] names = input.split(" ");


        Consumer<String[]> printArray = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };

        printArray.accept(names);



    }
}
