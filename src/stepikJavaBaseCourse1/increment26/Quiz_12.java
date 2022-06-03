package stepikJavaBaseCourse1.increment26;
import java.util.Scanner;

class Quiz_12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(((x + 1) / (y - 1)) + ((y + 1) / (x - 1)));
    }
}
