package Task2;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super(); // Panggil konstruktor Shape tanpa argumen
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super(); // Panggil konstruktor Shape tanpa argumen
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Panggil konstruktor Shape dengan parameter
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
