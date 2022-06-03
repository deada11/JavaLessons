package stepikJavaBaseCourse1.test35;

import java.util.Scanner;

class Quiz_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                (sc.nextLine().toLowerCase().contains(sc.nextLine().toLowerCase()))
        );
    }
}
