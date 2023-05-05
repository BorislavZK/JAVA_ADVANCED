package SetAndMaps;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_L_SoftUniParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String guests = scan.nextLine();
        Set<String> guestSet = new LinkedHashSet<>();

        while (!guests.equals("PARTY")){

            guestSet.add(guests);

            guests = scan.nextLine();
        }


        String guestsComing = scan.nextLine();

        while (!guestsComing.equals("END")){

            guestSet.remove(guestsComing);

            guestsComing = scan.nextLine();

        }

        System.out.println(guestSet.size());
        guestSet.stream().sorted(String::compareTo).forEach(e -> System.out.println(e));
    }
}
