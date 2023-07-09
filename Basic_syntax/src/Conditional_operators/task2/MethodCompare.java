package Conditional_operators.task2;

import java.util.Scanner;

public class MethodCompare {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println(compare(num1));
    }
    static String compare(int a) {
        String res;
        if (a != 5) {
            res = a < 5 ? "Число меньше 5" : "Число больше 5";
        } else
            res = "Число равно 5";
        return res;
    }
}
