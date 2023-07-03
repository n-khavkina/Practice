package Conditional_operators;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println(compare(num1));

//        System.out.println("Введите число: ");
//        int num2 = new Scanner(System.in).nextInt();
//        System.out.println(actionsNum(num2));
//
//        System.out.println("Введите число: ");
//        int num3 = new Scanner(System.in).nextInt();
//        System.out.println(checkInterval(num3));
//
//        System.out.println("Введите первое число: ");
//        int num4 = new Scanner(System.in).nextInt();
//        System.out.println("Введите второе число: ");
//        int num5 = new Scanner(System.in).nextInt();
//        closeToFive(num4, num5);

    }

    static String compare(int a) {
        String res;
        if (a != 5) {
            res = a < 5 ? "Число меньше 5" : "Число больше 5";
        } else
            res = "Число равно 5";
        return res;
    }

    static int actionsNum(int a) {
        int res = a > 0 ? a * 2 : a + 10;
        return res;
    }
    static String checkInterval (int a) {
        String res = a >20 && a<50 ? "Число содержится в интервале от 20 до 50" :
                "Число не содержится в интервале от 20 до 50";
        return res;
    }
    static void closeToFive(int a, int b){
        int diffA = Math.abs(5 - a); //разница между 5 и числом а без учёта знака
        int diffB = Math.abs(5 - b); //разница между 5 и числом b без учёта знака
        if(diffA < diffB){
            System.out.println(a + " ближе к 5");
        }else {
            System.out.println(b + " ближе к 5");
        }
    }

}
