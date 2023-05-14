package SetAndMaps;

import java.util.*;
import java.util.function.Consumer;

public class _02_E_SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ns = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = ns[0];
        int m = ns[1];
        Set<String> setOne = new LinkedHashSet<>();
        Set<String> setTwo = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            setOne.add(scan.nextLine());
        }

        for (int i = 0; i < m; i++) {
            setTwo.add(scan.nextLine());
        }
        /*
        Consumer<Integer> printName = s -> System.out.print(s + " ");

        if (setOne.size() >= setTwo.size()) {
            setOne.retainAll(setTwo);
           // setOne.forEach(s -> System.out.print(s + " "));
            setOne.forEach(printName);
        } else {
            setTwo.retainAll(setOne);
            //setTwo.forEach(s -> System.out.print(s + " "));
            setTwo.forEach(printName);
        }
         */

        setOne.retainAll(setTwo);
        System.out.println(String.join(" ", setOne));


    }
}
