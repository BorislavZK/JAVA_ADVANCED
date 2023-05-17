package FunctionalProgramming_TEST;

import ClassesAndObjects.OpinionPoll.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgramming_Patterns {


    //lastIndexOf -> връща последния индекс, на който срещаме дадения елемент
    //indexOf -> връща първия индекс, на който срещаме дадения елемент


    //Function<List<Integer>, Integer> minElement = list -> list.lastIndexOf(Collections.min(list));

    /**

     //SORT AND PRINT LIST WITH Person ELEMENTS
     List<Person> personsList = new ArrayList<>();

     personsList.sort(Comparator.comparing(Person::getName));
     personsList.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);

     */




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
