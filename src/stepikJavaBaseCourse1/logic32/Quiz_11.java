package stepikJavaBaseCourse1.logic32;

import java.util.Scanner;

class Quiz_11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(
                ((x + y + z) % 2 != 0 && (x * y * z) % 2 == 0) ? "true" : "false"
        );
    }
}
