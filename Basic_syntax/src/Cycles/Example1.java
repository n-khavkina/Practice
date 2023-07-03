package Cycles;

public class Example1 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        System.out.println("--------------------------");
        count = 10;
        while (count>=1){
            System.out.println(count);
            count--;
        }
    }
}
