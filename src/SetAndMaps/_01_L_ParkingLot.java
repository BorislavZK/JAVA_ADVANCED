package SetAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_L_ParkingLot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Set<String> carNumbers = new LinkedHashSet<>();

        String input = scan.nextLine();

        while (!input.equals("END")) {

            String command = input.split(", ")[0];
            String number = input.split(", ")[1];

            if (command.equals("IN")) {
                carNumbers.add(number);
            } else if (command.equals("OUT")) {
                carNumbers.remove(number);
            }

            input = scan.nextLine();
        }


        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            carNumbers.stream().forEach(e -> System.out.println(e));
        }


    }
}
