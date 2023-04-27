package pro.sky.java.homeworks.course2;

public class ServiceStation implements ServiceStationInterface {
    public void check(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            if (vehicle instanceof Car car) {
                car.checkEngine();
            }
            if (vehicle instanceof Truck truck) {
                truck.checkEngine();
                truck.checkTrailer();
            }
            System.out.println();
        }
    }
}