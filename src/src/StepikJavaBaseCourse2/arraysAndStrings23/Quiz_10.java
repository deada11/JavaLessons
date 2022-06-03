package src.StepikJavaBaseCourse2.arraysAndStrings23;

import java.util.Scanner;

public class Quiz_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        System.out.println(isPalindrome(input_string));
        System.out.println(cyclingIsPalindrome(input_string));
    }

    /* Через методы строк и StringBuilder */
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed_string = new StringBuilder(text);
        return reversed_string.reverse().toString().equals(text);
    }

    /* Через сравнение символов в строк, двигаясь от краев к середине */
    public static boolean cyclingIsPalindrome (String text) {
        text = text.replaceAll("[\\W]", "").toLowerCase();
        int len = text.length();
        for (int i = 0; i < (len/2); i++) {
            if (text.charAt(i) != text.charAt(len - 1 - i)) return false;

        }
        return true;
    }
}
