package ClassesAndObjects.CarSalesman;

public class Car {
    //A Car has a model, engine, weight, and color.
    //FordFocus V4-33 1300 Silver
    //FordMustang V8-101
    //VolkswagenGolf V4-33 Orange

    //A Car's weight, color - OPTIONAL

    private String model;
    private Engine engine;
    private int weight;
    private String color;


    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        //"{CarModel}:
        sb.append(this.model).append(":").append(System.lineSeparator());
        //{EngineModel}:
        sb.append(this.engine.getEngineModel()).append(":").append(System.lineSeparator());
        //Power: {EnginePower}
        sb.append("Power: ").append(this.engine.getEnginePower()).append(System.lineSeparator());


        //Displacement: {EngineDisplacement}
        sb.append("Displacement: ");
        //нямаме = 0; имаме = цяло число
        if (this.engine.getEngineDisplacement() == 0) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.engine.getEngineDisplacement()).append(System.lineSeparator());
        }

        //Efficiency: {EngineEfficiency}
        sb.append("Efficiency: ");
        if (engine.getEngineEfficiency() == null) {
            sb.append("n/a").append(System.lineSeparator());
        }else {
            sb.append(this.engine.getEngineEfficiency()).append(System.lineSeparator());
        }

        //Weight: {CarWeight}
        sb.append("Weight: ");
        if (this.weight == 0){
            sb.append("n/a").append(System.lineSeparator());
        }else {
            sb.append(this.weight).append(System.lineSeparator());
        }

        //Color: {CarColor}"
        sb.append("Color: ");
        //нямаме = null; имаме = текст
        if (this.color == null){
            sb.append("n/a").append(System.lineSeparator());
        }else {
            sb.append(this.color).append(System.lineSeparator());
        }

        return sb.toString();

    }
}
