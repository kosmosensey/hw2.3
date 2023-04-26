package pro.sky.java.homeworks.course2;

public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Car[] cars) {
        for (Car car : cars) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println();
        }
    }

    @Override
    public void check(Truck[] trucks) {
        for (Truck truck : trucks) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println();
        }
    }

    @Override
    public void check(Bicycle[] bicycles) {
        for (Bicycle bicycle : bicycles) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
            System.out.println();
        }
    }
}