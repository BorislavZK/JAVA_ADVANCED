package GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Integer num = Integer.parseInt(input);

            GenericBoxOfIntegers box = new GenericBoxOfIntegers<>(num);

            System.out.println(box);

        }

    }
}
