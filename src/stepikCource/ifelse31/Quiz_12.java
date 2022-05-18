package stepikCource.ifelse31;

import java.util.Scanner;
class Quiz_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n % 7 == 0 && n % 5 != 0) ? "YES" : "NO");
    }
}