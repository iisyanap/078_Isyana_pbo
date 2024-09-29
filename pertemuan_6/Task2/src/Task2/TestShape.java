package Task2;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape class
        System.out.println("Testing Shape class:");
        Shape shape1 = new Shape();
        System.out.println(shape1);  // Output: A Shape with color of green and filled
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);  // Output: A Shape with color of blue and Not filled

        // Test Circle class
        System.out.println("\nTesting Circle class:");
        Circle circle1 = new Circle();
        System.out.println(circle1);  // Output: A Circle with radius=1.0, which is a subclass of A Shape with color of green and filled
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2);  // Output: A Circle with radius=2.5, which is a subclass of A Shape with color of green and filled
        Circle circle3 = new Circle(3.5, "red", false);
        System.out.println(circle3);  // Output: A Circle with radius=3.5, which is a subclass of A Shape with color of red and Not filled
        System.out.println("Area of circle3: " + circle3.getArea());
        System.out.println("Perimeter of circle3: " + circle3.getPerimeter());

        // Test Rectangle class
        System.out.println("\nTesting Rectangle class:");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);  // Output: A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of green and filled
        Rectangle rectangle2 = new Rectangle(2.0, 4.0);
        System.out.println(rectangle2);  // Output: A Rectangle with width=2.0 and length=4.0, which is a subclass of A Shape with color of green and filled
        Rectangle rectangle3 = new Rectangle(2.0, 5.0, "yellow", true);
        System.out.println(rectangle3);  // Output: A Rectangle with width=2.0 and length=5.0, which is a subclass of A Shape with color of yellow and filled
        System.out.println("Area of rectangle3: " + rectangle3.getArea());
        System.out.println("Perimeter of rectangle3: " + rectangle3.getPerimeter());

        // Test Square class
        System.out.println("\nTesting Square class:");
        Square square1 = new Square();
        System.out.println(square1);  // Output: A Square with side=1.0, which is a subclass of A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of green and filled
        Square square2 = new Square(2.5);
        System.out.println(square2);  // Output: A Square with side=2.5, which is a subclass of A Rectangle with width=2.5 and length=2.5, which is a subclass of A Shape with color of green and filled
        Square square3 = new Square(3.5, "purple", false);
        System.out.println(square3);  // Output: A Square with side=3.5, which is a subclass of A Rectangle with width=3.5 and length=3.5, which is a subclass of A Shape with color of purple and Not filled
        System.out.println("Area of square3: " + square3.getArea());
        System.out.println("Perimeter of square3: " + square3.getPerimeter());

        // Test set and get methods
        System.out.println("\nTesting set and get methods:");
        square3.setSide(5.0);
        System.out.println("Updated square3: " + square3);
        square3.setColor("black");
        square3.setFilled(true);
        System.out.println("Updated square3 with new color and filled status: " + square3);
    }
}
