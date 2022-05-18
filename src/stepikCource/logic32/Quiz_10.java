package stepikCource.logic32;

import java.util.Scanner;

class Quiz_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(
                ((x + y) % 2 == 0 && (x * y) % 2 != 0) ? "true" : "false"
        );
    }
}
