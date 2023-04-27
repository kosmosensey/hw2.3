package pro.sky.java.homeworks.course2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1"),
                new Car("car2")
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1"),
                new Bicycle("bicycle2")
        };

        Vehicle[] vehicle = new Vehicle[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            vehicle[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            vehicle[i + cars.length] = trucks[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            vehicle[i + cars.length + trucks.length] = bicycles[i];
        }

        ServiceStationInterface station = new ServiceStation();
        station.check(vehicle);
    }
}