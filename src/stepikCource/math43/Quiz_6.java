package stepikCource.math43;

import java.util.Scanner;

class Quiz_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        System.out.print(
                ((Math.sin(Math.toRadians(angle)) +
                        Math.cos(Math.toRadians(angle))))
        );
    }
}
