package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class _01_TempleOfDoom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> tools = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> substances = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int firstTools = 0;
        int lastSubstances = substances.size() - 1;

        //take the first tool from the tools sequence and the last substance
        // from the substances sequence. Multiply the values and check the result.

        List<Integer> challenges = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!tools.isEmpty() && !substances.isEmpty()) {

            int mix = tools.get(firstTools) * substances.get(lastSubstances);

            if (challenges.contains(mix)) {
                tools.remove(firstTools);
                substances.remove(lastSubstances);
                lastSubstances--;
                challenges.remove((Integer) mix);
            } else {
                // Increase the value of the tool element by
                // 1 and move the element to the back of the tools’ sequence.
                tools.set(firstTools, tools.get(firstTools) + 1);
                int tempTool = tools.get(0);
                tools.add(tempTool);
                tools.remove(0);

                //	Decrease the value of the substance element by
                //	1 and return the element to the substance’s sequence.
                // If the value of the substance element reaches 0, remove it from the sequence.

                substances.set(lastSubstances, substances.get(lastSubstances) - 1);
                if (substances.get(lastSubstances) == 0) {
                    substances.remove(lastSubstances);
                    lastSubstances--;
                }
            }
        }

        if (!challenges.isEmpty()) {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        } else {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }

        //o	"Tools: element1, element2, element3 … elementn"
        //o	"Substances: element1, element2, element3 … elementn"
        //o	"Challenges: element1, element2, element3 … elementn

        String delimiter = ", ";
        StringJoiner toolsJoiner = new StringJoiner(delimiter);
        StringJoiner substancesJoiner = new StringJoiner(delimiter);
        StringJoiner challengesJoiner = new StringJoiner(delimiter);

        if (!tools.isEmpty()) {
            //System.out.println("Tools: ");
            tools.forEach(item -> toolsJoiner.add(String.valueOf(item)));
            //System.out.println(toolsJoiner.toString());
            System.out.printf("Tools: %s", toolsJoiner);
        }

        if (!substances.isEmpty()){
            //System.out.println("Substances: ");
            substances.forEach(item -> substancesJoiner.add(String.valueOf(item)));
            //System.out.print(substancesJoiner.toString());
            System.out.println();
            System.out.printf("Substances: %s", substancesJoiner);
        }

        if (!challenges.isEmpty()){
            //System.out.println("Challenges: ");
            challenges.forEach(item -> challengesJoiner.add(String.valueOf(item)));
            //System.out.print(challengesJoiner.toString());
            System.out.println();
            System.out.printf("Challenges: %s", challengesJoiner);
        }
    }
}
