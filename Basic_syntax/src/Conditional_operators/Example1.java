package Conditional_operators;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(minNumber());
        System.out.println(maxNumber());
        System.out.println(averageNumber());


    }

    static String minNumber() {
        System.out.println("Введите первое число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();
        if (num1 <= num2) {
            return "Минимальное число: " + num1;
        } else {
            return "Минимальное число: " + num2;
        }
    }

    static String maxNumber() {
        System.out.println("Введите первое число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();
        if (num1 >= num2) {
            return "Максимальное число: " + num1;
        } else {
            return "Максимальное число: " + num2;
        }
    }

    static String averageNumber() {
        System.out.println("Введите первое число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Введите третье число: ");
        int num3 = new Scanner(System.in).nextInt();
        if (num1 <= num2 && num1 >= num3 || num1 >= num2 && num1 <= num3  ) {
            return "Среднее число: " + num1;
        } else if (num2 <= num1 && num2 >= num3 || num2 >= num1 && num2 <= num3) {
            return "Среднее число: " + num2;

        } else {
            return "Среднее число: " + num3;
        }
    }
}
