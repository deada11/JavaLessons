package vetclinic;

public class Horse extends Animal {
    private String age;

    public Horse(){

    }
    public Horse(String food, String location) {
        super(food, location);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Get out!");
    }

    @Override
    public void eat() {
        System.out.println("I'll drink your blood");
    }

    @Override
    public String toString() {
        return "Horse { " +
                "age = " + getAge()  + " " +
                "food = " + getFood() + " " +
                "location = " + getLocation() +
                '}';
    }
}
