package stepikCource.matrix54;

import java.util.Scanner;

class Quiz_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (sc.hasNext()) {
            String[] array = sc.nextLine().split(" ");
            if (index < array.length) {
                result.append(array[index]).append(" ");
            }
            index++;
        }
        System.out.println(result.toString().trim());
    }
}
