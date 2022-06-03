package stepikJavaBaseCourse1.arraysTasks;

import java.util.Scanner;

class Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        System.out.print(array[0] + " ");
        for (int i = 1; i <= array.length - 2; i += 2) {
            System.out.print(
                    (i == array.length - 2) ? array[i] + " " : array[i + 1] + " " + array[i] + " "
            );
        }
        System.out.print(array[array.length - 1]);
    }
}
