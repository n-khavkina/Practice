package ArraysEx;

import java.util.Scanner;

public class JavaRushMultiArray {
    /*1. Создать двумерный массив
      2. Проинициализировать массив вводом с консоли (n - количество строк, m - количество элементов в строке).
      3. Записать в каждый элемент двумерного массива 1
      4. Вывести массив в консоль
     */
    static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в таблице");
        int n = Integer.parseInt(scanner.nextLine());
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println("Введите количество элементов в " + (i + 1) + " строке");
            int m = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[m];
        }
        System.out.println("Вывод: ");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = 1;
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }

    }

}



