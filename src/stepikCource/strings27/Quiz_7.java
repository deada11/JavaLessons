package stepikCource.strings27;

import java.util.Scanner;
class Quiz_7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        int length = str.length() - 1;
        System.out.println(str.charAt(0) + " " + str.charAt(length));
    }
}
