package automobile.details;

public class Engine {
    int power;
    String madeBy;

    public Engine(int power, String madeBy) {
        this.power = power;
        this.madeBy = madeBy;
    }

    @Override
    public String toString() {
        return "power = " + power + ", madeBy = '" + madeBy + '\'';
    }
}
