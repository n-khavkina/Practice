package Conditional_operators.task1;

import java.util.Scanner;

public class MinMaxAvg {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Команда для выхода из цикла - stop");
            System.out.println("Выберете команду: min, max или avg");
            String input = new Scanner(System.in).next();
            if (input.equals("stop")){
                System.out.println("Работа программы завершена");
                break;
            }
            switch (input) {
                case "min":
                    minNumber();
                    break;
                case "max":
                    maxNumber();
                    break;
                case "avg":
                    averageNumber();
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;

            }
        }
    }

    static void minNumber() {
        System.out.println("Введите первое число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();
        if (num1 <= num2) {
            System.out.println("Минимальное число: " + num1);
        } else {
            System.out.println("Минимальное число: " + num2);
        }
    }

    static void maxNumber() {
        System.out.println("Введите первое число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();
        if (num1 >= num2) {
            System.out.println("Максимальное число: " + num1);
        } else {
            System.out.println("Максимальное число: " + num2);
        }
    }

    static void averageNumber() {
        System.out.println("Введите первое число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Введите третье число: ");
        int num3 = new Scanner(System.in).nextInt();
        if (num1 <= num2 && num1 >= num3 || num1 >= num2 && num1 <= num3  ) {
            System.out.println("Среднее число: " + num1);
        } else if (num2 <= num1 && num2 >= num3 || num2 >= num1 && num2 <= num3) {
            System.out.println("Среднее число: " + num2);

        } else {
            System.out.println("Среднее число: " + num3);
        }
    }
}
