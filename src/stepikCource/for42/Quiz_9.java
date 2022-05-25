package stepikCource.for42;

import java.util.Scanner;

class Quiz_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            System.out.println(Math.round(Math.pow(i, 2)) + " " + Math.round(Math.pow(i, 3)) + " " +
                    Math.round(Math.pow(i, 4)) + " " + Math.round(Math.pow(i, 5)));
        }
    }
}
