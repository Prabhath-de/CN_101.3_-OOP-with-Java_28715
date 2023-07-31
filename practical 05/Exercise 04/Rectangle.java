public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method to calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}
