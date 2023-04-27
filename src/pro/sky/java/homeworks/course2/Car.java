package pro.sky.java.homeworks.course2;

public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName);
    }

    public int getWheelsCount() {
        return 4;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

