package Variables;

public class Example1 {
    public static void main(String[] args) {
        int age = 20;
        double temperature = 20.5;
        String name = "Нина";
        boolean isRaining = false;
        char grade = '5';

        System.out.println("Меня зовут " + name +"\n"+
                "и мне " + age + " лет.\n" +
                "Я считаю, что моя оценка " + grade + "/5.\n" +
                "В Петербурге сейчас " + temperature + " градусов тепла.\n" +
                "Осадки в данный момент: " + isRaining);


    }
}
