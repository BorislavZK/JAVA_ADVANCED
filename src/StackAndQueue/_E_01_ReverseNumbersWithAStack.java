package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _E_01_ReverseNumbersWithAStack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);

            stack.push(num);
        }

        for (Object num : stack) {
            System.out.print(num + " ");
        }


    }
}
