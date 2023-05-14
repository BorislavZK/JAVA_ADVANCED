package FunctionalProgramming_TEST;

import java.util.function.Function;

public class FunctionalProgramming_Patterns {
    public static void main(String[] args) {


        // Function<приема, връща> -> apply
        // Consumer<приема> -> void -> accept
        // Supplier<връща> -> get
        // Predicate<приема> -> връща true / false -> test
        // BiFunction<приема1, приема2, връща> -> apply



        /*
    Consumer<String> printName = s -> System.out.print(s + " ");
        elementsSet.forEach(printName);
     */

        String str = "hello";
        Function<String, Character> printChars = s -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
            return null; // return null since we're only interested in printing the characters
        };
        printChars.apply(str);

    }

}
