package Objects_Methods_Classes;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(multy(5,3));
        System.out.println(subt(10,4));
        System.out.println(div(9,3));

    }
    public static int sum (int a, int b){
        return a + b;
    }
    public static int multy (int x, int y){
        return x * y;
    }
    public static int subt (int m, int n){
        return m - n;
    }
    public static int div (int c, int d){
        return c / d;
    }

}
