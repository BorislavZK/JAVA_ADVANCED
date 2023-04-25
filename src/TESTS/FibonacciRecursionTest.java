package TESTS;

import java.util.Scanner;

public class FibonacciRecursionTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        System.out.println(fibonacci(n));

    }

    private static long fibonacci(long n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}




