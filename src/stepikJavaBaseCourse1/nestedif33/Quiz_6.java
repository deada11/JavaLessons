package stepikJavaBaseCourse1.nestedif33;

import java.util.Scanner;

class Quiz_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int a = -999999999;
        if (x % 2 == 0 && x >= a) a = x;
        if (y % 2 == 0 && y >= a) a = y;
        if (z % 2 == 0 && z >= a) a = z;
        System.out.println(
                (a == -999999999) ? "Чётных чисел нет" : a
        );
    }
}
