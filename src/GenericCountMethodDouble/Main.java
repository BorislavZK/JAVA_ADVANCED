package GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();

        while (n-- > 0) {
            box.add(Double.parseDouble(scanner.nextLine()));
        }

        Double target = Double.parseDouble(scanner.nextLine());

        System.out.println(box.countGreaterItems(target));
    }
}