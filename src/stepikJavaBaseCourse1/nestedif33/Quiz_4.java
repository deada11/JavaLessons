package stepikJavaBaseCourse1.nestedif33;

import java.util.Scanner;

class Quiz_4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), r = sc.nextInt();
        sc.close();
        System.out.println(
                (Math.max(Math.max(x, y), z) - (Math.min(Math.min(x, y), z)) > r)
                        ? "Ура, бастуем!"
                        : "За работу, Солнце ещё высоко"
        );
    }
}
