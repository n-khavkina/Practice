package Cycles;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int num2 = scanner.nextInt();
        for (int i = 0; i < num1; i++){
            for (int j =0; j < num2; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
