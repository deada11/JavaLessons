package stepikCource.while41;

import java.util.Scanner;

class Quiz_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder test = sb.append(str);
        test.reverse();
        System.out.println(test);
    }
}
