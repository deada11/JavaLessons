package stepikCource.while41;

import java.util.Scanner;

class Quiz_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int b;
        while ((b = sc.nextInt()) != 0) {
            sum += b;
        }
        System.out.println(sum);
    }
}