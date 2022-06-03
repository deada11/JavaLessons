package stepikJavaBaseCourse1.for42;

import java.util.Scanner;

class Quiz_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int ind = 1;
        int iter = 0;
        while (max > 0) {
            System.out.print(ind + " ");
            iter++;
            if (iter == ind) {
                ind++;
                iter = 0;
            }
            max--;
        }
    }
}
