package PackageTasks.MathEx;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        System.out.println(calculator.multiply(num1, num2));
        System.out.println(calculator.subtract(num2, num1));
    }
}
