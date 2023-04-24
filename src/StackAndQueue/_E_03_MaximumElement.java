package StackAndQueue;

import java.util.*;

public class _E_03_MaximumElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String currentCommand = scan.nextLine();

            if(currentCommand.startsWith("1")){
                //"1 X" - Push the element X into the stack.
                int currentNum = Integer.parseInt(currentCommand.split("\\s+")[1]);
                stack.push(currentNum);

            }else if(currentCommand.startsWith("2")){
                //"2" - Delete the element present at the top of the stack.
                stack.pop();

            }else if(currentCommand.startsWith("3")){
                //"3" - Print the maximum element in the stack.
                System.out.println(Collections.max(stack));
            }

        }



    }
}
