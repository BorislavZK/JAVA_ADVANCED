package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_E_Phonebook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("search")) {

            String[] nameAndNum = input.split("-");
            String name = nameAndNum[0];
            String number = nameAndNum[1];

            phonebook.put(name, number);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!input.equals("stop")) {

            if (phonebook.containsKey(input)) {
                System.out.println(input + " -> " + phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
            input = scan.nextLine();
        }

    }
}
