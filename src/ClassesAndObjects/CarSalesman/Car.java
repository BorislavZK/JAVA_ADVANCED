package ClassesAndObjects.CarSalesman;

public class Car {
    //A Car has a model, engine, weight, and color.
    //FordFocus V4-33 1300 Silver
    //FordMustang V8-101
    //VolkswagenGolf V4-33 Orange

    //A Car's weight, color - OPTIONAL

    private String model;
    private String engine;
    private int weight;
    private String color;


    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
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
}
