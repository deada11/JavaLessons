package stepikJavaBaseCourse1.operators25;

import java.util.Scanner;
import java.lang.Math;

class Quiz_15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt();
        int salary = sc.nextInt();
        int men = budget / salary;
        int unused = Math.abs(budget % salary);
        System.out.println(men + " " + unused);
    }
}
