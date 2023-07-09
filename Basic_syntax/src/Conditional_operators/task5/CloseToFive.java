package Conditional_operators.task5;

import java.util.Scanner;

public class CloseToFive {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num4 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num5 = new Scanner(System.in).nextInt();
        closeToFive(num4, num5);
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
