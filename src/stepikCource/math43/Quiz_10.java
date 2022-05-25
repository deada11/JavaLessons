package stepikCource.math43;

import java.util.Scanner;

class Quiz_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double per = Math.round(a + b + c);
        System.out.println(per);
    }
}
