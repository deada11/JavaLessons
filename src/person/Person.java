package person;

public class Person {
    String fullName = "Tester";
    int age = 44;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' +", age=" + age;
    }

    void move() {
        System.out.println(age + " " + fullName + "s" + " is walking!");
    }

    void talk() {
        System.out.println(age +  " " + fullName + "s" + " is talking!");
    }
}
