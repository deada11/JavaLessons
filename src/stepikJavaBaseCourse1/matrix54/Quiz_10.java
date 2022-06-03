package stepikJavaBaseCourse1.matrix54;

/* Решение не работает */

import java.util.Scanner;
class Quiz_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        while(sc.hasNext()){
            str1 += (sc.nextLine() + " ");
        }
        String[] mas1 = str1.split(" ");
        String[][] mas = new String[mas1.length][mas1[0].split(" ").length];
        for(int i = 0; i<mas1.length;i++){
            mas[i] = mas1[i].split(" ");
        }
        for(int i =0;i<mas[0].length;i++){
            for(int j = mas.length-1;j>=0;j--){
                System.out.print((j==mas.length-1 ?"":" ")+mas[j][i]);
            }
            System.out.println();
        }
    }
}
