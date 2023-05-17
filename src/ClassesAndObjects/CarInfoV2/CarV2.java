package ClassesAndObjects.CarInfoV2;

public class CarV2 {

    public String brand;
    public String model;
    public int horsePower;

    public CarV2(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //The car is: Chevrolet Impala - 390 HP
    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }
}

