package com.company;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        int age = 30;
        if (age < 16) {
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome!");
        }
    }
}

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        while (number > 0) {
            fact *= number--;
        }
        System.out.println(fact);

    }
}

class EndWithThree {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int number = read.nextInt();
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 || i % 10 == 3) {
                    System.out.println(i);
                }
                i++;
            }
        }
}

class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 1; i <= 3; i++) {
            amount -= amount * 0.1;
        }
        System.out.println(amount);
    }
}