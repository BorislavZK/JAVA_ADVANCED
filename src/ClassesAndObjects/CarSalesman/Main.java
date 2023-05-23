package ClassesAndObjects.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Engine> engineList = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\s+");

            // ENGINE
            //"{Model} {Power} {Displacement} {Efficiency}".
            String engineModel = input[0];
            int enginePower = Integer.parseInt(input[1]);
            Engine engine = new Engine(engineModel, enginePower);

            if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine.setEngineDisplacement(displacement);
                engine.setEngineEfficiency(efficiency);

            } else if (input.length == 3) {
                //"{Model} {Power} {Displacement}".
                if (Character.isDigit(input[2].charAt(0))) {
                    int displacement = Integer.parseInt(input[2]);
                    engine.setEngineDisplacement(displacement);
                } else {
                    String efficiency = input[2];
                    engine.setEngineEfficiency(efficiency);
                }
            }

            engineList.add(engine);
        }

        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++) {
            //"{Model} {Engine} {Weight} {Color}

            String[] secondInput = scan.nextLine().split("\\s+");
            String model = secondInput[0];
            String engine = secondInput[1];
            String color = null;
            int weight = 0;

            if (secondInput.length == 4) {
                weight = Integer.parseInt(secondInput[2]);
                color = secondInput[3];
            } else if (secondInput.length == 3) {
                if (Character.isDigit(secondInput[2].charAt(0))) {
                    weight = Integer.parseInt(secondInput[2]);
                } else {
                    color = secondInput[2];
                }
            }

            Car car = new Car(model, null);
            car.setWeight(weight);
            car.setColor(color);

            for (Engine eng : engineList) {
                if (eng.getEngineModel().equals(engine)) {
                    car.setEngine(eng);
                    break;
                }
            }

            System.out.print(car.toString());
        }
    }
}
