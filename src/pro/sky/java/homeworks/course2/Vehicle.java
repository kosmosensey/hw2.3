package pro.sky.java.homeworks.course2;

public class Vehicle {
    private final String modelName;
    private int wheelsCount;

    public Vehicle(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
