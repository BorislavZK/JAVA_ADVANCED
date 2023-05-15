package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class _02_KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] names = input.split(" ");

        Consumer<String[]> namesPrint = array ->{

            for (String name : array){
                System.out.println("Sir " + name );
            }
        };
    }
}
