package SetAndMaps;

import java.util.*;

public class _04_L_CountRealNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> countNums = new LinkedHashMap<>();

        double[] inputNum = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();


        for (int i = 0; i < inputNum.length; i++) {
            Double currentNum = inputNum[i];
            countNums.putIfAbsent(currentNum, 0);

            if (countNums.containsKey(currentNum)){
                int currentValue = countNums.get(currentNum);
                countNums.put(currentNum, currentValue + 1);
            }

        }

        countNums.forEach((e1, e2) -> System.out.printf("%.1f -> %d\n", e1, e2));

    }
}
