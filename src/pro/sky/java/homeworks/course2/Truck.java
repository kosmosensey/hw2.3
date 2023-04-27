package pro.sky.java.homeworks.course2;

public class Truck extends Vehicle {
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
