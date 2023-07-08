package OOP;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes={new Rectangle(4, 8), new Circle(3), new Triangle(6,3)};
        double resRectangle = shapes[0].areaCalculations();
        double resCircle = shapes[1].areaCalculations();
        double resTriangle = shapes[2].areaCalculations();

        System.out.println(resRectangle + "\n" + resCircle + "\n" + resTriangle);
    }
}
