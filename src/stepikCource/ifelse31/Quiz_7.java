package stepikCource.ifelse31;

import java.util.Scanner;

class Quiz_7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print(Math.max(x, Math.max(y,z)));
    }
}
