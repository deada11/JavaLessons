package stepikCource.while41;

import java.util.Scanner;

class Quiz_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = 1;
        while (y <= x) {
            System.out.println(y);
            y++;
        }
    }
}
