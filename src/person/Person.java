package person;

public class Person {
    String fullName = "Tester";
    int age = 44;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person() {

    }

    void move() {
        System.out.println(age + " " + fullName + "s" + " is walking!");
    }

    void talk() {
        System.out.println(age +  " " + fullName + "s" + " is talking!");
    }
}
