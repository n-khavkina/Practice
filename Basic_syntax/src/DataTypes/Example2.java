package DataTypes;

public class Example2 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;

        System.out.println("number 1: " + number1);
        System.out.println("number 2: " +number2);
        System.out.println("number 3: " +number3);

        int number4 = number1;
        number1 = number2;
        number2 = number3;
        number3 = number4;

        System.out.println("-----------------------------------------");
        System.out.println("number 1: " + number1);
        System.out.println("number 2: " +number2);
        System.out.println("number 3: " +number3);
    }
}
