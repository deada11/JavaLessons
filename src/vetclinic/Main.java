package vetclinic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
            new Dog("bone", "camping"),
            new Cat("fish", "table"),
            new Horse("grass", "field")
        };

        Map<String, String> hashMap = new HashMap<>();

        Dog butcher = new Dog("bones", "capming");
        butcher.setColor("grey");

        Cat tom = new Cat("fish", "table");
        tom.setName("Thomas");

        Horse don = new Horse("grass", "field");
        don.setAge("45");

        hashMap.put(butcher.getColor(), butcher.toString());
        hashMap.put(tom.getName(), tom.toString());
        hashMap.put(don.getAge(), don.toString());

        Set<String> keys = hashMap.keySet();

        for (String key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }

        Veterinarian aiBolit = new Veterinarian();
        for (Animal animal : animals) {
            aiBolit.treatAnimal(animal);
        }
    }
}