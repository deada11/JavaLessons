package stepikJavaBaseCourse1.arraysTasks;

import java.util.Scanner;

class Quiz_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int length = 999, index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < length) {
                length = array[i].length();
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}
