package univercity;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("tester", "pester", "tf1306", 4.97);
        Aspirant aspirant1 = new Aspirant("beaver", "river", "zs1221", "blah-blah", 3.80);
        Student aspirant2 = new Aspirant("wester", "gester", "gt8822", "gulp-gulp", 2.01);
//        System.out.println(student1.getScholarship(student1.averageMark));
//        System.out.println(student1.getScholarship(5));
//        System.out.println(aspirant1.getScholarship(aspirant1.averageMark));
//        System.out.println(aspirant1.getScholarship(5));
//        System.out.println(aspirant2.getScholarship(aspirant2.averageMark));
//        System.out.println(aspirant2.getScholarship(5));
        Student[] massive = new Student[]{student1, aspirant1, aspirant2};

        for (Student student : massive) {
            System.out.println(student.getScholarship(student.averageMark));
        }
    }
}
