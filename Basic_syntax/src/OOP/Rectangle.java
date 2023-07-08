package OOP;

public class Rectangle extends Shape {
    double length, height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    double areaCalculations() {
        double s= length * height;
        return s;
    }
}
