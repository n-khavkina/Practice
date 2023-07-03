package Cycles;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        int sum =0;
        System.out.println("При вводе слагаемоего \"-1\" программа закончит последнее сложение и завершится");
        while (true){
            System.out.println("Введите слагаемое: ");
            int nextNum =  new Scanner(System.in).nextInt();
            sum+=nextNum;
            if(nextNum == -1){
                System.out.println(sum);
                break;
            }

        }
    }
}
