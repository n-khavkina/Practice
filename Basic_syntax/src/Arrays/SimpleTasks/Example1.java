package Arrays.SimpleTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //Создать и заполнить массив из 10 чисел значениями от 1 до 10
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i:array1){
            System.out.println(i);
        }
        //Создать и заполнить массив из 10 чисел значениями от 10 до 1
        int[] array2 = new int[10];
        int value1 = 1;
        for (int i = array2.length - 1; i >= 0; i--) {
            array2[i] = value1;
            value1++;
        }
//        System.out.println(Arrays.toString(array2));
        //Создать и заполнить массив из 10 чисел значениями от 29 до 20
        int[] numbers = new int[10];
        int value2 = 29;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value2;
//            System.out.println(numbers[i]);
            value2--;
        }

        //Ввести 5 строк с клавиатуры и записать их в массив
        String[] stringArray = new String[5];
        for (int i = 0; i<stringArray.length;i++){
            stringArray[i] = new Scanner(System.in).nextLine();
        }
        System.out.println(Arrays.toString(stringArray));

        //Создать массив и заполнить его на 5 чисел использую быструю (статическую) инициализацию.
        //Посчитать сумму элементов + вывести это всё в консоль

        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
       System.out.println(sum);

        //Создать массив и заполнить его на 5 чисел использую быструю (статическую) инициализацию.
        //Найти минимальный элемент + вывести это всё в консоль
        int[] num2 = {8, 206, 15, -7, 85};
        int min = num2[0];
        for (int i = 1; i < num2.length; i++){
            if(num2[i]<min){
                min = num2[i];
            }
        }
        System.out.println(min);

    }
}

