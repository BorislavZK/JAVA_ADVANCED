package StackAndQueue;

import java.util.*;

public class _E_02_BasicStackOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // number of elements to push into the stack
        int s = scan.nextInt(); // number of elements to pop from the stack
        int x = scan.nextInt(); // that you should check whether is present in the stack


        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentNum = scan.nextInt();
            stack.push(currentNum);
        }

        if(!stack.isEmpty()){
            for (int i = 0; i < s; i++) {
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            if (stack.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stack));
            }

        } else {
            System.out.println("0");
        }


    }
}
