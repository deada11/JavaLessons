package stepikCource.test55;

import java.util.Scanner;

class Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[0];
        while (sc.hasNext()) {
            array = sc.nextLine().split(" ");
        }
        System.out.println(
                (n >= 0 && n <= array.length - 1) ? array[n] : "Неверный ввод"
        );
    }
}
