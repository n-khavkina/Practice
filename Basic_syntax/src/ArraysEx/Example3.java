package ArraysEx;

public class Example3 {
    public static void main(String[] args) {
        //Создать трехмерный массив, используя статическую инициализацию, вывести его в консоль
        int[][][] array = {{{2}}, {{2, 3}, {1,2,3}}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println("-------------------------");

        }
    }

}
