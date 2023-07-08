package OOP;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double areaCalculations() {
        double s = Math.PI*radius;
        return s;
    }
}
