package stepikJavaBaseCourse1.test55;

import java.util.Scanner;

class Quiz_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        for (String el : array) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(el)) count++;
            }
            if (count == 1) System.out.print(el + " ");
        }
    }
}
