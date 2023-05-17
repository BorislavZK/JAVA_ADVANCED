package ClassesAndObjects.CarInfoV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<CarV2> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //Chevrolet Impala 390
            //Mercedes Benz 500
            //Volga 24 49
            String[] input = scan.nextLine().split("\\s+");
            String brand = input[0];


            CarV2 car = new CarV2(brand);

            if (input.length == 3) {
                String model = input[1];
                int hp = Integer.parseInt(input[2]);
                car.setModel(model);
                car.setHorsePower(hp);

            } else if (input.length == 2){

                if (Character.isDigit(input[1].charAt(0))){
                    int hp = Integer.parseInt(input[1]);
                    car.setHorsePower(hp);
                }else {
                    String model = input[1];
                    car.setModel(model);
                }
            }

            cars.add(car);

        }
        cars.forEach(System.out::println);

    }
}