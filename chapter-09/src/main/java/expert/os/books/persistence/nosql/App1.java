package expert.os.books.persistence.nosql;

import expert.os.books.persistence.nosql.vehicle.Car;
import expert.os.books.persistence.nosql.vehicle.Vehicle;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App1 {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Vehicle vehicle = container.select(Vehicle.class).get();
            vehicle.move();

            Car car = container.select(Car.class).get();
            car.move();

            System.out.println("Is the same vehicle? " + car.equals(vehicle));
        }
    }
}
