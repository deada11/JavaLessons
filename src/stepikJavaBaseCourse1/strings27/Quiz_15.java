package stepikJavaBaseCourse1.strings27;

import java.util.Scanner;
class Quiz_15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        System.out.println(word1.charAt(0) < word2.charAt(0));
    }
}
