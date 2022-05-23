package stepikCource.while41;

import java.util.Scanner;

class Quiz_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = 1;
        sc.close();
        while (y * y <= x) {
            System.out.print(y * y + " ");
            y++;
        }
    }
}
