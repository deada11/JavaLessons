package stepikCource.ifelse31;

import java.util.Scanner;

class Quiz_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double mass = sc.nextDouble();
        double norm = sc.nextDouble();
        System.out.println((mass < norm) ? "Бой продолжается!" : "Холифилд - чемпион!");
        sc.close();
    }
}
