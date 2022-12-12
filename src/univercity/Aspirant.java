package univercity;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, String scienceWork, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public double getScholarship(double averageMark) {
        return averageMark == 5 ? 200 : 180;
    }
}
