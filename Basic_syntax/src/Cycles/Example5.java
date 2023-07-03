package Cycles;

public class Example5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int length = 0;
        while (length<a){
            int width =0;
            while (width < b){
                System.out.print(" P ");
                width++;
            }
            System.out.println();
            length++;

        }

    }
}
