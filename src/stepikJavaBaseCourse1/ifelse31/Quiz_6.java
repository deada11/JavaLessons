package stepikJavaBaseCourse1.ifelse31;

import java.util.Scanner;
class Quiz_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String base_pass = sc.nextLine();
        String user_pass = sc.nextLine();
        if (user_pass.equals(base_pass)) {
            System.out.println("Access is granted");
        } else {
            System.out.println("Access is denied");
        }
    }
}
