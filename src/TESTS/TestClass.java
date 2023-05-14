package TESTS;
import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        //System.out.println(queue.removeLast());

        System.out.println(queue.poll());

        System.out.println();

        


    }

}

