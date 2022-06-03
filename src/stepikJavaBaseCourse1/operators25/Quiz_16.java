package stepikJavaBaseCourse1.operators25;
import java.util.Scanner;
import java.lang.Math;
class Quiz_16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int hours = (Math.abs(count % (24 * 60 * 60)) / 3600);
        int minutes = (Math.abs(count % (60 * 60))) / 60;
        int seconds = Math.abs(count % 60);
        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", hours, minutes, seconds);
    }
}
