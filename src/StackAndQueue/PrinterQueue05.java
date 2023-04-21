package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Deque<String> printer = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                    input = scan.nextLine();
                    continue;
                }

                System.out.println("Canceled " + printer.pollFirst());

            } else {
                printer.offer(input);
            }

            input = scan.nextLine();
        }

        for (String s : printer) {

            System.out.println(s);

        }
    }
}
