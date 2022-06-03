package stepikJavaBaseCourse1.test35;

import java.util.Scanner;

class Quiz_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(
                (str.contains("Джефф Безос") || str.contains("Илон Маск")
                || str.contains("Марк Цукерберг") || str.contains("Билл Гейтс")) ? "Добро пожаловать!"
                : "Здесь никого нет, Вы ошиблись дверью"
        );
    }
}
