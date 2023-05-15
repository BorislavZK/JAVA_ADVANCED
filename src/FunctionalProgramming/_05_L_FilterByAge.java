package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _05_L_FilterByAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        Map<String, Integer> peoples = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] nameAndAge = scan.nextLine().split(", ");
            String name = nameAndAge[0];
            int age = Integer.parseInt(nameAndAge[1]);

            if (!peoples.containsKey(name)) {
                peoples.put(name, age);
            } else {
                peoples.put(name, age);
            }
        }
        String condition = scan.nextLine();
        int ageLimit = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();


        Predicate<Integer> filter = getPredicate(condition, ageLimit);
        Consumer<Map.Entry<String, Integer>> print = getPrintConsumer(format);

        peoples
                .entrySet()
                .stream()
                .filter(entry -> filter.test(entry.getValue()))
                .forEach(entry -> print.accept(entry));
    }

    private static Consumer<Map.Entry<String, Integer>> getPrintConsumer(String format) {
        switch (format) {
            case "name":
                return e -> System.out.println(e.getKey());
            case "age":
                return e -> System.out.println(e.getValue());
            case "name age":
            case "age name":
                return e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());
        }

        throw new RuntimeException("Bad format!");
    }


    private static Predicate<Integer> getPredicate(String condition, int ageLimit) {
        if (condition.equals("older")) {
            return x -> x >= ageLimit;
        } else if (condition.equals("younger")) {
            return x -> x <= ageLimit;
        }

        throw new RuntimeException("Bad condition! Use 'older' or 'younger'");
    }
}
