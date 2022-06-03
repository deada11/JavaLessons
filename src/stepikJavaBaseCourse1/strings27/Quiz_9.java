package stepikJavaBaseCourse1.strings27;

import java.util.Scanner;
class Quiz_9 {
    public static void main (String[] args) {
        String str;
        str = new Scanner(System.in).nextLine();
        System.out.println(
                str.toLowerCase() + "\n" +
                        str.toUpperCase()
        );
    }
}
