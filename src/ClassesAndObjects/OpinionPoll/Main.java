package ClassesAndObjects.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> personsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            personsList.add(person);

        }

        //SORT PLUS PRINT
        personsList.sort(Comparator.comparing(Person::getName));
        personsList.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);


    }
}
