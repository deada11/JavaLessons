package automobile.vehicles;

import automobile.details.Engine;
import automobile.professions.Driver;

public class Lorry extends Car {
    double carrying;

    public Lorry(double carrying, String model, String carClass, double weight, Driver driver, Engine engine) {
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "\n carrying is: " + carrying;
    }
}
