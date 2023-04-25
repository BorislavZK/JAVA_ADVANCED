package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class _E_05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Deque<Character> open = new ArrayDeque<>();

        boolean flag = false;

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                open.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (open.isEmpty()) {
                    flag = false;
                    break;
                }

                char lastOpen = open.pop();

                if (lastOpen == '(' && bracket == ')') {
                    flag = true;
                } else if (lastOpen == '{' && bracket == '}') {
                    flag = true;
                } else if (lastOpen == '[' && bracket == ']') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
