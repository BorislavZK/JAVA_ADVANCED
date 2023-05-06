package SetAndMaps;

import java.util.*;

public class _05_L_AverageStudentsGrades {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        Map<String, List<Double>> studentsMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();
            String currentName = input.split("\\s+")[0];
            Double currentGrade = Double.parseDouble(input.split("\\s+")[1]);

            studentsMap.putIfAbsent(currentName, new ArrayList<>());

            if (studentsMap.containsKey(currentName)) {
                studentsMap.get(currentName).add(currentGrade);
            }

        }

        studentsMap.forEach((key, value) -> {
            System.out.print(key + " -> ");
            value.forEach(num -> {
                System.out.printf("%.2f ", num);
            });
            double average = value.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
            System.out.printf("(avg: %.2f)\n", average);
        });

    }
}
