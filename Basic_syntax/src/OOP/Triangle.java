package OOP;

public class Triangle extends Shape {
    double baseLength, height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    double areaCalculations() {
        double s = 0.5 * baseLength * height;
        return s;
    }
}
