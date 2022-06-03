package stepikJavaBaseCourse1.while41;

import java.util.Scanner;

class Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, sum = 0, i;
        while ((i = sc.nextInt()) % 11 == 0) {
            if (i % 3 == 0) {
                sum += i;
            }
            c++;
        }
        sc.close();
        System.out.print(c + "\n" + sum);
    }
}
