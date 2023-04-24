package StackAndQueue;

import java.util.*;

public class _E_04_BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // number of elements to push into the queue
        int s = scan.nextInt(); // number of elements to pop from the queue
        int x = scan.nextInt(); // that you should check whether is present in the queue

        Queue<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentNum = scan.nextInt();
            stack.offer(currentNum);
        }

        if(!stack.isEmpty()){
            for (int i = 0; i < s; i++) {
                stack.poll();
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
