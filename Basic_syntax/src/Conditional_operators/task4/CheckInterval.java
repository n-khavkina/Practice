package Conditional_operators.task4;

import java.util.Scanner;

public class CheckInterval {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num3 = new Scanner(System.in).nextInt();
        System.out.println(checkInterval(num3));
    }
    static String checkInterval (int a) {
        String res = a >20 && a<50 ? "Число содержится в интервале от 20 до 50" :
                "Число не содержится в интервале от 20 до 50";
        return res;
    }
}
