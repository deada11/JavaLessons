package stepikJavaBaseCourse1.arraysMethods52;

import java.util.Scanner;
import java.util.Arrays;

class Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int[] int_arr = new int[array.length];
        for (int i = 0; i < int_arr.length; i++) {
            int_arr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(int_arr);
        System.out.println(Arrays.toString(int_arr));
    }
}
