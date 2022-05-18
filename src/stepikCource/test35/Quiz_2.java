package stepikCource.test35;

import java.util.Scanner;

class Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(
                (x > 99 && x < 1000) ? "YES" : "NO"
        );
    }
}
