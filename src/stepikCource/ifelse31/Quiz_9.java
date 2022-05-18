package stepikCource.ifelse31;

import java.util.Scanner;

class Quiz_9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(
                (n == 3) ? "YES"
                : (n == 4) ? "YES"
                : (n == 5) ? "YES"
                :"NO"
        );
    }
}
