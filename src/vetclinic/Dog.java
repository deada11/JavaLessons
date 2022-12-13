package vetclinic;

public class Dog extends Animal {
    private String color;

    public Dog() {

    }
    public Dog(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof-woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + getFood());
    }

    @Override
    public String toString() {
        return "Dog { " +
                "color = " + getColor() + " " +
                "food = " + getFood() + " " +
                "location = " + getLocation() + " }";
    }
}
