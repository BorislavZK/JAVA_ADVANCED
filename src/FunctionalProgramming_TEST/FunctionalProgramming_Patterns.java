package FunctionalProgramming_TEST;

public class FunctionalProgramming_Patterns {


        /**

        // Function<приема, връща> -> apply
        // Consumer<приема> -> void -> accept
        // Supplier<връща> -> get
        // Predicate<приема> -> връща true / false -> test
        // BiFunction<приема1, приема2, връща> -> apply

        */




        /**
         //PRINT ELEMENT WITH WHITE SPACE
    Consumer<String> printName = s -> System.out.print(s + " ");
        elementsSet.forEach(printName);
     */


        /**

        // CONSUMER PRINT COLLECTION
        // TODO - test with comma separation!!!
        Consumer<String[]> namesPrint = array ->{
            for (String name : array){
                System.out.println("Sir " + name );
            }
        };

        namesPrint.accept(names);

         */



        /**

        // PRINT EVERY SINGLE CHAR
        String str = "hello";

        Function<String, Character> printChars = s -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
            return null; // return null since we're only interested in printing the characters
        };
        printChars.apply(str);

         */



}
