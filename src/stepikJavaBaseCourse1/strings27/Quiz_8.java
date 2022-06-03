package stepikJavaBaseCourse1.strings27;

import java.util.Scanner;
class Quiz_8 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        /* Можно решить с помощью двух лишних объектов класса String
        String str = reader.nextLine();
        String word = reader.nextLine();
        Затем подставить переменные str и word в строку ниже */
        System.out.println(reader.nextLine().contains(reader.next()));
        reader.close();
    }
}
