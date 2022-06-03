package stepikJavaBaseCourse1.logic32;

import java.util.Scanner;
class Quiz_12 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        int day = a.nextInt();
        int mon = a.nextInt();
        int year = a.nextInt();
        if ((day >= 1 && day <= 31) && (mon >= 1 && mon <= 12) && year >= 0) {
            if ((day <= 29) && (mon == 2) && (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)))) {
                System.out.println("true");
            } else if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
                System.out.println("true");
            } else if ((mon == 4 || mon == 6 || mon == 9 || mon == 11) && day <= 30) {
                System.out.println("true");
            } else if (day <= 28 && (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)) {
                System.out.println("true");
            } else System.out.println("false");
        } else {
            System.out.println("false");
        }
    }

}
