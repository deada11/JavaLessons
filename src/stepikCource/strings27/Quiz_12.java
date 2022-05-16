package stepikCource.strings27;

import java.util.Scanner;
class Quiz_12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String strO = str1 + " " + str2;
        int length = strO.length();
        System.out.println(
                strO + "\n" + length
        );
    }
}
