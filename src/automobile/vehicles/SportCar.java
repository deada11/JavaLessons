package automobile.vehicles;

import automobile.details.Engine;
import automobile.professions.Driver;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(int maxSpeed, String model, String carClass, double weight, Driver driver, Engine engine) {
        super(model, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\n maximum speed is: " + maxSpeed;
    }
}
