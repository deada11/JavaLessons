package stepikJavaBaseCourse1.while41;

import java.util.Scanner;

class Quiz_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fl = sc.next(), sl = sc.next();
        while (sc.hasNext()) {
            String str = sc.next();
            if ((str.charAt(0) >= fl.charAt(0)) && (str.charAt(0) <= sl.charAt(0))) {
                System.out.println(str);
            }
        }
    }
}
