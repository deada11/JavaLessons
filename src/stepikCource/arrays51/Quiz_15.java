package stepikCource.arrays51;

import java.util.Scanner;

class Quiz_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(",");
        for (String word : array) {
            System.out.println(word);
        }
    }
}
