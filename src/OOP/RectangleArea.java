package OOP;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        printArea(width, height);
    }

    public static void printArea(int width, int height) {
        System.out.println(width * height);
    }
}
