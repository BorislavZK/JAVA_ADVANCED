package TESTS;

import java.util.*;

public class TestClass {

    public static void main(String[] args) {


        Deque<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.removeLast());




    }



    interface NumberAddition {
        int addition ( int a,int b);
    }
}

