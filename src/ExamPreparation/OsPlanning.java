package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class OsPlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> taskQueue = new ArrayDeque<>();
        Deque<Integer> threadDeque = new ArrayDeque<>();
        int[] tasks = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .toArray();
        int[] threads = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int task : tasks) {
            taskQueue.push(task); // push - pop
        }
        for (int thread : threads) {
            threadDeque.add(thread); // add - remove
        }
        int targetTask = Integer.parseInt(scan.nextLine());
        Integer task = null;
        Integer thread = null;

        while (!threadDeque.isEmpty()) {

            task = taskQueue.peek();
            thread = threadDeque.peek();
            assert !taskQueue.isEmpty();

            if (task == targetTask) {
                break;
            }

            //If the thread value is greater than or equal to the task value, the task and thread get removed.
            //If the thread value is less than the task value, the thread gets removed, but the task remains.

            if (thread >= task) {
                taskQueue.pop();
            }

            threadDeque.poll();

        }

        System.out.printf("Thread with value %d killed task %d%n", thread, task);
        while (!threadDeque.isEmpty()) {
            System.out.printf("%d ", threadDeque.poll());
        }


    }
}
