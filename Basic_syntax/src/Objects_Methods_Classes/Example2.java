package Objects_Methods_Classes;

public class Example2 {
   public static double euroRate = 1.09; //курс евро по отношению к доллару
    public static void main(String[] args) {
        convert(12);

    }
    public static void convert(double euroCount) {
        double value = euroCount * euroRate;
        String result = String.format("%.2f", value); //форматирование для того,чтобы было 2 знака после точки
        System.out.println(result);

    }
}
