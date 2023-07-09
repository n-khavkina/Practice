package Conditional_operators.task3;

import java.util.Scanner;

public class ActionsNum {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(actionsNum(num2));
    }
    static int actionsNum(int a) {
        int res = a > 0 ? a * 2 : a + 10;
        return res;
    }
}
