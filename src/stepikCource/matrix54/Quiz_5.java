package stepikCource.matrix54;

import java.util.Arrays;
import java.util.Scanner;

class Quiz_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String[][] strings = new String[size][];
        for (int i = 0; i < size; i++) {
            strings[i] = sc.nextLine().split(" ");
            System.out.println(Arrays.toString(strings[i]));
        }
    }
}
