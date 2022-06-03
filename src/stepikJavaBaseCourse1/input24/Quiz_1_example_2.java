package stepikJavaBaseCourse1.input24;

import java.util.Scanner;

public class Quiz_1_example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        //float y = sc.nextFloat(); - это какая-то нерабочая хрень!
        String s = sc.nextLine(); // как и это!

        System.out.println(x + s);
        sc.close();
    }
}
