package vetclinic;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("bone", "camping"),
                new Cat("fish", "table"),
                new Horse("grass", "field")};
        Veterinarian aiBolit = new Veterinarian();
        for (Animal animal : animals) {
            aiBolit.treatAnimal(animal);
        }
    }
}
