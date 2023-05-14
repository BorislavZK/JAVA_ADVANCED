package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_E_FixEmails {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        Map<String, String> mailList = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String mail = scan.nextLine();

            mailList.put(name, mail);

            name = scan.nextLine();
        }

        //us", "uk," or "com

        for (Map.Entry<String, String> entry : mailList.entrySet()) {
            if (!entry.getValue().endsWith("us") && !entry.getValue().endsWith("uk") && !entry.getValue().endsWith("com")) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
