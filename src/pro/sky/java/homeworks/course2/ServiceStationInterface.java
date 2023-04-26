package pro.sky.java.homeworks.course2;

public interface ServiceStationInterface {
    default void check(Car[] car){
        System.out.println("Машины не обслуживаем");
        System.out.println();
    }

    default void check(Truck[] truck){
        System.out.println("Грузовики не обслуживаем");
        System.out.println();
    }

    default void check(Bicycle[] bicycle){
        System.out.println("Велосипеды не обслуживаем");
        System.out.println();
    }
}
