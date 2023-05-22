package ClassesAndObjects.CarSalesman;

public class Engine {

    //An Engine has a model, power, displacement, and efficiency.
    //Engine displacements, and efficiency are optional
    //V8-101 220 50
    //V4-33 140 28 B


    private String engineModel;
    private int enginePower;
    private int engineDisplacement;
    private String engineEfficiency;


    public Engine(String engineModel, int enginePower) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getEngineEfficiency() {
        return engineEfficiency;
    }

    public void setEngineEfficiency(String engineEfficiency) {
        this.engineEfficiency = engineEfficiency;
    }
}
