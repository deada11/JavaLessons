package stepikJavaBaseCourse1.math43;

import java.util.Scanner;

class Quiz_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        double z = Math.abs(Math.pow((Math.pow(x, y)), 1.0/n));
        double scale = Math.pow(10, 5);
        System.out.println(
                Math.round(z * scale) / scale
        );
    }
}
