package Cycles;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = Integer.parseInt(scanner.next());

        int word =0;
        while (word < count) {
            System.out.println(input);
            word++;
        }
    }
}
