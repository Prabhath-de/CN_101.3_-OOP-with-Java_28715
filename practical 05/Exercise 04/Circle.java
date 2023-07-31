public class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
