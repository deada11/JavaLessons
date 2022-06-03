package stepikJavaBaseCourse1.test28;

import java.util.Scanner;
class Quiz_9 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        System.out.println("Сложение: " + x + " + " + y + " = " + (x + y));
        System.out.println("Вычитание: " + x + " - " + y + " = " + (x - y));
        reader.close();
    }
}
