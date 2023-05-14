package SetAndMaps;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _03_E_PeriodicTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> elementsSet = new TreeSet<>();


        for (int i = 0; i < n; i++) {
            String[] currentElements = scan.nextLine().split("\\s+");
            elementsSet.addAll(Arrays.stream(currentElements).collect(Collectors.toSet()));
        }

        Consumer<String> printName = s -> System.out.print(s + " ");
        elementsSet.forEach(printName);


    }
}
