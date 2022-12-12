package automobile;

import automobile.details.Engine;
import automobile.professions.Driver;
import automobile.vehicles.Car;
import automobile.vehicles.Lorry;
import automobile.vehicles.SportCar;
import person.Person;

public class Main {
    public static void main(String[] args) {
        Car test = new Car("Ah-1221", "test", 444.44, new Driver(),
                new Engine(666, "QA"));

        Lorry bigfoot = new Lorry(666.66, "vhs", "very big shit", 567.89,
                new Driver(), new Engine(444, "ChinaTown atm"));

        SportCar speedy = new SportCar(250, "speedtest", "very fast shit", 123.45,
                new Driver(40), new Engine(2000, "Cosinus Fi inc"));

//        test.start();
//        test.stop();
//        test.turnLeft();
//        test.turnRight();

        System.out.println(test);
        System.out.println(bigfoot);
        System.out.println(speedy);
    }
}
