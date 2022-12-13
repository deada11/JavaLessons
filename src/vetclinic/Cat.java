package vetclinic;

public class Cat extends Animal {
    private String name;

    public Cat(){

    }
    public Cat(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public String toString() {
        return "Cat { " +
                "name = " + getName() + " " +
                "food = " + getFood() + " " +
                "location = " + getLocation() +
                '}';
    }
}
