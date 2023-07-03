package ArraysEx;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int [][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j < array[i].length; j++){
                array [i][j] = 8;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
            }
        }



