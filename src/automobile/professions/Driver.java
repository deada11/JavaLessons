package automobile.professions;
import person.Person;

public class Driver {
    int experience;
    Person person = new Person();

    public Driver(){

    }

    public Driver(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "FIO='" + person.toString() + '\'' +", experience=" + experience;
    }
}
