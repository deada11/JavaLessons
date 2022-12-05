package person;

public class ActivePerson {
    public static void main(String[] args) {
        Person someone = new Person();
        someone.move();
        someone.talk();

        Person anybody = new Person("Pester", 33);
        anybody.move();
        anybody.talk();
    }
}
