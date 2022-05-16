package stepikCource.ifelse31;

import java.util.Scanner;
class Quiz_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println("Махатма");
        } else {
            System.out.println("Джавахарлал");
        }
    }
}
