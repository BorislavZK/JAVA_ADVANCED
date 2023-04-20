package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Deque<String> urls = new ArrayDeque<>();

        String input = scan.nextLine();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (urls.isEmpty() || urls.size() == 1) {
                    System.out.println("no previous URLs");
                    input = scan.nextLine();
                    continue;
                }

                urls.pop();

            } else {
                urls.push(input);
            }

            System.out.println(urls.peek());

            input = scan.nextLine();

        }
    }
}
