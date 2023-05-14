package SetAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;

public class _04_E_CountSymbols {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> mapOne = new TreeMap<>();

        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!mapOne.containsKey(c)){
                mapOne.put(c, 1);
            } else {
                mapOne.put(c, mapOne.get(c) + 1);
            }
        }
       mapOne.forEach((k, v) -> System.out.println(k+": "+ v + " time/s"));

    }
}
