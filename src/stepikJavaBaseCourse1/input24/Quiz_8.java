package stepikJavaBaseCourse1.input24;
import java.util.Scanner;

class Quiz_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String helper = sc.nextLine();
        int mails = sc.nextInt();
        System.out.println(
                "Привет, " + user + ", " +
                        "это твой помощник " + helper + "."
        );
        System.out.println("У тебя " + mails + " новых писем.");
    }
}
