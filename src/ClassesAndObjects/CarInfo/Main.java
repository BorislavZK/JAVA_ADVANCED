package ClassesAndObjects.CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            //Chevrolet Impala 390
            //Mercedes Benz 500
            //Volga 24 49
            String[] input = scan.nextLine().split("\\s+");
            String brand = input[0];
            String model = input[1];
            int hp = Integer.parseInt(input[2]);

            Car car = new Car(brand, model, hp);

            cars.add(car);

        }
        cars.forEach(System.out::println);

    }
}
