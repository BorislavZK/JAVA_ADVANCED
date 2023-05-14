package SetAndMaps;

import java.util.*;
import java.util.function.Consumer;

public class _01_E_UniqueUsernames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> elements = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            elements.add(input);
        }

        Consumer<Set<String>> printSet = s -> s.forEach(System.out::println);
        printSet.accept(elements);
    }
}
