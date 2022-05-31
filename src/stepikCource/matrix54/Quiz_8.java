package stepikCource.matrix54;

import java.util.Scanner;
class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = 0;
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            a = arr.length;
            count++;

        }
        System.out.println("Строк: "+count);
        System.out.println("Столбцов: "+a);
    }
}
