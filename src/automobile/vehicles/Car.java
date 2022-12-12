package automobile.vehicles;

import automobile.details.Engine;
import automobile.professions.Driver;

public class Car {
    String model, carClass;
    double weight;
    Driver driver;
    Engine engine;

    public Car() {

    }

    public Car(String model, String carClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return this.model + '\n' +
                this.carClass + '\n' +
                this.weight + '\n' +
                this.driver.toString() + '\n' +
                this.engine.toString();
    }

    public void start() {
        System.out.println("Go!");
    }

    public void stop() {
        System.out.println("Stop!");
    }

    public void turnRight() {
        System.out.println("Turn right!");
    }

    public void turnLeft() {
        System.out.println("Turn left!");
    }
}
