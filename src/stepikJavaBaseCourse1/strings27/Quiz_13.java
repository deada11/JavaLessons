package stepikJavaBaseCourse1.strings27;

import java.util.Scanner;
class Quiz_13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String str = Integer.toString(x) + y;
        System.out.println(
                x + y + "\n" + str
        );
    }
}
