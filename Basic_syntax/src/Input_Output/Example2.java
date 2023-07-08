package Input_Output;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введите желаемую зарплату в долларах: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число: ");
        int number2 = new Scanner(System.in).nextInt();

        if (number2 >= 5) {
            System.out.println(name + " будет получать " + number1 + "$ через " + number2 + " лет.");
        }else if(number2 >=2 && number2<=4){
            System.out.println(name + " будет получать " + number1 + "$ через " + number2 + " года.");
        }else {
            System.out.println(name + " будет получать " + number1 + "$ через " + number2 + " год.");

        }
    }
}
