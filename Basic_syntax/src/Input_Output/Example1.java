package Input_Output;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Введите желаемую зарплату в долларах в час: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Я буду зарабатывать " + n + "$ в час");

    }
}
