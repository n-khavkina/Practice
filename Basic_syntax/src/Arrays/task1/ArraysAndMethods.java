package Arrays.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndMethods {
    public static void main(String[] args) {
        int [] array = initializeArray();
        System.out.println(Arrays.toString(array));
        int maxValue = max(array);
        System.out.println("Максимальное значение: " + maxValue);
    }
    static int[] initializeArray(){
        int [] num = new int[5];
        for (int i=0; i<num.length;i++){
            System.out.println("Введите число: ");
            num[i] = new Scanner(System.in).nextInt();
        }
        return num;
    }

    static int max(int[] array){
        int max = array [0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}
