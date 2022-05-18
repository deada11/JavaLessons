package stepikCource.test35;

import java.util.Scanner;

class Quiz_4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = Math.abs(sc.nextInt());
        int sum2 = Math.abs(sc.nextInt());
        if (sum1 < 100 || sum1 > 999) {
            System.out.println("error");
        } else {
            System.out.println(
                    (sum1 % 100) / 10 == sum2
            );
        }
    }
}