package stepikCource.strings27;

import java.util.Scanner;
class Quiz_10 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        int num = reader.nextInt();
        System.out.println(str.charAt(--num));
        reader.close();
    }
}
