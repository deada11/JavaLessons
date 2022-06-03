package stepikJavaBaseCourse1.logic32;

import java.util.Scanner;

class Quiz_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String let = sc.nextLine();
        System.out.println(
                (str.contains(let) || str.length() > 20) ? "YES" : "NO"
        );
    }
}
