package stepikCource.test35;

import java.util.Scanner;

class Quiz_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = (sc.nextInt());
        System.out.println(
                (month == 12 || month == 2 || month == 1) ? "Зима"
                : (month >= 3 && month <= 5) ? "Весна"
                : (month >= 6 && month <= 8) ? "Лето"
                : (month >= 9 && month <= 11) ? "Осень"
                : "error"
        );
    }
}
