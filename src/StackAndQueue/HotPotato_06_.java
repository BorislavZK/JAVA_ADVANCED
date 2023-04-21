package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato_06_ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split("\\s+");

        int steps = Integer.parseInt(scan.nextLine());

        Deque<String> kids = new ArrayDeque<>();

        Collections.addAll(kids, names);


        while (kids.size() > 1){

            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }

            String removedChild = kids.poll();
            System.out.println("Removed " + removedChild);
        }

        System.out.println("Last is " + kids.poll());
    }
}
