package TESTS;

public class FibonacciTEst {
    public static void main(String[] args) {


        System.out.println(fibonacci(50));

    }

    private static long fibonacci(long n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}




