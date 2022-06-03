package stepikJavaBaseCourse1.arraysTasks;

import java.util.Scanner;

class Quiz_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int min_sum = Integer.MAX_VALUE;
        if (array.length < 3) System.out.print(0);
        else {
            for (int i = 0; i < array.length - 2 ; i++) {
                if (Integer.parseInt(array[i]) + Integer.parseInt(array[i + 2]) < min_sum) {
                    min_sum = Integer.parseInt(array[i]) + Integer.parseInt(array[i + 2]);
                }
            }
            System.out.print(min_sum);
        }
    }
}
