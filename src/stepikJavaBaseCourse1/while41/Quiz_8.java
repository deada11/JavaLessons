package stepikJavaBaseCourse1.while41;

import java.util.Scanner;

class Quiz_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (sc.hasNext()) {
            sc.next();
            x++;
        }
        sc.close();
        System.out.println(x);
    }
}
