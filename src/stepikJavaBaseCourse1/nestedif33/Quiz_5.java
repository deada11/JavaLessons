package stepikJavaBaseCourse1.nestedif33;

import java.util.Scanner;

class Quiz_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
        sc.close();
        int a3 = Math.max(a1, a2);
        int b3 = Math.min(b1, b2);
        System.out.println(
                (a3 < b3) ? a3 + " " + b3
                : (a3 == b3) ? a3
                : "Пересечения нет"
        );
    }
}
