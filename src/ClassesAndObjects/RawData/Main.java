package ClassesAndObjects.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Car>> carsByCargoType = new HashMap<>();


        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tire> tireList = new ArrayList<>();
            for (int tireItems = 5; tireItems <= 12; tireItems += 2) {
                Tire currentTire = new Tire(Double.parseDouble(input[tireItems]), Integer.parseInt(input[tireItems + 1]));
                tireList.add(currentTire);

            }

            Car currentCar = new Car(model, engine, cargo, tireList);
            carsByCargoType.putIfAbsent(cargoType, new ArrayList<>());
            carsByCargoType.get(cargoType).add(currentCar);

        }


        String command = scan.nextLine();

        carsByCargoType.get(command).forEach(car -> car.extract(command));

    }

}
