package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinaryConverter03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();


        if (input == 0) {
            System.out.println(input);

        } else {

            while (input != 0) {

                stack.push(input % 2);
                input /= 2;
            }

            for (Integer integer : stack) {

                System.out.print(integer);

            }

        }

    }

}
